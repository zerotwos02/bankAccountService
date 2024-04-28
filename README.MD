# Compte Rendu : Application de Gestion de Comptes

Ce compte rendu détaille les étapes de développement d'une application de gestion de comptes en utilisant Spring Boot.

## Étapes de Développement

### 1. Création du Projet Spring Boot

- Utilisation de Spring Initializr pour créer un projet Spring Boot avec les dépendances suivantes :
    - Web
    - Spring Data JPA
    - H2
    - Lombok

### 2. Création de l'Entité JPA Compte

- Définition de l'entité JPA "Compte" avec les champs appropriés pour représenter un compte utilisateur.

### 3. Création de l'Interface CompteRepository

- Création de l'interface CompteRepository basée sur Spring Data JPA pour effectuer les opérations CRUD sur l'entité Compte.

### 4. Test de la Couche DAO

- Écriture de tests unitaires pour tester la couche d'accès aux données (DAO) et s'assurer que les opérations CRUD fonctionnent correctement.

### 5. Création du Web Service RESTful

- Implémentation d'un web service RESTful pour gérer les opérations CRUD sur les comptes utilisateurs.

### 6. Test du Micro-Service Web

- Utilisation d'un client REST tel que Postman pour tester le fonctionnement du micro-service web et vérifier les réponses aux requêtes HTTP.

### 7. Génération et Test de la Documentation Swagger

- Génération de la documentation Swagger pour les API REST du web service afin de fournir une documentation interactive et explicite des endpoints.

### 8. Exposition d'une API RESTful avec Spring Data Rest

- Utilisation de Spring Data Rest pour exposer une API RESTful en exploitant des projections pour gérer les comptes utilisateurs.

### 9. Création des DTOs et Mappers

- Définition des objets de transfert de données (DTOs) et des mappers pour transférer les données entre les couches et les clients.

### 10. Création de la Couche Service (Métier) et du Micro-Service

- Implémentation de la couche de service (métier) pour encapsuler la logique métier et fournir des services aux clients.

### 11. Création du Web Service GraphQL

- Création d'un web service GraphQL pour le micro-service en utilisant des ressources telles que la vidéo [vidéo explicative](lien_de_la_video) pour guider l'implémentation.

---

Ce compte rendu présente les étapes clés du développement de l'application de gestion de comptes en utilisant Spring Boot. Chaque étape est accompagnée de son implémentation respective, des outils utilisés et des tests effectués pour garantir le bon fonctionnement de l'application.
