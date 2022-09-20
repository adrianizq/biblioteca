import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public ListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public ListaUsuarios() {
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //metodo para agregar usuarios a la lista de libros
    public void agregar(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    //metodo para buscar un usuario por el id
    //que recibimos ? el id
    //que retornamos ? el Usuario
    public Usuario buscar(long id){
        Usuario uvacio = new Usuario();
        for (Usuario u: listaUsuarios){
            if(id== u.getId()){
                return u;
            }
        }
        return uvacio;
    }
}
