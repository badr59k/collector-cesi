# Argo CD

**À quoi ça sert ?** c'est un outil GitOps qui surveille les configurations Kubernetes présentes dans Git et les synchronise avec le cluster pour maintenir l'état souhaité.

**Dans Collector :** on utilise Argo CD pour surveiller les manifests Kubernetes de notre branche main sur GitHub. Lorsqu'une Pull Request de déploiement est validée et fusionnée, Argo CD synchronise automatiquement les nouvelles configurations avec notre cluster, sans devoir lancer manuellement kubectl apply.
