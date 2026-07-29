package modelos;

public abstract class Material {
    private String titulo;
    private int fechaPublicacion;


    public Material(String titulo, int fechaPublicacion) {
        setTitulo(titulo);
        this.fechaPublicacion = fechaPublicacion;

    }

    protected Material() {
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null) {
            System.out.println("Error al guardar el titulo");
        } else {
            this.titulo = titulo;

        }
    }

@Override
    public String toString(){
        return "===Datos Material===\n" +
                "Titulo: " + this.titulo +"\n"+
                "Fecha Publicacion: " + this.fechaPublicacion + "\n";

    }
}

