/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3introapoo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAnioPublicacion(int anio){
        if(anio > 1900 && anio < 2026){
            this.anioPublicacion = anio;
        }
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
}
