package modelos;

public abstract class Usuario {
    private String nombre;
    private int id;
    private String correo;

    public Usuario(String nombre, int id, String correo){
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }


    public boolean pedirPrestamo(Biblioteca biblioteca, String titulo){
        return biblioteca.solicitarPrestamo(titulo);

    }

    public boolean devolverPrestamo(Biblioteca biblioteca, String titulo){
        return biblioteca.devolverPrestamo(titulo);
    }

    @Override
    public String toString(){
        return "Nombre Usuario: " + this.nombre  + "\n" +
                "ID: " + this.id + "\n"  +
                "Correo: " + this.correo + "\n";

    }
}
