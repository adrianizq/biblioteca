import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
//crear un objeto de tipo ListaLibros
        ListaLibros lLibros = new ListaLibros();
        lLibros.agregarLibros(new Libro(20L,"Programacion de Objetos en Java",500,5));
        lLibros.agregarLibros(new Libro(21L,"Javascript", 600,3));
        lLibros.agregarLibros(new Libro(22L,"HTML", 300,5));
        lLibros.agregarLibros(new Libro(23L,"Java", 400,5));
        lLibros.agregarLibros(new Libro(24L,"NodeJS", 250,7));

        //crear un objeto de tipo ListaUsuarios
        ListaUsuarios lUsuarios = new ListaUsuarios();
        lUsuarios.agregar(new Usuario(50,"Maria Hernandez"));
        lUsuarios.agregar(new Usuario(51,"Rocio Martinez"));
        lUsuarios.agregar(new Usuario(52,"Carmen Villareal"));

        //probar el metodo para buscar de ListaUsuarios
        //Usuario u = lUsuarios.buscar(100);
        //System.out.println("usuario: " + u.getNombre());

        ListaLibros lLibrosPrestamo1 = new ListaLibros();
        lLibrosPrestamo1.agregarLibros(lLibros.buscar(20L));
        lLibrosPrestamo1.agregarLibros(lLibros.buscar(22L));

        ListaLibros lLibrosPrestamo2 = new ListaLibros();
        lLibrosPrestamo2.agregarLibros(lLibros.buscar(24L));
        lLibrosPrestamo2.agregarLibros(lLibros.buscar(21L));

        ListaPrestamos lPrestamos = new ListaPrestamos();
        lPrestamos.agregar(new Prestamo(1L,lLibrosPrestamo1.getListaLibros(), lUsuarios.buscar(50),
                Timestamp.valueOf("2022-08-10 10:30:00"),
                Timestamp.valueOf("2022-08-15 10:30:00"),2500,5));
        lPrestamos.agregar(new Prestamo(2L,lLibrosPrestamo2.getListaLibros(), lUsuarios.buscar(52),
                Timestamp.valueOf("2022-08-13 10:30:00"),
                Timestamp.valueOf("2022-08-18 10:30:00"),2500,5));

        System.out.println("Cantidad de prestamos " + lPrestamos.contarPrestamos() );

        int cant = lPrestamos.contarPrestamosUsuario(lUsuarios.buscar(50));
        System.out.println("Cantidad de prestamos" + cant + lUsuarios.buscar(50).getNombre());

        //probar el metodo buscar del ListaLibros
        /*Libro l = lLibros.buscar(30L);
        if(l!=null) {
            System.out.println("EL libro es " + l.getTitulo());
        }
        else{
            System.out.println("No se encontro el libro");
        }*/

        /*

        Usuario usuario1 = new Usuario(21,"Maria Hernandez");
        Prestamo p = new Prestamo();
        p.setId(1L);
        //agregar a un prestamo p , el usuario1
        p.setUsuario(usuario1);
        //agragar la lista de libros que el usuario pidio
        p.setListaLibros(lLibros);

         */
/*
        Prestamo.setMulta(5000);
        //Asignar el numero de dias gratis
        Prestamo.setDiasGratis(5);

*/
/*

        p.setFechaPrestamo(Timestamp.valueOf("2022-08-10 10:30:00"));

        p.setFechaDevolucion(Timestamp.valueOf("2022-08-19 10:30:00"));
//        System.out.println(p.getFechaDevolucion());
        //https://www.baeldung.com/java-date-difference

//        System.out.println("Dias de prestamo: " +p.diasPrestamo());
//        System.out.println("Multa = " + p.calcularMulta());

        System.out.println("Prestamo id:"  + p.getId());
        System.out.println("Usuario: " + p.getUsuario().getNombre());
        p.reportarListaLibros();
*/


    }
}
