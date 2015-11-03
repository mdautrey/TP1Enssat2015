# Indices pour réaliser le TP3

## Plan d'actions

Nous supposons que vous avez réalisé le setup de votre environnement tutum lors du précédent 
Nous vous proposons le plan d'action suivant :

- Commencer par tester l'exemple fourni par tutum
- Une fois que cet exemple fonctionne, transposer ce que l'on a appris dans l'exemple à l'application ENSSAT2015

## Test de l'exemple fourni par tutum

Le tutoriel se trouve à l'adresse suivante : http://blog.tutum.co/2014/12/08/deploying-a-java-application-with-docker-and-tutum/ 

Nous traitons le deuxième exemple qui correspond à notre situation : déploiement d'une application spring. Le code source complet de l'exemple se trouve ici : https://bitbucket.org/ggtools/tutum-java-tutorial/src/42c9827ee3ec8bd6ce8531b5d63db72a3df69d03/Spring/

Astuces :

- pour voir la liste des images docker présentes sur votre machine : docker images
- la console web tutum vous permet de visualiser les logs et les éventuelles erreurs affectant le déploiement

## Résultat du test des exemples, marche à suivre pour finaliser les tests

Il s'avère que ces exemples sont plus complexes à configurer qu'il n'y parait a priori. En particulier, si l'on rétrograge en version vers Java 7, des problèmes de compatibilité apparaissent au niveau des annotations spring,
dont la résolution  n'est pas évidente. Nous vous suggérons donc de faire machine arrière et de tester l'exemple fourni par spring : http://spring.io/guides/gs/spring-boot-docker/

Il s'avère que cet exemple fonctionne y compris si l'on rétrograde vers java 7.

La marche à suivre pour tester cet exemple :

1- Vérifier l'installation ou installer les composants suivants sur votre machine :

- Docker (sous ubuntu, le package correspondant est docker.io)
- Maven >= 3
- Java >= 1.7

2- Cloner la repository git de l'exemple

3- Modifier les fichiers de configuration en fonction de votre configuration locale (java 7 ou java 8)

4- Modifier le fichier docker en fonction de votre configuration java (7 ou 8). Le fichier docker se trouve dans ../src/main/docker/Dockerfile

5- Modifier le fichier pom pour tagger la machine docker que vous créez en tutum.co/votrelogintutum/nommachine (vous pouvez vous inspirer du fichier pom fourni par tutum pour réaliser cette opération)

6- Lancer le build : mvn clean package

7- Se logger via docker au service tutum : docker login tutum.co

8- Lancer l'export de la machine vers tutum (docker push tutum.co/votrelogintutum/nommachine )

9- Une fois l'export complété, aller sur le site tutum et lancer la création du container et le déploiement de l'application depuis l'onglet repository

10- paramètres à prendre en compte lors du démarrage :

- Ajouter l'ouverture du port 8080 vers un port dynamique externe

11- Une fois l'application lancée, aller dans l'onglet services, cliquer sur le container, puis cliquer sur endpoints, vous trouverez un lien direct pour ouvrir la page web produite par l'application

Lorsque vous aurez réalisé l'ensemble de ces opérations, vous serez prêt pour modifier l'application du TP et l'installer dans docker !


## Version simplifiée du TP

Compte tenu de la complexité des opérations ci-dessus, pour permettre à ceux qui n'iront pas jusqu'au bout de la configuration 
de voir concrétement fonctionner docker, nous avons réalisé les étapes de build et de publication pour vous. Nous avons publié
l'image docker correspondante dans une repository publique sur hub.docker.com

L'image docker se trouve à l'URL https://hub.docker.com/r/mdautrey/gs-docker/

Pour l'installer et la tester dans votre environnement tutum, vous devez réaliser les opérations suivantes :

- Créer un compte sur hub.docker.com
- Dans la console web tutum, aller dans l'onglet Repositories
- Cliquer sur Add from a third party registry
- Pointer vers la repository indiquée ci-dessous
- Suivre le processus proposé par tutum sans oublier de créer un endpoint externe
 
 Ce dernier exemple achève donc cette session de TP 2015.

Nous espérons que vous avez été intéressé par ces exemples et que votre compréhension de l'ensemble est suffisante pour réussir au test d'évaluation dont nous allons vous transmettre le lien par mail.

Bonne chance dans la suite de vos études et dans votre travail!


