package cl.duoc.models;

import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;
import java.util.List;

public class GestionRegistro {
    private List<Contenido> registros = new ArrayList<>();
    private int costo;

    public GestionRegistro() {
    }

    public List<Contenido> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Contenido> registros) {
        this.registros = registros;
    }
    
    public void agregarContenido(Contenido par_contenido){
        boolean sensor = true;
        if (registros.isEmpty()){
            registros.add(par_contenido);
        }
        else{
            for (Contenido i: registros){
                if (i.getId_contenido().equals(par_contenido.getId_contenido())){
                    System.out.println("Ya existe un contenido registrado con este codigo.");
                    sensor = false;
                }
            }
            if (sensor == true){
                System.out.println("Ha sido agregado un contenido.");
                par_contenido.mostrarDetalles();
                registros.add(par_contenido);
            }
            
        }
    }
    
    public void listarContenidoDisponible(){
        System.out.println("CONTENIDOS DE LA PLATAFORMA:\n");
        for (Contenido i: registros){
            i.mostrarDetalles();
        }
        System.out.println("Hay " + registros.size() + " contenidos disponibles en la plataforma.");
    }
    
    public void calcularCostosContenido(){
        for (Contenido i: registros){
            costo += i.calcularCostoMensual();
        }
        System.out.println("El costo total es de: " + this.costo);
    }
}
