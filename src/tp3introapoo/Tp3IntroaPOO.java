/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Tp3IntroaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                

// EJERCICIO 1
        System.out.println("EJERCICIO 1\n");
        Estudiante juan = new Estudiante();
        
        juan.nombre = "Juan";
        juan.apellido = "Dominguez";
        juan.curso = "Programacion";
        juan.calificacion = 8.5;
        
        juan.mostrarInfo();
        
        juan.subirCalificacion(1.5);
        juan.mostrarInfo();
        
        juan.bajarCalificacion(3);
        juan.mostrarInfo();
        
// EJERCICIO 2
        System.out.println("\nEJERCICIO 2\n");
        // Creación de la mascota
        Mascota conejo = new Mascota();
        
        conejo.nombre = "Pepito";
        conejo.especie = "Oryctolagus cuniculus (Conejo)";
        conejo.edad = 5;
        
        conejo.mostrarInfo();
        
        System.out.println("Cumpleaños de " + conejo.nombre);
        conejo.cumplirAnios();
        
        conejo.mostrarInfo();
    }
    
}
