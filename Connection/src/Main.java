import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    // Datos de conexion
    private static final String URL = "jdbc:mysql://localhost:3306/barberia";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "1234";

    public static void main(String[] args ) {
        Connection conexion = null;

        try {
            // Cargar el driver (opcional en versiones modernnas)
            Class.forName( "com.mysql.cj.jdbc.Driver");

            // Establecer conexion
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            System.out.println(" ☑ Conexion exitosa a la base de datos MYSQL.");

        } catch (ClassNotFoundException e){
            System.out.println(" ⌧ Error: No se encontro el Driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" ⌧ Error al conectar la base datos.");
            e.printStackTrace();
        } finally {
            //Cerrar la conexion
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println(" ⚠\uFE0F Conexion cerrada");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

