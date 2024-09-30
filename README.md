# Travail à Rendre : Scripts des Développeurs
# Introduction
Dans cette section, nous explorons les fonctionnalités avancées de JDBC en effectuant plusieurs exercices qui se concentrent sur la gestion des données relatives aux développeurs. L'objectif principal est de démontrer la capacité à interagir avec la base de données de manière efficace et structurée.
# Exercice 1 : Ouvrir une connexion et créer une table
# 1. Charger le driver JDBC de la base MySQL et établir une connexion :
Pour établir une connexion avec la base de données MySQL, une classe nommée Connexion a été créée dans le package approprié. Cette classe contient quatre variables statiques :
url pour l'URL de connexion à la base de données (par exemple, une base de données nommée "jdbcv2" sur le serveur local).
login pour le nom d'utilisateur (ici, "root").
password pour le mot de passe (vide dans ce cas).
cn, initialisée à null, qui sera utilisée pour conserver l'objet de connexion.
La méthode statique getCn() tente d'établir une connexion à la base de données en utilisant Class.forName() pour charger le driver JDBC et DriverManager.getConnection() pour établir la connexion avec les informations d'identification fournies. Si une exception se produit, elle est gérée par un logger pour assurer le suivi des erreurs.
# 2. Envoyer des instructions SQL pour créer une table :
Une classe nommée DevDataService a été créée, contenant une méthode statique createTable(). Cette méthode est chargée de créer une table nommée DevData pour stocker des informations sur les développeurs. La requête SQL pour créer la table est définie et exécutée via un objet Statement. En cas de succès, un message confirmant la création de la table est affiché. Si une exception survient, un message d'erreur détaillé est fourni pour faciliter le débogage.
# Exercice 2 : Recherche d’information dans la base de données
# 1. Afficher la personne ayant réalisé le nombre maximum de scripts en une journée :
Dans la classe ExoJDBC, la méthode MAxNBScript() a été développée pour récupérer et afficher le maximum de scripts réalisés par chaque développeur, groupés par jour. La requête SQL appropriée est exécutée, et les résultats sont itérés à l'aide d'un ResultSet, permettant d'afficher les informations pertinentes à l'utilisateur.
# 2. Lister les développeurs triés selon leur nombre de scripts :
La méthode SumNBScripts() a été ajoutée à la classe ExoJDBC. Cette méthode exécute une requête SQL qui sélectionne le nom des développeurs ainsi que la somme de leurs scripts, triée par le total des scripts en ordre décroissant. Les résultats sont ensuite affichés dans la console, fournissant une vue d'ensemble claire des performances des développeurs.
# 3. Calculer et afficher le nombre total de scripts réalisés en une semaine :
La méthode NBtotalSemaine() calcule le nombre total de scripts réalisés sur une semaine en exécutant une requête SQL qui somme les valeurs de la colonne NbScripts dans la table DevData. Le résultat est affiché avec un message informatif, assurant que l'utilisateur obtient les données souhaitées de manière conviviale.
# 4. Calculer pour un programmeur donné le nombre total de scripts réalisés :
La méthode NBtotalScriptDev() a été mise en place pour récupérer le nombre total de scripts réalisés par chaque développeur. Une requête SQL est utilisée pour obtenir les résultats, et les données sont ensuite affichées à l'écran. Si une erreur se produit lors de l'exécution de la requête, un message d'erreur est généré pour aider à résoudre le problème
# Exercice 3:Effectuer une requête libre et obtenir la méta information sur les types de données du résultat 
Dans cette partie, la méthode afficherMetaData() utilise JDBC pour récupérer et afficher les métadonnées des colonnes de la table DevData. Le programme utilise un objet ResultSetMetaData pour extraire et afficher le nombre de colonnes, ainsi que les noms et types des colonnes.
# Conclusion:
Ce projet a permis d'acquérir une compréhension approfondie de l'utilisation de JDBC pour interagir avec une base de données. En mettant en œuvre diverses fonctionnalités, telles que l'insertion, la récupération et la manipulation de données, ce TP a renforcé la maîtrise des concepts fondamentaux de l'accès aux bases de données avec Java.
# Video de demonstration:



