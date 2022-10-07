package datosPelicula;

import java.sql.*;
import java.util.*;

import dominio.Pelicula;

public class AccesoDatosMySql implements IAccesoDatos {
    private static final String SQL_SELECT = "SELECT idPersona, nombre, apellido, email, telefono FROM test.persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre, apellido, email, telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATED = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE idPersona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idPersona=?";
    private Connection ConexionTransaccion;

    public AccesoDatosMySql() {
    }

    public AccesoDatosMySql(Connection conexionTransaccion) {
        ConexionTransaccion = conexionTransaccion;
    }

    public boolean existe(String nombreArchivo) {
        return true;
    }

    public List<Pelicula> listar(String nombre) {

    }

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;
        try {
            conn = this.ConexionTransaccion != null ? this.ConexionTransaccion : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, pelicula.getNombre());
            stmt.setString(2, pelicula.getApeliido());
            stmt.setString(3, pelicula.getEmail());
            stmt.setString(4, pelicula.getTelefono());
            registro = stmt.executeUpdate();
        } finally {

            try {
                Conexion.close(stmt);
                if (this.ConexionTransaccion == null) {
                    Conexion.close(conn);
                }

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }

    public void buscar(String nombreArchivo, String buscar) {
    }

    public void crear(String nombreArchivo) {
    }

    public void borrar(String nombreArchivo) {
    }
}
