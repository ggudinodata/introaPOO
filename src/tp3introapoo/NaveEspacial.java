/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class NaveEspacial {
    public String nombre;
    public int combustible;
    
    public void despegar(){
        if (combustible > 30){
            combustible -= 30;
            System.out.println("Despegue exitoso!");
        } else {
            System.out.println("Combustible insuficiente.");
        }
    }
    public void avanzar(int distancia){
        if (distancia < combustible){
            combustible -= distancia;
            System.out.println("Se logro avanzar con exito!");
        } else { 
            System.out.println("Combustible insuficiente.");
        }
    }
    public void recargarCombustible(int cantidad){
        if (cantidad <= (50 - this.combustible)){
            combustible += cantidad;
            System.out.println("Recarga exitosa.");
        } else {
            System.out.println("La recarga excede la capacidad. Intente nuevamente.");
        }
    }
    public void mostrarEstado(){
        System.out.println("Nombre nave: " + nombre + "\nCombustible disponible: " + combustible );
    }
}
