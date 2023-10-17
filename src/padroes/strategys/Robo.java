package padroes.strategys;

public class Robo {

    // estratégia de comportamento para o robô
    private Comportamento strategy;
    
    public void setStrategy(Comportamento comportamento) {
        this.strategy = comportamento;
    }

    public void mover() {
        strategy.mover();
    }
}
