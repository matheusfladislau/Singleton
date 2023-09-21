public class Fila{
    private static Fila Instancia = null;

    private Fila(){}

    public void ImprimeDocumento(){}
    public void RemoveDocumento(){}
    public void RemoveTodosDocumentos(){}

    public static Fila GetInstance(){
        if (Instancia == null){
            Instancia = new Fila();
        }
        return Instancia;
    }
}