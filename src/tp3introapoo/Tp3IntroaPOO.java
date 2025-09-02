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
    }
    
}
