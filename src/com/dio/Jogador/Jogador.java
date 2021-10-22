package com.dio.Jogador;


public class Jogador extends DefiniçõesDeJogadores {
    private static Jogador instance;

    private Jogador() {
    }

    public static Jogador getInstance() {
        if (instance == null) {
            instance = new Jogador();
        }
        return instance;
    }


}


