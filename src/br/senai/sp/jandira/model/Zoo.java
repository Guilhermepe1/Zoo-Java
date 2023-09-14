package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    List<Cachorro> listCachorro = new ArrayList<>();
    /** Instancia teclado */
    Scanner teclado = new Scanner(System.in);

    public void menu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("------------ Menu ------------");
            System.out.println(" 1 - Cadastrar cachorro");
            System.out.println(" 2 - Listar cachorros");
            System.out.println(" 3 - Sair");
            System.out.println("------------------------------");
            System.out.print("Digite sua opção: ");
            int opcaoUser = teclado.nextInt();
            teclado.nextLine();
            System.out.println("------------------------------");

            /** Instancia cachorro */
            Cachorro cachorro = new Cachorro();

            switch (opcaoUser) {
                case 1:
                    cachorro.cadastrarCachorro();
                    adicionarCachorro(cachorro);
                    break;
                case 2:
                    listarCachorro();
                    break;
                case 3:
                    continuar = false;
                    break;
            }
        }
    }

    public void adicionarCachorro(Cachorro cachorro) {
        listCachorro.add(cachorro);
    }

    public void listarCachorro() {
        System.out.println("/-      Cachorros disponíveis: "+listCachorro.size()+"       -/");
        System.out.println("------------------------------");
        for (Cachorro cachorro : listCachorro) {
            System.out.println("Nome: "+cachorro.nome);
            System.out.println("Apelido: "+cachorro.apelido);
            System.out.println("Raça: "+cachorro.raca);
            System.out.println("Cor: "+cachorro.cor);
            System.out.println("Idade: "+cachorro.idade);
            System.out.println("------------------------------");
        }
    }
}
