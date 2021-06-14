# SpringandMongoDB
# Event_CRUD
Application WEB ( CRUD ) - SPRING BOOT ( BACK-END ) 

### Etapes a suivre pour deployer le project complet:

#### 1- telecharger et installer MongoDB -_- : https://www.mongodb.com/try/download/community
   
#### 2-Importer le projet `spring-boot-mongodb-example-viatoile` sur Eclipse ou autre IDE :

- Modifier le fichier `/src/main/ressources/application.properties ` avec votre propre configuration Postgresql

    ```
		#Mongo Config
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=springboot
    spring.data.mongodb.repositories.enabled=true
    
    #server Config
    server.port=8095
    ```    
	
#### 3-Demarrer le Project sur Eclipse et utiliser Swagger ( JSON API documentation for spring based applications ) :
  - http://localhost:8095/rest/users/all ( simple GET)
  	![](/images/image1.png)
  - http://localhost:8080/swagger-ui.html ( swagger-ui )
	![](/images/image2.png)
### 4 - database file 
	CH.json OR CH.csv
    
