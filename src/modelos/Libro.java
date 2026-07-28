package modelos;

public class Libro extends Material {
    private String isbn;
    private Autor autor;
    private int numeroPaginas;

    public Libro(String titulo, int fechaPublicacion, String isbn, Autor autor, int numeroPaginas ){
        super(titulo,fechaPublicacion);
       this.isbn =isbn;
       this.autor = autor;
       this.numeroPaginas =numeroPaginas;

    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

@Override
    public String toString(){
    return super.toString() +
            this.autor.getNombre() + "\n " +
            "ISBN: " + this.isbn + "\n" +
            "Número de Páginas: " + this.numeroPaginas + "\n";

}

}
