package padroes.facades.subsistema2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Pindamonhangaba";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
