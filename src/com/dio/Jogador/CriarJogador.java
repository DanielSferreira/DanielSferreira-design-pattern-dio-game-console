package com.dio.Jogador;

import com.dio.Classes.Classe;

public class CriarJogador {
    private final Jogador jogadorCriado;

    public CriarJogador() {
        jogadorCriado = Jogador.getInstance();
    }

    public CriarJogador(String nome, String raça, Classe classe) {
        jogadorCriado = Jogador.getInstance();
        jogadorCriado.setNome(nome);
        jogadorCriado.setRaça(raça);
        jogadorCriado.setClasse(classe);
    }

    public void definirNome(String nome) {
        jogadorCriado.setNome(nome);
    }

    public void definirRaça(String raça) {
        jogadorCriado.setRaça(raça);
    }

    public void definirClasse(Classe classe) {
        jogadorCriado.setClasse(classe);
    }

    public Jogador ObterNovoJogador() {
        return jogadorCriado;
    }
}
