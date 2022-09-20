public class Usuario {
    private long id;
    private String nombre;
    //constructor metodo que tiene el mismo nombre de la clase
    //sirve para inicializar los valores de lo atributos de la clase
    //crearemos el constructor de la clase usuario

    public Usuario(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //sobrecarga de constructor
    //ej: crear un usuario sin ninguna informacion (sin id ni nombre)


    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
