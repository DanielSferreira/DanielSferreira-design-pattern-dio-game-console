package com.dio.Classes;

public enum ListaDeClasses {
    Guerreiro(new Guerreiro("Guerreiro")),
    Mago(new Mago("Mago")),
    Barbaro(new Barbaro("Barbáro"));

    private final Classe cqc;

    ListaDeClasses(Classe a) {
        cqc = a;
    }

    public Classe getInstance() {
        return cqc;
    }

}
