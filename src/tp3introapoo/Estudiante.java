/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre + "\nApellido: " + apellido +
                "\nCurso: "+ curso + "\nCalificacion: " + calificacion);
    }
    public void subirCalificacion( double puntos ){
        calificacion = calificacion + puntos;
    }
    public void bajarCalificacion( double puntos ){
        calificacion = calificacion - puntos;
    }
    
}
