public class BaseDatos{
	private final String URL = "jdbc:mysql//localhost:3306/";
	private final String DB = "platzijava";
	private final String USUARIO = "platzijava";
	private final String PASSWORD = "platzijava";

	public Connection conexion = null;

	public Connection conectar() throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
			if(conexion != null){
				System.out.println("la conexion se ejecturo exitosamente");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return conexion;
		}
	}
}


public class TaxiCRUD{
		public void agregar(Taxi taxi){
						Statement sentencia = null;

			String query = "INSERT INTO vehiculo"
						+"(matricula,marca,modelo,anio, id_tipo_vehiculo)"
						+"VALUES ('','','','',+TIPO+";


			if(sentencia.execute(qeury)){
				System.out.println("El registro se inserto exitosamente");
			}else{
				System.out.println("No se pudo insertar el registro");
			}
		}
}