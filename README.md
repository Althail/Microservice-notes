# Microservice Notes / Commentaires
<img src="https://github.com/Althail/Microservice-notes/assets/93679283/737ce687-528e-4853-b505-52a20504523f"  width="300" height="300">

## Description

Notre API permet de mettre un système de notation et de commentaires sur différents facteurs telles que les vendeurs, les commandes ou d'autres encore.

## Fonctionnalités

- Les utilisateurs peuvent attribuer une note aux vendeurs sur une échelle de 1 à 5 étoiles. (⭐ ~ ⭐⭐⭐⭐⭐)
- Les utilisateurs peuvent laisser des commentaires pour fournir des retours supplémentaires sur leur expérience. (💬)
- Une documentation détaillée et des exemples de code facilitent l'intégration. (📚)

## Pré-requis
- Java 17 au minimum


## Installation et Démarrage

- Clonez ce projet avec commande : `git clone https://github.com/Althail/Microservice-notes.git.`
- Ouvrez le dossier cloné sur votre IDE préféré de Java.
- Vous pouvez regarder le `pom.xml` pour voir les packages nécessaires sur ce projet.

## Exemple d'usage 

```
// GET /Avis/ :
{
  "avis": [
    {
      "id": 1,
      "comment": "Je suis plutôt satisfait du produit.",
      "id_user": 1
      "note": 4,   
    },
    {
      "id": 2,
      "comment": "Le produit est plutôt décevant.",
      "id_user": 2
      "note": 2,
    },
    {
      "id": 3,
      "comment": "Le produit est immonde et ne respecte pas du tout ce que j'ai acheté.",
      "id_user": 3
      "note": 1, 
    }
  ]
}
```
