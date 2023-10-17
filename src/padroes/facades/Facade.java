package padroes.facades;

import padroes.facades.subsistema1.CrmService;
import padroes.facades.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);

        
    }
}
