package cl.praxis.model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
private static Connection con = null;
	
	private Conexion() {

		try {
			
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/desafioproveedores", "postgres", "aranibar18");
			
			
			boolean isValid = con.isValid(50000);
			
			System.out.println(isValid ? "TEST OK POSTGRESQL" : "TEST FAILED POSTGRESQL");
			
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Error al conectar con la Base de Datos" + ex.getMessage());
		}
		
	}

	public static Connection getCon() {	
		if (con == null) {
			new Conexion();
		}
		
		return con;
	}	

}
