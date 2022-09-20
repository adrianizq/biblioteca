public class Libro {
    //Propiedades o atributos privados
    private Long id;
    private String titulo;
    private int paginas;
    private int ejemplares;
    //metodos


    public Libro(Long id, String titulo, int paginas, int ejemplares) {
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.ejemplares = ejemplares;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
}
