package modelos;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private int fecha;

    public Autor(String nombre, String nacionalidad, int fecha) {
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setFecha(fecha);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFecha() {
        return fecha;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Nacionalidad: " + nacionalidad + "\n" +
                "Año de Nacimiento: " + fecha + "\n";
    }
}