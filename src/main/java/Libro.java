/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianyepiz
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
    // el status prestado va por defecto en false
    
    public String getTitulo(){
        return titulo;
}

    public String getAutor(){
        return autor;
    }
    public boolean isPrestado(){
        return prestado;
    }
    public void prestar(){
        this.prestado = true;
      // la funcion prestar cambia el estado de el libro a prestado=true
    }
    public void devolver(){
        this.prestado = false; //al devolver regresa a false
    }
  @Override
    public String toString() {
        return titulo + " de " + autor + (prestado ? " (Prestado)" : " (Disponible)"); 
    }
}
  
