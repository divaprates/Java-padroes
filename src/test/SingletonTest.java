package test;

import padroes.singletons.SingletonEager;
import padroes.singletons.SingletonLazy;
import padroes.singletons.SingletonLazyHolder;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("--Lazy--");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("--Eager--");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("--Lazy-Holder--");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
