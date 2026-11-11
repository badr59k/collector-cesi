# GitHub Container Registry (GHCR)

**À quoi ça sert ?** c'est un registre d'images de conteneurs proposé par GitHub. Il permet de stocker, versionner et distribuer des images Docker.

**Dans Collector :** notre pipeline GitHub Actions construit les images Docker de nos microservices, les contrôle puis les publie sur GHCR. Kubernetes peut ensuite récupérer les images correspondant aux versions validées pour les déployer dans le cluster.
