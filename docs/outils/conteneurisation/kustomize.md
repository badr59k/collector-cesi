# Kustomize

**À quoi ça sert ?** c'est un outil qui permet de personnaliser des fichiers de configuration Kubernetes sans devoir les dupliquer. Il repose sur des configurations communes (base) et des adaptations propres à chaque environnement (overlays).

**Dans Collector :** on utilise Kustomize pour organiser les manifests Kubernetes de nos microservices et gérer leurs images Docker. Notre overlay local permet notamment de modifier les versions des images déployées sans modifier les fichiers de base.
