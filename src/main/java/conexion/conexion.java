package conexion;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class conexion {
	
	private final String servidor = "jdbc:mysql://localhost:3306/nomina";
	private final String usuario = "root";
	private final String pass = "";
	private Connection conexion = null;
	
	 
	public conexion() {
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion = (Connection) DriverManager.getConnection(servidor, usuario, pass);
		} 
		catch(Exception e) {
			System.out.println("Error en la conexion!");
		}
	}
	
	/**
	 * 
	 */
	
	public void cerrarConexion() {
		if(this.conexion != null) {
			try {
				this.conexion.close(); 
			} catch (Exception e) {
				System.out.println("Error al cerrar la conexion!");
			}
			
		}
	}
	
	public Connection getConexion() {
		return this.conexion;
	}
	
}
