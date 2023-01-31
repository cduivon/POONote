# Spring Web 

# lien du gitHub
# (ajouter le lien du git)


## Spring Web fournit des fonctionnalités d'intégration telles que la fonctionnalité de téléchargement de fichiers et l'initialisation du conteneur IoC à l'aide de récepteurs de servlets et d'un contexte d'application orienté web.
## Il contient également un client HTTP et les parties liées au Web du support à distance de Spring.


# Spring Data JPA

## Spring Data JPA permet de mettre en œuvre facilement des référentiels basés sur JPA.


# Validation (Hibernate)

## Bean Validation with Hibernate validator.


# H2 Database

## Fournit une base de données rapide en mémoire qui prend en charge l'API JDBC et l'accès R2DBC, avec un faible encombrement (2 mb).
## Supporte les modes embarqué et serveur ainsi qu'une application console basée sur un navigateur.


# Spring Boot DevTools

## Spring Boot Developer Tools


# Thymeleaf

## Starter pour la création d'applications web MVC à l'aide de vues Thymeleaf



# Etape 13

## 1)

### dans le @Get Mapping("/greeting')

## 2)

### le return greeting

## 3)

### à l'aide du nameGET



# Etape 17

## Une table address est apparue


# Etape 18

## La classe Address crée une table Address


# Etape 20

## Effectivement 2 lignes ont été ajoutées à la base


# Etape 22

## Il fait le lien entre le controller et son interface


# Etape 30

## J'ai créé un dossier fragment et un fichier navbar.html

## Dans ce fichier, j'ai ajouté une barre de navigation.

## Dans cette barre, je mets une liste de lien (ici 2) reliés à mes pages respectives

## Dans les liens je mets les fragments et sur chaque page j'incère un div correspondant à chaque fragment

# TP4

## Meteo Concept est une API pour laquelle il nous faut créer un compte, à partir de ce compte, on obtient un token servant de clé pour comptabiliser notre notre d'uitilisation

## pour utiliser MeteoConcept, il nous faut utiliser l'url suivant :
## https://api.meteo-concept.com/api/forecast/daily?token=
## suivi de notre token personnel

## on utilise la méthode GET

## on ajoute un ? à ka fin de la requête suivi de l'information que l'on veut transmettre

## les informations nécessaires sont dans le fichier JSON que l'on récupère avec la requête

## pour les deux réponses, il suffit de descendre dans le fichier JSON reçu avec les getters des classes