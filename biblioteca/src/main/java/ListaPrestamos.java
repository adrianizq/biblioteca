import java.util.ArrayList;
import java.util.List;

public class ListaPrestamos {
    List<Prestamo> listaPrestamo = new ArrayList<Prestamo>();

    public ListaPrestamos(List<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }

    public ListaPrestamos() {
    }

    public List<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public void setListaPrestamo(List<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }

    //metodo para agregar prestamo a la lista de libros
    public void agregar(Prestamo p){
        listaPrestamo.add(p);
    }

    //metodo para buscar un prestamo por el id
    //que recibimos ? el id
    //que retornamos ? el prestamo
    public Prestamo buscar(long id){
        Prestamo pvacio = new Prestamo();
        for (Prestamo p: listaPrestamo){
            if(id== p.getId()){
                return p;
            }
        }
        return pvacio;
    }

    //metodo para contar los prestamos
    //que debe volver? int
    //que recibe?  nada
    public int contarPrestamos(){
        return listaPrestamo.size();
    }

    //metodo para contar los prestamos de un usuario
    //que debe volver? int
    //que recibe Usuario
    public int contarPrestamosUsuario(Usuario usuario){
        int contador= 0;
        for (Prestamo p: listaPrestamo){
            if(usuario == p.getUsuario()){
                contador++;
            }
        }
        return contador;
    }


}
