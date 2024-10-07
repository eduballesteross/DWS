package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   String url = "jdbc:postgresql://localhost:5432/motorcrewserver";
	        String user = "postgres";
	        String password = "EduSFC1005";

	        try (Connection conn = DriverManager.getConnection(url, user, password)) {
	            if (conn != null) {
	                System.out.println("Conexión exitosa a la base de datos.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error en la conexión: " + e.getMessage());
	        }
		
	}

}
