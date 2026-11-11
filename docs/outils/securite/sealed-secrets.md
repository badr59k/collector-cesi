# Sealed Secrets

**À quoi ça sert ?** c'est un outil Kubernetes qui permet de chiffrer des Secrets afin de pouvoir les conserver dans un dépôt Git sans exposer leurs valeurs en clair. Un contrôleur installé dans le cluster les déchiffre pour créer les Secrets Kubernetes nécessaires.

**Dans Collector :** on utilise Sealed Secrets pour protéger les informations sensibles nécessaires à nos services, notamment les identifiants de PostgreSQL. Les secrets chiffrés sont versionnés avec nos manifests Kubernetes, puis déchiffrés uniquement par le contrôleur disposant de la clé privée.
