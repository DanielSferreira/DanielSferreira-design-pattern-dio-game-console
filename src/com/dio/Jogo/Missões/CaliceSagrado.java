package com.dio.Jogo.Missões;

class CaliceSagrado extends Modalidade {
    @Override
    public void NomeDoJogo() {
        message("Você escoulhei a missão de encontrar o calice sagrado para o rei");
    }

    @Override
    public void Descrição() {
        message("Saindo para buscar o calice, vai em direção para a unica pista que tem");
        message("Encontrar um grande mago que possue todo o conhecimento do mundo");
        message("Chegando lá você pergunta a localização do Calice Sagrado");
        message("O mago explica que o calice está guardado por um dragão num topo de uma montaha");
        message("Ao Chegar na montanha, você encontra o dragão, e pede o calice");
        message("O Dragão percebendo sua boa vontade dá o calice e você volta para o reino");
    }
}
