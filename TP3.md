# TP3 : l'informatique dans le cloud - dockerisation de l'application
## Introduction

Vous trouverez une introduction à docker ici : https://docs.docker.com/introduction/understanding-docker/

Parcourez le document mais n'y passez pas trop de temps ! Les TPs sont d'abord destinés à tester des concepts éventuellement vus en cours magistral par ailleurs.

## Exemple de dockerisation proposé par Spring

Suivre le tutoriel http://blog.tutum.co/2014/12/08/deploying-a-java-application-with-docker-and-tutum/

Le tutoriel nécessite l'accès à une plateforme de type docker.

Deux solutions pour cela

- Installer docker en local sur votre machine
- Utiliser une version cloud de docker

Nous sommes partis sur la solution cloud en utilisant la plateforme expérimentale tutum et le cloud AWS. 

### Plan d'action pour l'installation de l'environnement docker sous tutum 

- Ouvrir un compte sur tutum ( http://www.tutum.co )
- Ouvrir un compte sur AWS ( http://aws.amazon.com/ )
- Relier les deux  ( https://support.tutum.co/support/solutions/articles/5000224910-link-your-amazon-web-services-account )
- Créer également un compte et une repository sur docker hub ( https://hub.docker.com/ )

"Link your Amazon Web Services, Digital Ocean, SoftLayer and/or Microsoft Azure account."

### Démarrage d'un node cluster docker sous tutum

- Déployer un premier node sur AWS
"A node is a Linux host/VM used to deploy and run your containers."

### Création d'un service

Créer un service dans tutum :
"A service is a group of containers from the same Docker repository. Services make it simple to scale your application across nodes."

### Build dans docker +  déploiement tutum

Pour savoir si docker est installé sur votre machine, tester : docker ps

Vous avez besoin d'une machine comportant docker pour réaliser le build de l'application. Si votre machine ne comporte pas docker, vous pouvez utiliser une mini-instance AWS pour réaliser le build :

- se connecter à AWS
- créer une instance ubuntu mini free tier
- laisser en accès 0.0.0.0 (penser à arrêter la machine à la fin du TP)
- se connecter à a mini instance en ssh après avoir récupéré votre clé ssh
- installer docker : sudo apt-get install docker.io
- ajouter l'utilisateur ubuntu au group docker (adduser ubuntu docker)
- redémarrer docker (sudo /etc/init.d/docker.io restart)
- tester la connexion à docker (docker.io)
- descendre l'application sur la machine (git clone de votre repository)


Vous devez ensuite réaliser un build compatible avec tutum. Voir le tutorial ici : http://blog.tutum.co/2014/12/08/deploying-a-java-application-with-docker-and-tutum/

Puis réaliser le déploiement du build sur tutum

## Application pratique

Installer l'application réaliser lors des TP1 et 2 dans docker via tutum




