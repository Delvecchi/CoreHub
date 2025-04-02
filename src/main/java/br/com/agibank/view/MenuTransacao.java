package br.com.agibank.view;

import javax.swing.*;
import java.util.Scanner;

public class MenuTransacao {
    static Scanner sc = new Scanner(System.in);

    public static void exibirMenuTransacao(int id_usuario){
        int interacao;
        do{
            System.out.println("QUAL E A OPERACAO DESEJADA?: ");
            System.out.println("1. PIX");
            System.out.println("2. TED");
            System.out.println("3. SAIR");
            System.out.print("-> ");
            interacao  = sc.nextInt();
            switch (interacao){
                case 1:
                    System.out.println("PIX");
                    break;
                case 2:
                    System.out.println("TED");
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
            }
        }while(interacao!=3);
    }
}
