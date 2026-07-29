package modelos;

import interfaces.Prestable;

public class Libro extends Material implements Prestable {
    private String isbn;
    private Autor autor;
    private int numeroPaginas;
    private boolean prestado;

    public Libro(String titulo, int fechaPublicacion, String isbn, int id, Autor autor, int numeroPaginas, boolean prestado){
        super(titulo,fechaPublicacion, id);
       this.isbn =isbn;
       this.autor = autor;
       this.numeroPaginas =numeroPaginas;
       this.prestado = prestado;

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
            "Autor: " + this.autor.getNombre() + "\n" +
            "ISBN: " + this.isbn + "\n" +
            "Número de Páginas: " + this.numeroPaginas + "\n";

}

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public  void devolver() {
        prestado = false;

    }




}
