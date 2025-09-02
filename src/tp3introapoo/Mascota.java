/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Mascota {
    public String nombre;
    public String especie;
    public int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre + "\nEspecie: " + especie +
                "\nEdad: "+ edad );
    }
    public void cumplirAnios(){
        this.edad = this.edad + 1;
    }
}
