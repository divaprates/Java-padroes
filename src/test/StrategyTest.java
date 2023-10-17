package test;

import padroes.strategys.Comportamento;
import padroes.strategys.ComportamentoAgressivo;
import padroes.strategys.ComportamentoDefensivo;
import padroes.strategys.ComportamentoNormal;
import padroes.strategys.Robo;

public class StrategyTest {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        System.out.println("--Strategy--");
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
    }
}
