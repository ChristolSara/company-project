# company projet 

ce projet basé sur une architecture distribuée : les mirco services en utilisant Spring Boot et Spring Cloud.
- un micro-service métier
- un service de configuration de l'architecture avec une repository GIT pour le config.
- externaliser la configuration du micro-service en se basant sur le service de configuration en utilisant  le service Actuator.
- un service annuaire d’enregistrement des micro-services (Eureka Server).
- enregistrer un micro-service chez le service d'enregistrement.
- un micro-service PROXY pour l’orchestration des services.
