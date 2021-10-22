package com.dio;

import com.dio.Jogo.Jogo;


public class Main {
    public static void main(String[] args) throws ExceptionEntradaInvalida {

        Jogo jogo = new Jogo();
        jogo.DefinirJogador();

        boolean conti = true;

        do {
            jogo.DefinirModalidadeDeJogo();
            jogo.IniciarJogo();
            conti = jogo.TrocarAModalidadeDeJogo();
        } while (conti);

    }
}
