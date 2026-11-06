# Trivy

**À quoi ça sert ?** Permet de rechercher des vulnérabilités dans les dépendances Java.

**Dans Collector :** Nous l’utilisons pour qu'il check les dépendances Maven de notre backend. Si une vulnérabilité HIGH ou CRITICAL est détectée, notre pipeline GitHub Actions échoue.
