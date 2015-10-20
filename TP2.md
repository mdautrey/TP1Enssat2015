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

Une solution basique pour la première partie du TP est fournie sur github https://github.com/mdautrey/TPEnssat2015/commits/master (Commit : 2a0946c9d5df1685361a28cb98dec4eb0123ea52).

- Que pensez-vous de l'organisation du contrôleur WeatherController ? 
- Quelle solution envisageriez-vous pour découpler le contrôleur et le client REST ? 

Testez le code en l'exécutant (mvn clean install puis java -jar target/... .jar) . 

Le correcteur a oublié un bug. 

- A quel endroit se trouve-t-il ? 
- Corrigez-le. 

Se rendant compte du problème de conception,le correcteur essaie de supprimer le couplage entre le contrôleur et le client REST. Il
décidé donc d'utiliser le mécanisme d'injection de dépendance proposé par Spring. Après avoir testé l'ensemble, il publie son code
sur github. Faites un checkout du commit correspondant (c743e3f495770c734aa7b7806f46959b3b4ddbc4). 

- Localisez l'injection de dépendance. 
- Etudiez son fonctionnement. 
- Justifiez/expliquez sa présence. 

Pensez-vous que ce soit une bonne solution ? Quelle solution d'architecture envisageriez-vous pour remplacer cette injection ?

Testez le code. Compléter le template viewweather.html afin d'afficher plus de champs de l'object WeatherForecast.

### TP2 : poursuite des travaux

Poursuivre le TP en réalisant les exemples concernant Twitter.

### TP2 : corrigé de la deuxième partie / partie 1 (twitter)

La fonctionnalité demandée comporte deux problématiques techniques :

1 Se connecter et envoyer des messages sur Twitter
2 Détecter les appels au service de météo pour déclencher les envois twitter (le cross-cut concern qui fait l'objet de la programmation orientée Aspect)

Nous réalisons donc le projet en trois étapes, la première consistant à tester la partie twitter, la deuxième à réaliser le cross-cut et la troisième à intégrer le tout dans notre solution cible.

Pour réaliser la partie Twitter :

- Suivre le tutoriel proposé par Spring (http://spring.io/guides/gs/register-twitter-app/)
- Télécharger et tester ensuite l'exemple forké de l'exemple spring (https://github.com/mdautrey/gs-register-twitter-app)

Quelles sont les modifications nécessaires pour que l'exemple modifié fonctionne ?
Nous avons décidé d'utiliser une librairie externe à Spring pour développer cette exemple plus rapidement. De quelle librairie s'agit-il ? Visiter le lien en commentaire dans le code pour comprendre le fonctionnement de l'exemple.

### TP2 : test de la programmation orientée Aspect


### TP2 : wrap up


