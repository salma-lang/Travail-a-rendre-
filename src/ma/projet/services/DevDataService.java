/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.sql.Statement;
import ma.projet.connexion.Connexion;

/**
 *
 * @author hp
 */
public class DevDataService {
    public static void createTable() {
        try {
            // Creation de la requete pour creer la table
            String req = "CREATE TABLE DevData ("
                    + "Developpeurs VARCHAR(32), "
                    + "Jour CHAR(11), "
                    + "NbScripts INTEGER)";
            
            // Creation de statement
            Statement stmt = Connexion.getCn().createStatement();
            
            // Exécution de la requête
            stmt.executeUpdate(req);
            System.out.println("Table est créée");
            
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
    public static void insertData() {
        try {
            Statement stmt = Connexion.getCn().createStatement();
            String req1 = "INSERT INTO DevData VALUES ('ALAMI', 'Lundi', 1)";
            String req2 = "INSERT INTO DevData VALUES ('WAFI', 'Lundi', 2)";
            String req3 = "INSERT INTO DevData VALUES ('SALAMI', 'Mardi', 9)";
            String req4 = "INSERT INTO DevData VALUES ('SAFI', 'Mardi', 2)";
            String req5 = "INSERT INTO DevData VALUES ('ALAMI', 'Mardi', 2)";
            String req6 = "INSERT INTO DevData VALUES ('SEBIHI', 'Mercredi',2)";
            String req7 = "INSERT INTO DevData VALUES ('WAFI', 'jeudi',3)";
            String req8 = "INSERT INTO DevData VALUES ('ALAOUI', 'Vendredi',9)";
            String req9 = "INSERT INTO DevData VALUES ('WAFI', 'Vendredi',3)";
            String req10 = "INSERT INTO DevData VALUES ('SEBIHI', 'Vendredi',4)";
            // Exécuter les requêtes d'insertion
            stmt.executeUpdate(req1);
            stmt.executeUpdate(req2);
            stmt.executeUpdate(req3);
            stmt.executeUpdate(req4);
            stmt.executeUpdate(req5);
            stmt.executeUpdate(req6);
            stmt.executeUpdate(req7);
            stmt.executeUpdate(req8);
            stmt.executeUpdate(req9);
            stmt.executeUpdate(req10);
        
            System.out.println("Données insérées avec succès.");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
    
    
}
