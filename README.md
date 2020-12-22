# breizhvideo back

## voici le back de l'appli breizhvideo

* Création du projet avec springboot
    * intit springboot
    * mise en place de la base de donnée
    * création du CRUD
        * Le village
        * Le show
        * les autres


-----------------------------

### Création du repo github

création de la branch dev

### intit springboot
 
Création du projet springboot sur inteliJ avec les dépendances h2, jpa, et spring web.

### mise en place de la base de donnée

création des fichiers pour la base de donnée.
ca ne marche pas. Je recrée les fichiers data-h2, et schema SQL auquel j'ajoute une ligne de commande et ca marche !
Les tests avec la console h2 fonctionne !

### Création du CRUD

mise en place des packages ccontroller, service, modele et repository. 

#### Le village

J'ai choisi de me concentrer sur le Village pour commencer.
Création du modele avec id, name et postCode. création des getter setter
test de verification requete simple : ça marche !

le village a son modele, son repository, et son service (et service implement).
Les test sur postman ne marche pas malheureusement (j'ai résolu le problème avec l'aide des collègues j'ai oublié un bout de code)

#### le Show 

Pour la suite je me concentre sur le show pour la création/affichage d'un événement.
Création de l'entity Show avec la relation (la ca se complique)


#### Les autres

Création des autres entity avec leurs relations


-----------------------------
