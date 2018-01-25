## Spring Data REST and JPA Example
This project depicts the Spring Boot Example with Spring Data REST and JPA Example.
The data base name is 'catalogue'
All the configuration are in the file properties

## Description
This Project shows the list of Products which are stored in the In-Memory mysql dataBase. Using the following endpoints, different operations can be achieved:
- `/all` - This returns the list of products in the produit table which is created in mysql
- `/ProduitParMC?mc=GG&page=0` - search at the specific page all products that contain the specific 'mc'
- `/save?designation=BN144&prix=20.36` - Add new produit using the produit model. eg. { "reference": "1", "designation": "BN144", "prix": 20.36 }

## Libraries used
- Spring Boot
- Spring Configuration
- Spring REST Controller
- Spring JPA
- mysql
- Development Tools

## Git 2.10.0
- Eclipse Java EE Oxygen.2 Release (4.7.2)
