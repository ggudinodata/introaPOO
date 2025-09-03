/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Gallina {
    public int idGallina;
    public int edad;
    public int huevosPuestos;
    
    public void ponerHuevo(){
        this.huevosPuestos += 1;
    }
    public void envejecer(){
        this.edad += 1;
    }
    public void mostrarEstado(){
        System.out.println("Id. de la Gallina: " + idGallina + "\nEdad: " + edad
        + "\nHuevos puestos: " + huevosPuestos);
    }
    
}
