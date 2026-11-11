# Prometheus

**À quoi ça sert ?** c'est un outil de monitoring qui permet de collecter, stocker et interroger des métriques sous forme de séries temporelles (des valeurs enregistrées au fil du temps), comme l'utilisation du CPU, de la mémoire ou les performances des applications.

**Dans Collector :** on utilise Prometheus avec Coroot pour stocker les métriques collectées par le node-agent et suivre l'état de nos microservices déployés sur Kubernetes. Coroot exploite ensuite ces données pour afficher des graphiques et nous aider à détecter des anomalies.