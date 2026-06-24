# approche-objet

Projet Java (Maven) — formation Diginamic, module approche objet.

## TP 01 — Créer et utiliser des classes

Objectif : créer des classes représentant des concepts (adresse, personne), les
instancier et comprendre la notion de **visibilité** des attributs entre packages.

## Prérequis

- JDK 21
- Maven (build géré par le `pom.xml`)

## Structure

```
src/main/java/
├── entites/
│   ├── AdressePostale.java     # 4 attributs : numeroRue, libelleRue, codePostal, ville
│   ├── TestAdressePostale.java # main : crée 2 instances d'AdressePostale
│   └── TestPersonne.java       # main : crée 2 instances de Personne
└── entites2/
    └── Personne.java           # 3 attributs : nom, prenom, adressePostale
```

`Personne` a été déplacée dans le package `entites2` : pour accéder aux attributs
d'`AdressePostale` depuis un autre package, ceux-ci ont dû passer en `public`
(notion de visibilité des attributs).

## Compilation et exécution

```bash
mvn compile
```

Exécuter une classe de test (exemple) :

```bash
java -cp target/classes entites.TestPersonne
```

## Prise de recul

Instancier une personne complète demande beaucoup de lignes (une affectation par
attribut, à répéter pour chaque objet) et n'oblige pas à renseigner tous les
attributs. Les **constructeurs** et l'**encapsulation** (attributs `private` +
getters/setters), vus ensuite, répondent à ces limites.
