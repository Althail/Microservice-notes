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

```
// GET /Avis/user/{id_user} 

{
  "avis": [
    {
      "id": 4,
      "content": "Service client correcte.",
      "note": 3
    },
    {
      "id": 5,
      "content": "Produit excellent.",
      "note": 5
    }
  ]
}
```

```
// GET /avis/{id}

{
  "id": 5,
  "content": "Le produit est parfait et la livraison était très rapide.",
  "note": 5,
  "id_user": 6
}
```

```
// POST /Avis/

// Demande : "HEADER" : Token

{
  "content": "Service décevant",
  "note": 2
  "num_commande": "EZADIJOKIDA015"
} 

// Réponse Body :
{
  "id": 6,
  "content": "Service catastrophique le personnel était désagréable.",
  "note": 1
}
```

```
// PUT /avis/{id}

// Demande : "HEADER" : Token

{
  "content": "Nouvelle description",
  "note": 3
} 

// Réponse Body :
{
  "id": 7,
  "titre": "Nouveau titre",
  "description": "Nouvelle description",
  "note": 3
}
```

```
// DELETE /avis/{id}

// Demande : "HEADER" : Token

// Réponse :
{
  "message": "L'avis avec l'id 7 a été supprimé avec succès."
}
```
