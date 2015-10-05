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

