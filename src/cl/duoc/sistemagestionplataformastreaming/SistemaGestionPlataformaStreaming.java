package cl.duoc.sistemagestionplataformastreaming;

import cl.duoc.models.Documental;
import cl.duoc.models.GestionRegistro;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Serie;
import java.util.Scanner;

public class SistemaGestionPlataformaStreaming {

    public static void main(String[] args) {
        
        // Creacion de gestion de registros
        
        GestionRegistro gestion_registro = new GestionRegistro();
        
        // Creacion de Contenidos
        
        gestion_registro.agregarContenido(new Pelicula(120, 5.6, "001", true));
        gestion_registro.agregarContenido(new Pelicula(230, 3.0, "002", false));
        gestion_registro.agregarContenido(new Pelicula(123, 1.0, "003", false));

        gestion_registro.agregarContenido(new Serie(2, true, "004", true));
        gestion_registro.agregarContenido(new Serie(1, false, "005", false));

        gestion_registro.agregarContenido(new Documental("animales", 90, "006", true));
        gestion_registro.agregarContenido(new Documental("naturaleza", 120, "007", false));
        
        // Creacion de Scanner
        
        Scanner entrada = new Scanner(System.in);
        boolean detector = true;
        
        while (detector == true){
            System.out.println("---- Bienvenido a StreamFlex ----");
            System.out.println("Selecciona una opcion:");
            System.out.println("[1] -> Agregar contenido");
            System.out.println("[2] -> Listar contenidos");
            System.out.println("[3] -> Calcular costo mensual de contenido");
            System.out.println("[4] -> Salir");
            
            switch (entrada.nextInt()) {
                case 1:
                    System.out.println("Ingresar tipo de contenido que se desea anadir: ");
                    String sensor = entrada.next();
                    if (sensor.toLowerCase().equals("pelicula")){
                        System.out.println("Ingresar id de contenido: ");
                        Pelicula nuevo_contenido = new Pelicula(entrada.next());
                        System.out.println("Ingresar duracion (min): ");
                        nuevo_contenido.setDuracion(entrada.nextInt());
                        System.out.println("Ingresar la calificacion:");
                        nuevo_contenido.setCalificacion(entrada.nextDouble());
                        gestion_registro.agregarContenido(nuevo_contenido);
                    }
                    if (sensor.toLowerCase().equals("serie")){
                        System.out.println("Ingresar id de contenido: ");
                        Serie nuevo_contenido = new Serie(entrada.next());
                        System.out.println("Ingresar cantidad de temporadas: ");
                        nuevo_contenido.setNumero_temporadas(entrada.nextInt());
                        System.out.println("Ingresar si la serie a finalizado (true/false): ");
                        nuevo_contenido.setSerie_finalizada(entrada.nextBoolean());
                        gestion_registro.agregarContenido(nuevo_contenido);
                    }
                    
                    if (sensor.toLowerCase().equals("documental")){
                        System.out.println("Ingresar id de contenido: ");
                        Documental nuevo_contenido = new Documental(entrada.next());
                        System.out.println("Ingresar enfoque eductativo: ");
                        nuevo_contenido.setEnfoque_educativo(entrada.next());
                        System.out.println("Ingresar duracion (min): ");
                        nuevo_contenido.setDuracion_min(entrada.nextInt());
                        gestion_registro.agregarContenido(nuevo_contenido);
                    }
                    break;
                case 2:
                    gestion_registro.listarContenidoDisponible();
                    gestion_registro.getRegistros();    
                    break;
                case 3:
                    gestion_registro.calcularCostosContenido();
                    break;
                
                default:
                    detector = false;
            }
            
        }
        
    }
    
}
