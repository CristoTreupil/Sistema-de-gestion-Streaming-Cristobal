package cl.duoc.models;

public abstract class Contenido implements IRegla{
    private final String id_contenido;
    private boolean recomendacion_personalizada;

    public Contenido(String id_contenido) {
        this.id_contenido = id_contenido;
    }
    
    public Contenido(String id_contenido, boolean recomendacion_personalizada) {
        this.id_contenido = id_contenido;
        this.recomendacion_personalizada = recomendacion_personalizada;
    }

    public String getId_contenido() {
        return id_contenido;
    }
    
    public boolean isRecomendacion_personalizada() {
        return recomendacion_personalizada;
    }

    public void setRecomendacion_personalizada(boolean recomendacion_personalizada) {
        this.recomendacion_personalizada = recomendacion_personalizada;
    }
    
    

    
    
    public abstract void mostrarDetalles();
}
