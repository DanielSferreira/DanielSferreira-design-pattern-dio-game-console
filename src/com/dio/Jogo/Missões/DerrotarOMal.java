package com.dio.Jogo.Missões;

class DerrotarOMal extends Modalidade {
    @Override
    public void NomeDoJogo() {
        message("Você escoulheu a missão de derrotar o senhor das trevas");
    }

    @Override
    public void Descrição() {
        message("Você está prestes a enfrentar o mal que assola o reinado");
        message("Com toda a coregem, você segue para o reino das trevas");
        message("Entrando no castelo, o senhor das trevas te espera na sala do trono");
        message("você explica que errado atacar as vilas do reinado, e o senhor das trevas se comove");
        message("Ele pede desculpas e promete nunca mais atacar novamente");
    }
}
