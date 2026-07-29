package modelos;

public class Revista extends Material{
    private int edicion;
    private String periodicidad;

    public Revista(String titulo, int fechaPublicacion, int id, int edicion, String periodicidad){
        super(titulo,fechaPublicacion, id);
        this.edicion = edicion;
        this.periodicidad = periodicidad;

    }


    public int getEdicion() {
        return edicion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Edicion: " + this.edicion + "\n" +
                "Periodicida: " + this.periodicidad;

    }
}

