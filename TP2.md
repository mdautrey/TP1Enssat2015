# TP2 : modèle / vue / contrôleur

## Fin du TP1

- Faire un fork du TP
- Clone local
- Parcourir le code + lire les commentaires
- Compléter le code de l'objet WeatherForecast

## TP2

Réaliser les exemples suivants :

- Gérer la soumission d'un formulaire web : http://spring.io/guides/gs/handling-form-submission/
- Enregistrer une application avec Twitter : http://spring.io/guides/gs/register-twitter-app/
- Utiliser les mécanismes de programmation orientée aspect : https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-aop

En s'appuyant sur le premier exemple, créer un formulaire web pour demander à l'utilisateur un code pays et une ville 
et lui afficher la météo de la ville en question en réutilisant le code du TP1

S'inspirer des exemples 2 et 3 pour émettre un twitt à chaque fois qu'un utilisateur demande la météo

Enfin, réaliser l'exemple de validation des données d'un formulaire web (http://spring.io/guides/gs/validating-form-input/). 
A partir de cet exemple, ajouter des règles de validation au formulaire précédent.

http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/mvc.html

### TP2 : corrigé de la première partie

Une première solution de cette première partie du TP est proposée sur github https://github.com/mdautrey/TPEnssat2015/commits/master (Commit : 2a0946c9d5df1685361a28cb98dec4eb0123ea52).
Que pensez-vous de l'organisation du contrôleur WeatherControleur ? Quelle solution envisageriez-vous pour découpler le contrôleur et la mécanique propre à la requête REST ? 

Testez le code. Le correcteur a oublié un bug. A quel endroit se trouve-t-il ? Corrigez-le. 

Pour supprimer le couplage entre le contrôleur et le client webservice, le correcteur a décidé d'utiliser le mécanisme d'injection de dépendande proposé par Spring.
Faites un checkout du commit correspondant ( ).  Localisez-l'injection de dépendance. Etudiez son fonctionnement. Justifiez/expliquez sa présence. Quelle solution 
d'architecture envisageriez-vous pour remplacer cette injection ?

Testez le code. Compléter le template viewweather.html afin d'afficher plus de champs de l'object WeatherForecast.

### TP2 : poursuite des travaux

Poursuivre le TP en réalisant les exemples concernant Twitter.


