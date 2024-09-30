/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.exo2;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import ma.projet.connexion.Connexion;

/**
 *
 * @author hp
 */
public class ExoJDBC {
    public static void MAxNBScript() {
    try {
        Statement stmt = Connexion.getCn().createStatement();
        String req = "SELECT Developpeurs, Jour, max(NbScripts) "
                   + "FROM DevData "
                   + "    GROUP BY Jour" ;
        
        ResultSet rs = stmt.executeQuery(req);
        
        while (rs.next()) {
            String developpeur = rs.getString("Developpeurs");
            String jour = rs.getString("Jour");
            int maxNBScripts = rs.getInt("max(NbScripts)");
            System.out.println(developpeur + " a réalisé le maximum de scripts le " + jour + " avec " + maxNBScripts + " scripts.");
        }
        
    } catch (Exception e) {
        System.out.println("Erreur : " + e.getMessage());
    }
}
public static void SumNBScripts() {
    
        try {
            Statement stmt = Connexion.getCn().createStatement();
            String req = "SELECT Developpeurs, SUM(NbScripts) AS c  "
                         + "FROM DevData "
                         + "GROUP BY Developpeurs "
                         + "ORDER BY c DESC";
            
            ResultSet rs = stmt.executeQuery(req);
            
            while(rs.next()) {
               
                String dev = rs.getString("Developpeurs");
                int totalScripts = rs.getInt("c");
                System.out.println(dev + " a réalisé " + totalScripts + " scripts au total.");
            
            }
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
}
 public static void NBtotalSemaine() {
    try {
        
        Statement stmt = Connexion.getCn().createStatement();
        String req = "SELECT SUM(NbScripts)  "
                   + "FROM DevData";

        ResultSet rs = stmt.executeQuery(req);
        
        if (rs.next()) {
            
            int SumNbScripts = rs.getInt("Sum(NbScripts)");
            System.out.println("Le nombre total de scripts réalisés en une semaine est : " + SumNbScripts );
        }
    
    } catch (Exception e) {
        System.out.println("Erreur: " + e.getMessage());
    }
 } 
 
    public static void NBtotalScriptDev () {
        try {
            Statement stmt = Connexion.getCn().createStatement();
            String query = "SELECT Developpeurs, SUM(NbScripts) AS totalScriptsDev "
                         + "FROM DevData "
                         + "GROUP BY Developpeurs ";
            
           ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String developpeur = rs.getString("Developpeurs");
                int totalScriptsDev = rs.getInt("totalScriptsDev");
                System.out.println(developpeur + " a réalisé " + totalScriptsDev + " scripts au total.");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors du tri des données : " + e.getMessage());
        } 
} 
    public static void afficherMetaData() {
        try {
            Statement stmt = Connexion.getCn().createStatement();
           String req="SELECT * FROM DevData";
            
            ResultSet rs = stmt.executeQuery(req);

            ResultSetMetaData rsmd = rs.getMetaData();

            int nombreColonnes = rsmd.getColumnCount();
            for (int i = 1; i <= nombreColonnes; i++) {
                System.out.println("Colonne " + i + ": " + rsmd.getColumnName(i) + " (" + rsmd.getColumnTypeName(i) + ")");
            }
                
            while (rs.next()) {
                for (int i = 1; i <= nombreColonnes; i++) {
                    System.out.print(rs.getString(i) + " ");
                    
                }
                System.out.println();
                
            }
            System.out.println(" Le nombre de colonne est : "+nombreColonnes);
        } catch (Exception e) {
             System.out.println("Erreur: " + e.getMessage());
        }
     }
  }



