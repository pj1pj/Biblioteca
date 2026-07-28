package modelos;

public abstract class Material {
    private String titulo;
    private String autor;
    private int fechaPublicacion;


    public Material(String titulo, String autor, int fechaPublicacion) {
        setTitulo(titulo);
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null){
        } else {
            this.titulo = titulo;

        }
    }
}
