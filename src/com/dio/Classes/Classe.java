package com.dio.Classes;

public abstract class Classe {
    public String nomeDaClasse;


    public void definirNomeClasse(String nomeClasse) {
        nomeDaClasse = nomeClasse;
    }

    public String obterNomeClasse(String nomeClasse) {
        return nomeClasse;
    }
}