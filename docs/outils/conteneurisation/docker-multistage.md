# Docker Multistage

**À quoi ça sert ?** Permet de construire une image Docker en plusieurs étapes, pour éviter de garder les outils de compilation dans l'image finale.

**Dans Collector :** On utilise une première image avec Java 21 JDK pour compiler notre backend, puis une deuxième image avec Java 21 JRE sur Alpine pour exécuter uniquement notre application.

L'application est lancée avec un utilisateur non-root (10001) pour limiter ses privilèges.