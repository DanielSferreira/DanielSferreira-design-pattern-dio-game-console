package com.dio.Service;

import com.dio.Classes.Classe;
import com.dio.Classes.ListaDeClasses;
import com.dio.Jogador.CriarJogador;
import com.dio.Jogador.Jogador;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CriarJogadorPeloTerminal {
    private final Scanner line = new Scanner(System.in);
    private final CriarJogador novoJogador;

    public CriarJogadorPeloTerminal() {
        novoJogador = new CriarJogador();

        System.out.println("Escolha: ");
        System.out.print("O Nome do jogador: ");
        novoJogador.definirNome(line.nextLine());

        System.out.print("A Raça: ");
        novoJogador.definirRaça(line.nextLine());

        novoJogador.definirClasse(ListClasses());
    }

    public Jogador ObterJogadorPeloTerminal() {
        return novoJogador.ObterNovoJogador();
    }

    private Classe ListClasses() {
        List<ListaDeClasses> listaDeClasses = Arrays.asList(ListaDeClasses.values());

        System.out.println("Digita o número referente a classe desejada:");

        for (int at = 0; at < listaDeClasses.size(); at++) {
            System.out.println(at + 1 + " = " + listaDeClasses.get(at));
        }
        try {
            int entrada = ÉNumero() - 1;
            return listaDeClasses.get(entrada).getInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ListClasses();
    }

    private int ÉNumero() {
        var batata = line.nextLine();
        try {
            int cenoura = Integer.parseInt(batata);
            return cenoura;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
