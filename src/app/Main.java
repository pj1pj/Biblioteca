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

        Libro libro2 = new Libro(
                "Clean Java",
                20011,
                "9780132950884",
                autor1,
                264
        );

        Libro libro3 = new Libro(
                "Clean Python",
                2019,
                "9789132350884",
                autor1,
                317
        );

        bibliotecaCentral.agregarMaterial(libro1);
        bibliotecaCentral.agregarMaterial(libro2);
        bibliotecaCentral.agregarMaterial(libro3);
       // System.out.println(bibliotecaCentral.buscarMaterial("Clean Code"));
       boolean b = bibliotecaCentral.eliminarMaterial("Clean Java");
       System.out.println(b);

    }
} // funcion elimar material

