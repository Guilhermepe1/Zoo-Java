package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cachorro {
    String nome, apelido, raca, cor;
    int idade;
    /** Instancia teclado */
    Scanner teclado = new Scanner(System.in);

    public void cadastrarCachorro() {
        System.out.println("/----       Cachorro        ----/");
        System.out.print("Informe o nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe o apelido: ");
        apelido = teclado.nextLine();
        System.out.print("Informe a raça: ");
        raca = teclado.nextLine();
        System.out.print("Informe a cor: ");
        cor = teclado.nextLine();
        System.out.print("Informe a idade: ");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("/----       Cadastro Finalizado!        ----/");

    }
}
