public class FuncionarioEstadoDesligado extends FuncionarioEstado {

    private static FuncionarioEstadoDesligado instance = new FuncionarioEstadoDesligado();

    public static FuncionarioEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Desligado";
    }
}
