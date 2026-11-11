# GitOps

**À quoi ça sert ?** c'est une approche de déploiement dans laquelle Git sert de source de vérité pour la configuration de l'infrastructure et des applications. Un outil compare l'état réel du système avec l'état déclaré dans Git et applique les changements nécessaires.

**Dans Collector :** on utilise GitOps avec Argo CD. Après la validation du code, notre pipeline propose une Pull Request pour mettre à jour la version de l'image Docker dans les manifests Kubernetes. Une fois cette PR fusionnée dans main, Argo CD synchronise automatiquement les changements avec notre cluster.
