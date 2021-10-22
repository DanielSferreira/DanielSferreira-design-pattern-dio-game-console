package com.dio.Jogo.Missões;

import java.util.Scanner;

public class Modalidade {
    private final Scanner scanner = new Scanner(System.in);

    public void NomeDoJogo() {
    }

    public void Descrição() {
    }

    protected void message(String message) {
        System.out.println(message);
        System.out.print("\tPressione enter...");
        scanner.nextLine();
    }

}
