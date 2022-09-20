public class Pais {
    public static Pais instancia = null;

    public static Pais getIntance(){
        if (instancia==null) {
            instancia = new Pais();
            System.out.println("Se creo una intancia de Pais");
        }
        return instancia;
    }
}
