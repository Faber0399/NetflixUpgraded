package catalogopeliculas;

import java.sql.Connection;
import java.sql.SQLException;

import datosPelicula.Conexion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection conn;
        try {
            conn=Conexion.getConnection();
            Conexion.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
