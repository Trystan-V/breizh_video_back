# breizhvideo back

## voici le back le l'appli breizhvideo

* Création du projet avec springboot
    * intit springboot
    * mise en place de la base de donnée
    * création du CRUD
        * Le village
        * Le show


-----------------------------


### intit springboot
 
Création du projet springboot sur inteliJ avec les dépendances h2, jpa, et spring web.

### mise en place de la base de donnée

création des fichiers pour la base de donnée 
Les tests avec la console h2 fonctionne !

### Création du CRUD

mise en place des packages co.trystan.breizhvideo.controller, co.trystan.breizhvideo.service, co.trystan.breizhvideo.modele et co.trystan.breizhvideo.repository

#### Le village

Création du co.trystan.breizhvideo.modele avec id, name et postCode. création des getter setter
test de verification requete simple : ça marche !

le village a son modele, son repository, et son service ( et service implement).
Les test sur postman ne marche pas malheureusement 

#### le Show 

Création de Show avec la relation (la ca se complique)