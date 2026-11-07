# Trivy

**À quoi ça sert ?** Permet de rechercher des vulnérabilités connues dans les dépendances et les images Docker.

**Dans Collector :** Nous l’utilisons pour qu'il check les dépendances Maven de notre backend mais aussi notre image Docker après sa construction. Si une vulnérabilité HIGH ou CRITICAL est détectée, alors la pipeline GitHub Actions échoue.
