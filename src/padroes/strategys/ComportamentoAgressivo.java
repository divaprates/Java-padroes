package padroes.strategys;

public class ComportamentoAgressivo implements Comportamento  {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente....");
    }
    
}
