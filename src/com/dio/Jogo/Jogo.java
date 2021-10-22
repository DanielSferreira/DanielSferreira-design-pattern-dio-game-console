package com.dio.Jogo;

import com.dio.ExceptionEntradaInvalida;
import com.dio.Jogador.Jogador;
import com.dio.Jogo.Missões.EscolherModalidade;
import com.dio.Jogo.Missões.Modalidade;
import com.dio.Service.CriarJogadorPeloTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Jogo extends DefinirNovoJogo {

    Scanner line = new Scanner(System.in);

    public Jogo(String fase, Jogador jogador, Modalidade modalidade) {
        this.fase = fase;
        this.jogador = jogador;
        this.modalidade = modalidade;
    }

    public Jogo() {
    }

    @Override
    public void IniciarJogo() {
        this.modalidade.NomeDoJogo();
        this.modalidade.Descrição();
    }

    @Override
    public void DefinirJogador() {
        CriarJogadorPeloTerminal newPlayer = new CriarJogadorPeloTerminal();
        this.jogador = newPlayer.ObterJogadorPeloTerminal();
    }

    @Override
    public void DefinirModalidadeDeJogo() throws ExceptionEntradaInvalida {
        String s = EscolherModalidade.ListarJogosDisponiveis();
        this.modalidade = EscolherModalidade.Escolher(s);
    }

    @Override
    public boolean TrocarAModalidadeDeJogo() throws ExceptionEntradaInvalida {
        System.out.println("Continuar outra missão? S/N");
        String res = line.next();
        if (res.toUpperCase(Locale.ROOT).equals("S"))
            return true;
        else if (res.toUpperCase(Locale.ROOT).equals("N"))
            return false;
        else
            throw new ExceptionEntradaInvalida("Opção");
    }
}
