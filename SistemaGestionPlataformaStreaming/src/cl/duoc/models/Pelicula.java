package cl.duoc.models;

public class Pelicula extends Contenido{
    private double duracion, calificacion;

    public Pelicula() {
        super(null);
    }

    public Pelicula(String id_contenido) {
        super(id_contenido);
    }

    public Pelicula(double duracion, double calificacion, String id_contenido, boolean recomendacion_personalizada) {
        super(id_contenido, recomendacion_personalizada);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }
    

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public double calcularCostoMensual() {
        double costo_mes = COSTO_BASE_SUSCRIPCION;
        if (calificacion > 4.5){
            costo_mes *= 1.1;
        }
        return costo_mes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("PELICULA: \nDuracion: " + duracion + " \nCalificacion promedio: " + calificacion);
    }
    
    
    
}
