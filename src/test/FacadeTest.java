package test;

import padroes.facades.Facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Lua", "123123");
    }
}
