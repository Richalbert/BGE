

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("trying to connect...") ;
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/BGE?serverTimezone=UTC" , "root", "toto-23");

			System.out.println("Connected...") ;
			String sql = "select * from salarie" ;
			Statement smt = co.createStatement() ; // création statement
			ResultSet rs = smt.executeQuery(sql) ; // exécution commande
			while (rs.next()) { // boucle dans la BD, affichage d'un champ
			System.out.println("NOM="+rs.getString("NOM")) ;
			}
			rs.close();
			smt.close();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		

	}

}
