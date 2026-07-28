package app;

import modelos.*;

public class Main {
    public static void main(String[] args) {

        Biblioteca bibliotecaCentral = new Biblioteca(
                "Biblioteca Central",
                "Quito",
                100
        );
        Autor autor1 = new Autor(
                "Josue",
                "Ecuatoriano",
                19032006);
        Libro libro1 = new Libro(
                "Clean Code",
                2008,
                "9780132350884",
                autor1,
                464
        );
    }
}

