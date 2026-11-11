# Coroot

**À quoi ça sert ?** c'est un outil qui permet de surveiller le fonctionnement des applications, d'analyser les performances et de détecter des problèmes grâce aux métriques, aux logs et aux communications réseau.

**Dans Collector :** on utilise Coroot pour surveiller les micro-services déployés dans notre cluster K8s. Son node-agent collecte les informations grâce notamment à eBPF, tandis que Prometheus et ClickHouse participent au stockage des données d'observabilité. Nous pouvons ainsi suivre l'utilisation des ressources, la disponibilité des instances et les communications entre services.
