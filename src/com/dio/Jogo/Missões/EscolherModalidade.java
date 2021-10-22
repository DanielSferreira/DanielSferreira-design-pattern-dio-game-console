package com.dio.Jogo.Missões;

import com.dio.ExceptionEntradaInvalida;

import java.util.Scanner;

public abstract class EscolherModalidade {
    public static Modalidade Escolher(String Escolha) throws ExceptionEntradaInvalida {
        switch (Escolha) {
            case "1":
                return new SalvarReino();
            case "2":
                return new CaliceSagrado();
            case "3":
                return new DerrotarOMal();
            default:
                throw new ExceptionEntradaInvalida("Modalidade");
        }
    }

    public static String ListarJogosDisponiveis() {
        System.out.println("As missões são:");
        System.out.println("1 = Salvar o Reino");
        System.out.println("2 = Encontrar o calice Sagrado");
        System.out.println("3 = Derrotar o Mal");
        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }
}
