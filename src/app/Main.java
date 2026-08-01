package app;

import modelos.*;
import modelos.excepciones.*;

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
                3,
                autor1,
                464,
                false
        );

        Libro libro2 = new Libro(
                "Clean Java",
                20011,
                "9780132950884",
                1,
                autor1,
                264,
                false
        );

        Libro libro3 = new Libro(
                "Clean Python",
                2019,
                "9789132350884",
                2,
                autor1,
                317,
                false
        );

        try {
            bibliotecaCentral.agregarMaterial(libro1);
        } catch (MaterialInvalidoException e){
            System.out.println(e.getMessage());
        }

        try {
            bibliotecaCentral.solicitarPrestamo("Clean");
        } catch (LibroNoEncontradoException e){
            System.out.println(e.getMessage());
        } catch (LibroYaPrestadoException e){
            System.out.println(e.getMessage());
        } catch (MaterialNoPrestableException e) {
            System.out.println(e.getMessage());

        }










        //bibliotecaCentral.agregarMaterial(libro2);
        //bibliotecaCentral.agregarMaterial(libro3);
        // System.out.println(bibliotecaCentral.buscarMaterial("Clean Code"));
        //boolean b = bibliotecaCentral.eliminarMaterial("Clean Java");
        //.out.println(b);
        //comnetario
        //int b = bibliotecaCentral.contarLibros();
        //System.out.println(b);


//        libro1.prestar();
//        libro1.prestar();

    }








}

