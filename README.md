# approche-objet

Projet Java (Maven) — formation Diginamic, module approche objet.
Regroupe les TP guidés (banque, géométrie, entités) et les exercices d'autonomie.

## Prérequis

- JDK 21
- Maven (build géré par le `pom.xml`)

## Compilation et exécution

Compiler une fois :

```bash
mvn compile
```

Puis exécuter la classe voulue, par exemple :

```bash
java -cp target/classes fr.diginamic.banque.TestBanque
java -cp target/classes fr.diginamic.essais.TestOperations
java -cp target/classes geometrie.TestObjetGeometrique
```

## TP guidés

| Thème            | Packages / classes principales                                  | Classe à exécuter                    |
|------------------|-----------------------------------------------------------------|--------------------------------------|
| Classes & instances | `entites.AdressePostale`, `entites2.Personne`                | `entites.TestAdressePostale` / `entites.TestPersonne` |
| Méthodes static  | `utils.TestMethodeStatic`                                       | `utils.TestMethodeStatic`            |
| Banque (héritage, abstraction) | `fr.diginamic.banque.entites.Compte`/`CompteTaux`, `Operation`/`Credit`/`Debit` | `fr.diginamic.banque.TestBanque` / `fr.diginamic.banque.TestOperation` |
| Interfaces       | `geometrie.ObjetGeometrique` + `Cercle`/`Rectangle`             | `geometrie.TestObjetGeometrique`     |

## Exercices d'autonomie

| Exercice            | Classes principales (package `fr.diginamic`)                                   | Classe à exécuter             |
|---------------------|--------------------------------------------------------------------------------|-------------------------------|
| Operations          | `operations.Operations`                                                        | `essais.TestOperations`       |
| CalculMoyenne       | `operations.CalculMoyenne`                                                      | `essais.TestMoyenne`          |
| Theatre             | `entites.Theatre`                                                              | `essais.TestTheatre`          |
| ManipulationChaine  | `entites.Salarie`                                                              | `chaines.ManipulationChaine`  |
| Immobilier          | `maison.Piece` (abstraite) + `Chambre`/`Cuisine`/`Salon`/`SalleDeBain`/`WC` + `maison.Maison` | `essais.TestMaison` |
| CalculSalaire       | `salaire.Intervenant` (abstraite) + `salaire.Salarie` + `salaire.Pigiste`      | `essais.TestIntervenant`      |
| Combat              | `combat.Personnage`, `combat.Creature` (abstraite) + `Loup`/`Gobelin`/`Troll`, `combat.Potion` (abstraite) + `PotionSoin`/`PotionAttaqueMineure`/`PotionAttaqueMajeure`, `combat.Combat` | `combat.Jeu` |

Le jeu Combat inclut les parties facultatives : inventaire de potions (consommables
entre 2 combats via l'option 3 du menu) et récompenses aléatoires (50 % après un
combat gagné, taux réglable via `tauxRecompense` dans `Combat`).

## Notions du cours mises en œuvre

- **Encapsulation** : attributs `private`, accès via getters/setters (Compte, Theatre, Salarie…).
- **Méthode de classe (`static`)** : `Operations.calcul(...)`, `Integer.parseInt(...)`, `Double.parseDouble(...)`.
- **Association** : `Personne` contient une `AdressePostale`, `Maison` contient un `Piece[]`, `Combat` manipule `Personnage`/`Creature`.
- **Héritage** (`extends`, `super(...)`) : `CompteTaux`, pièces de la maison, intervenants, créatures.
- **Abstraction** (`abstract class` / méthode abstraite) : `Operation`, `Piece`, `Intervenant`, `Creature`.
- **Interfaces** : `ObjetGeometrique` implémentée par `Cercle` et `Rectangle`.
- **Polymorphisme** : un tableau `Compte[]`, `Operation[]`, `Intervenant[]` ou `Piece[]` qui contient des objets de classes filles.

## TP 12

**Recensement.csv** à mettre à la racine