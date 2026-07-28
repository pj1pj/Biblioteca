package modelos;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private Material[] materiales;
    private int capacidadMaxima;
    private int cantidadMateriales;

    public Biblioteca(String nombre,String ubicacion,int capacidadMaxima){
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
    public String toString(){
        return"Nombre: " + this.nombre + "\n" +
            "Ubicación: " + this.ubicacion + "\n" +
            "Capacidad Máxima: " + this.capacidadMaxima + "\n" +
            "Cantidad de Materiales: " + this.cantidadMateriales + "\n";
}
}

