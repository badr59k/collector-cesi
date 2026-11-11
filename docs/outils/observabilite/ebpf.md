# eBPF

**À quoi ça sert ?** c'est une technologie du noyau Linux qui permet d'exécuter des programmes d'observation directement au niveau du système, sans avoir à modifier le code des applications surveillées.

**Dans Collector :** le node-agent de Coroot utilise notamment eBPF pour observer les processus, les ressources et les communications réseau de nos microservices Kubernetes. Cela nous permet de collecter des informations techniques sans devoir instrumenter manuellement chaque microservice.
