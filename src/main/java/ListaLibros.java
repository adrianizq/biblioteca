import java.util.ArrayList;
import java.util.List;

public class ListaLibros {
    List<Libro> listaLibros = new ArrayList<Libro>();

    public ListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ListaLibros() {
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    //metodo para agregar los libros
    public void agregarLibros(Libro libro){
        listaLibros.add(libro);
    }

    //metodo para buscar un libro por el codigo
    //que debe recibir? el codigo del libro
    //que debe retornar? el libro
    public Libro buscar(Long codigo){
       //recorrer la lista
        for(Libro libro: listaLibros){
            if(codigo==libro.getId()){
                return libro;
            }
        }
        return null;
    }

}
