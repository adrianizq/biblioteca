import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Prestamo {
    private long id;
    private List<Libro> listaLibros = new ArrayList<Libro>();
    private  Usuario usuario; //usuario es un objeto
    private Timestamp fechaPrestamo;
    private Timestamp fechaDevolucion;
    //crear un atributo de clase multa
    private  double  multa; //atributo de clase
    //crear otro atributo de clase diasGratis
    private   int diasGratis;

    public Prestamo(long id, List<Libro> listaLibros, Usuario usuario, Timestamp fechaPrestamo, Timestamp fechaDevolucion, double multa, int diasGratis) {
        this.id = id;
        this.listaLibros = listaLibros;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
        this.diasGratis = diasGratis;
    }

    public Prestamo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Timestamp getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Timestamp fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getDiasGratis() {
        return diasGratis;
    }

    public void setDiasGratis(int diasGratis) {
        this.diasGratis = diasGratis;
    }

    public long diasPrestamo(){
        long diferenciaMls = Math.abs(fechaDevolucion.getTime() - fechaPrestamo.getTime() );
        long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMls, TimeUnit.MILLISECONDS);
        return diferenciaDias;
    }

    public double calcularMulta(){
        long diasPrestamo = diasPrestamo();
        long diasMulta = diasPrestamo - getDiasGratis();
        double multa = getMulta() * diasMulta;
        return multa;
    }


    //metodo para imprimir la lista de libros de un prestamo
    public void reportarListaLibros(){
        //recorrer una lista
        for(Libro libro: listaLibros){
            System.out.println("Id libro: " + libro.getId()
                    + " Titulo: " + libro.getTitulo()
                    + " Paginas: " + libro.getPaginas());
        }
    }
}
