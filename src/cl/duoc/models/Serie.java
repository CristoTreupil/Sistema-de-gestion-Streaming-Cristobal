package cl.duoc.models;

public class Serie extends Contenido{
    private int numero_temporadas;
    private boolean serie_finalizada;

    public Serie() {
        super(null);
    }

    public Serie(String id_contenido) {
        super(id_contenido);
    }
    

    public Serie(int numero_temporadas, boolean serie_finalizada, String id_contenido, boolean recomendacion_personalizada) {
        super(id_contenido, recomendacion_personalizada);
        this.numero_temporadas = numero_temporadas;
        this.serie_finalizada = serie_finalizada;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    public boolean isSerie_finalizada() {
        return serie_finalizada;
    }

    public void setSerie_finalizada(boolean serie_finalizada) {
        this.serie_finalizada = serie_finalizada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("SERIE: \n" + "Numero de temporadas: " + numero_temporadas + " \nSerie finalizada: " + serie_finalizada);
    }

    @Override
    public double calcularCostoMensual() {
        double costo_mes = COSTO_BASE_SUSCRIPCION;
        if (numero_temporadas > 3 & serie_finalizada == false){
            costo_mes *= 1.08;
        }
        return costo_mes;
    }
    
    
}
