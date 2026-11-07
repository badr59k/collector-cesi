# Cosign

**À quoi ça sert ?** Permet de signer et de vérifier cryptographiquement les images Docker afin de contrôler leur origine et leur intégrité.

**Dans Collector :** On utilise Cosign après la publication de notre image Docker sur GHCR.

La signature est réalisée en mode **keyless** grâce à l'identité OIDC de GitHub Actions. Pas besoin de clé privé permanente

Nous signons l'image à partir de son digest SHA-256, puis vérifions la signature en contrôlant l'identité de notre workflow GitHub Actions et son émetteur OIDC.
