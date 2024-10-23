package cl.duoc.models;

public class Documental extends Contenido{
    private String enfoque_educativo;
    private int duracion_min;

    public Documental() {
        super(null);
    }

    public Documental(String id_contenido) {
        super(id_contenido);
    }
    

    public Documental(String enfoque_educativo, int duracion_min, String id_contenido, boolean recomendacion_personalizada) {
        super(id_contenido, recomendacion_personalizada);
        this.enfoque_educativo = enfoque_educativo;
        this.duracion_min = duracion_min;
    }

    public String getEnfoque_educativo() {
        return enfoque_educativo;
    }

    public void setEnfoque_educativo(String enfoque_educativo) {
        this.enfoque_educativo = enfoque_educativo;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("DOCUMENTAL: \n" + "Enfoque educativo: " + enfoque_educativo + "\nDuracion (min): " + duracion_min);
    }

    @Override
    public double calcularCostoMensual() {
        double costo_mes = COSTO_BASE_SUSCRIPCION;
        if (duracion_min > 90){
            costo_mes -= (costo_mes * 0.05);
        }
        return costo_mes;
    }
    
    
}
