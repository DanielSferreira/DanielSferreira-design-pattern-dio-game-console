package com.dio.Jogo;

import com.dio.ExceptionEntradaInvalida;
import com.dio.Jogador.Jogador;
import com.dio.Jogo.Missões.Modalidade;

abstract class DefinirNovoJogo {
    protected String fase;
    protected Jogador jogador;
    protected Modalidade modalidade;

    public void IniciarJogo() {
    }

    public void DefinirJogador() {
    }

    public void DefinirModalidadeDeJogo() throws ExceptionEntradaInvalida {
    }

    public boolean TrocarAModalidadeDeJogo() throws ExceptionEntradaInvalida {
        return true;
    }
}
