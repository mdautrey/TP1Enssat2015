# TP1 Enssat2015
TP1 Enssat 2015
## Démarrage
### Vérifications de la configuration de votre poste de travail

Vérifier que Maven est bien installé sur votre poste de travail.

* Où la repository maven se trouve-t-elle ?
* Quelle version de Maven utilisez-vous ?

Vérifier que votre IDE ou votre éditeur préféré est bien installé sur votre machine

* Quel éditeur employez-vous ?
* Votre éditeur sait-il gérer la coloration syntaxique, etc... pour Java ?

Vérifier que Git est également disponible

* Quelle version de Git utilisez-vous ?
* Vos préférences sont-elles configurées ? Si oui, dans quel fichier et quelles sont-elles ? (adresse mail, etc...)

Vérifier que votre poste de travail comporte un JDK. 

* Quel est le chemin vers ce JDK ?
* Quelle version de Java utilisez-vous ?

### Culture générale
Lire la page Wikipedia de Spring (https://fr.wikipedia.org/wiki/Spring_(framework) )

* A quoi sert et comment fonctionne l'inversion de contrôle ?
* Qu'est ce que la programmation orientée Aspect ?


## Premier exemple
Tester un premier exemple proposé par Spring (http://spring.io/guides/gs/consuming-rest/)

En s'inspirant de cet exemple, développer une application accessible en ligne de commande qui permette de visualiser les
prévisions météorologiques pour un endroit :

- Invite de commande pour saisir le nom d'une ville
- Saisie du nom d'une ville
- Affichage des données pour cette ville
- Compilation, test

API REST pour l'interrogation du temps :

- http://api.openweathermap.org/data/2.5/weather?q=Patri,fr
- http://openweathermap.org/current#name
## Corrigé
### Première solution

- Dans votre répertoire github, faire un fork du projet spring (https://github.com/spring-guides/gs-consuming-rest)
- Faire un clone local de ce répertoire (git clone .... ) sur votre machine
- Tester le code
- Le modifier pour remplir les objectifs du TP

Nota : on travaille de cette manière sur tous les projets Open Source :

- Fork
- Clone

Lorsque vous êtes satisfait de votre travail sur votre machine, vous le remontez dans votre repository Git en utilisant 
la commande git pull . Vous faites ensuite un pull request au gestionnaire du projet 
(voir https://help.github.com/articles/using-pull-requests/ ) 

### Deuxième solution

Vous reprenez le code à votre compte progressivement en l'adaptant (pour éviter de trainer l'héritage de l'example).

- Créer un pom.xml (fichier makefile de maven)
- Copier coller le maven de l'exemple fourni par Spring
- Créer les différents fichiers Java

Pour supprimer les logs, deux solutions possibles

1- Ajouter un fichier application.properties (qui doit se trouvert dans le répertoire à partit duquel on lance
la commande java pour exécuter l'application
2- Ajouter un répertoire resources et un fichier de configuration application.yml (plus efficace et approche plus
moderne que la précédente)
