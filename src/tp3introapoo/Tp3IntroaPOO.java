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
        
// EJERCICIO 3
        System.out.println("\nEJERCICIO 3\n");
        
        Libro book = new Libro();
        
        book.setAutor("George Orwell");
        book.setTitulo("1984");
        book.setAnioPublicacion(1849);
        System.out.println("Año de publicacion v1: " + book.getAnioPublicacion());
        
        book.setAnioPublicacion(1949);
        System.out.println("Año de publicacion v2: " + book.getAnioPublicacion());
        
// EJERCICIO 4
        System.out.println("\nEJERCICIO 4\n");
        
        System.out.println("Nace Gallina 1");
        Gallina chick1 = new Gallina();
        chick1.idGallina = 1;
        
        System.out.println("Pone 1 huevo gallina 1 ");
        chick1.ponerHuevo();
        
        System.out.println("Pasa 1 año");
        
        System.out.println("Nace Gallina 2");
        Gallina chick2 = new Gallina();
        chick2.idGallina = 2;
        chick1.envejecer();
        
        System.out.println("Pone 1 huevo gallina 1 y gallina 2");
        chick1.ponerHuevo();
        chick2.ponerHuevo();
        
        System.out.println("Estado gallina 1: ");
        chick1.mostrarEstado();
        
        System.out.println("Estado gallina 2: ");
        chick2.mostrarEstado();
        
// EJERCICIO 5
        System.out.println("\nEJERCICIO 5\n");
    }
    
}
