package modelos;

import modelos.excepciones.LibroNoEncontradoException;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private Material[] materiales;
    private int capacidadMaxima;
    private int cantidadMateriales;

    public Biblioteca(String nombre, String ubicacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.materiales = new Material[capacidadMaxima];
        this.cantidadMateriales = 0;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadMateriales() {
        return cantidadMateriales;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Ubicación: " + this.ubicacion + "\n" +
                "Capacidad Máxima: " + this.capacidadMaxima + "\n" +
                "Cantidad de Materiales: " + this.cantidadMateriales + "\n";
    }

    public boolean agregarMaterial(Material material) {

        if (material == null) {
            return false;
        }

        if (cantidadMateriales >= capacidadMaxima) {
            return false;
        }

        materiales[cantidadMateriales] = material;
        cantidadMateriales++;
        return true;

    }

    public Material buscarMaterial(String titulo) {
        for (int i = 0; i < cantidadMateriales; i++) {

            Material material = materiales[i];

            if (material.getTitulo().equals(titulo)) {
                return material;
            }
        }

        return null;
    }

    public boolean eliminarMaterial(String titulo) {

        int indicelimar = -1;

        for (int i = 0; i < cantidadMateriales; i++) {

            if (materiales[i].getTitulo().equals(titulo)) {
                indicelimar = i;
                break;
            }
        }

        if (indicelimar == -1) {
            return false;
        }

        for (int i = indicelimar; i < cantidadMateriales - 1; i++) {

            materiales[i] = materiales[i + 1];
        }

        materiales[cantidadMateriales - 1] = null;
        cantidadMateriales--;
        return true;


    }

    public void listarMateriales() {
        System.out.println("===Materiales litstados===");
        for (int i = 0; i < cantidadMateriales; i++) {
            System.out.println(materiales[i]);
        }

    }

    public boolean estaVacia() {
        return cantidadMateriales == 0;
    }

    public boolean estaLlena() {
        return cantidadMateriales == capacidadMaxima;
    }

    public int contarLibros() {
        int conteo = 0;
        for (int i = 0; i < cantidadMateriales; i++) {
            if (materiales[i] instanceof Libro) {
                conteo++;
            }
        }
        return conteo;
    }

   public boolean solicitarPrestamo(String titulo) throws LibroNoEncontradoException {

       Material encontrado = buscarMaterial(titulo);
        if(encontrado == null){
            throw new LibroNoEncontradoException("no encontrado");
        }

        if(encontrado instanceof Libro){
            Libro libro = (Libro) encontrado;
            if (libro.estaPrestado()){

                return false;
            } else {
                libro.prestar();
                return true;
            }
        } else{ return false;}

   }

    public boolean devolverPrestamo(String titulo){

        Material encontrado = buscarMaterial(titulo);
        if(encontrado == null){
            return false;
        }

        if(encontrado instanceof Libro){
            Libro libro = (Libro) encontrado;
            if (libro.estaPrestado()){
                libro.devolver();
                return true;
            } else {

                return false;
            }
        } else{ return false;}

    }
    }














