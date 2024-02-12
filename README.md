# Brief_2
## Contexte du projet

### Partie 1 (Java OOP) :
- En tant que développeur back-end, vous devez créer une application console Java simulant les poupées russes de différentes tailles, connues sous le nom de "les poupées russes". Chaque poupée doit avoir une taille donnée, peut s'ouvrir ou se fermer, peut contenir une autre poupée et être contenue dans une autre poupée.

### Classe de Base : Poupee
- La classe Poupee représente la base de la hiérarchie. Elle encapsule les propriétés communes à toutes les poupées.

- La classe Poupee doit avoir un constructeur permettant d'initialiser une poupée avec une taille donnée.

- Les propriétés (taille, ouverte) doivent être encapsulées et accessibles via des méthodes d'accès.

- La classe Poupee doit avoir les méthodes abstraites suivantes :
\*\* void ouvrir(): Ouvre la poupée. 

\*\* void fermer(): Ferme la poupée. 

\*\* void placerDans(Poupee p): Place la poupée courante dans la poupée p. 

\*\* void sortirDe(Poupee p): Sort la poupée courante de la poupée p.
### Classe Concrète : PoupéeRusse
- La classe PoupéeRusse hérite de la classe de base Poupee et implémente les méthodes spécifiques.

- Le constructeur de la classe PoupéeRusse doit appeler le constructeur de la classe de base.

- Les méthodes ouvrir, fermer, placerDans et sortirDe doivent être implémentées pour respecter les spécifications de la classe de base.

### Bonus : Ajout de la fonctionnalité de coloration des poupées russes.

- Ajoutez une méthode colorer(String couleur) à la classe PoupéeRusse qui permet de spécifier une couleur pour la poupée russe.

- Assurez-vous de stocker la couleur de la poupée et de la rendre accessible via une méthode d'accès.

- Permettez à la méthode afficher() de la classe PoupéeRusse d'afficher la couleur de la poupée en plus de ses autres propriétés.

- Testez cette fonctionnalité en créant des instances de PoupéeRusse avec différentes couleurs et en les affichant.

## Comment exécuter l'application

1. Assurez-vous d'avoir une version récente de Java installée.
2. Clonez ce dépôt : `https://github.com/manbarmohamed/Brief_2.git`
3. Naviguez vers le répertoire du projet : `cd Brief_2`
4. Compilez le code : `javac Main.java`
5. Exécutez l'application : `java Main`

## Contribution

Les contributions sous forme de suggestions d'amélioration, signalement de bugs ou de nouvelles fonctionnalités sont les bienvenues. Merci de contribuer à rendre cette application encore meilleure!

## Auteurs
Ce projet a été développé par [Manbar Mohamed], sous la supervision de l'école ENAA Béni Mellal.

## Contact
Pour toute question ou commentaire, veuillez contacter [manbar.mohammed@gmail.com] ou [+212 6 90 47 25 90].

