# Syft

**À quoi ça sert ?** Permet de générer un SBOM (Software Bill of Materials), c'est-à-dire un inventaire des composants logiciels présents dans une application ou une image Docker.

**Dans Collector :** Nous utilisons Syft pour analyser l'image Docker de notre backend Spring Boot après son passage dans Trivy.

Le rapport est généré au format CycloneDX JSON, puis sauvegardé comme artifact dans GitHub Actions pendant 30 jours.
