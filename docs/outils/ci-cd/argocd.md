# Argo CD

**À quoi ça sert ?** outil GitOps qui surveille les configurations Kubernetes dans Git et les synchronise avec le cluster.

**Dans Collector :** il surveille notre branche main sur GitHub et nous permet de déployer les modifications sur Kubernetes sans utiliser kubectl apply, grâce à une synchronisation manuelle.
