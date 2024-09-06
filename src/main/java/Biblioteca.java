
/**
 *
 * @author adrianyepiz
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    
    //se hacen las listas y se establece que van a llevar (el private hace que solo sea accesible en esta clase)

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    } //constructor que inicia las listas de libros y usuarios

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    } //Libro hace referencia a la clase y libro es el nombre de la variable

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                libro.prestar();
                return true;
            }
        }
        return false;
    }

    public boolean devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isPrestado()) {
                libro.devolver();
                return true;
            }
        }
        return false;
    }
}
