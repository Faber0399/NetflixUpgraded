package dominio;

public class Pelicula {
    private String nombre;
    private int duracion;
    private String genero;
    private String descripcion;
    private int idNombrePelicula;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula(int idNombrePelicula, String nombre, int duracion, String genero, String descripcion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
        this.idNombrePelicula = idNombrePelicula;
    }

    public Pelicula(int duracion, String genero, String descripcion, int idNombrePelicula) {
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
        this.idNombrePelicula = idNombrePelicula;
    }

    public Pelicula(int idNombrePelicula) {
        this.idNombrePelicula = idNombrePelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdNombrePelicula() {
        return idNombrePelicula;
    }

    public void setIdNombrePelicula(int idNombrePelicula) {
        this.idNombrePelicula = idNombrePelicula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + ", duracion=" + duracion + ", genero=" + genero + ", descripcion="
                + descripcion + ", idNombrePelicula=" + idNombrePelicula + "]";
    }

}