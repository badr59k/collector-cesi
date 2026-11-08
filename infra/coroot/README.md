# Coroot — Docker Desktop / WSL2

## Problème

Sur Docker Desktop / WSL2, le node-agent Coroot 1.38.1
ne parvient pas à lire le machine-id depuis
/proc/1/root/etc/machine-id.

Cela empêche Coroot d'associer correctement les métriques
au nœud Kubernetes docker-desktop.

## Correctif

Une image personnalisée ajoute un lien symbolique vers
le véritable fichier machine-id de l'hôte.

## Installation

### 1. Construire l'image

Depuis la racine du dépôt :

docker build -f infra/coroot/Dockerfile.node-agent -t collector-coroot-node-agent:1.38.1 .

### 2. Installer Coroot

helm repo add coroot https://coroot.github.io/helm-charts
helm repo update

helm install coroot-operator coroot/coroot-operator \
  --namespace coroot --create-namespace \
  --set rbac.denyGlobalSecrets=true

helm install coroot coroot/coroot-ce \
  --namespace coroot \
  -f infra/coroot/values-local.yaml

### 3. Vérifier

kubectl get pods -n coroot

kubectl logs -n coroot daemonset/coroot-node-agent

### 4. Accéder à Coroot

kubectl port-forward -n coroot svc/coroot-coroot 8086:8080

Interface : http://localhost:8086

## Remarques

- Configuration destinée au Kubernetes local de Docker Desktop.
- L'image doit être reconstruite sur un nouvel environnement.
- Le system-uuid peut rester indisponible sous WSL2.
- Ne pas modifier manuellement le DaemonSet géré par le Coroot Operator.
