package br.com.agibank.view;

import br.com.agibank.controller.DocumentoController;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDocumento {
    private DocumentoController documentoController;

    public MenuDocumento() {
        try {
            this.documentoController = new DocumentoController();
        } catch (Exception e) {
            System.err.println("Erro ao inicializar DocumentoController: " + e.getMessage());
        }
    }

    public void exibirMenuDocumento(int id_usuario) {
        Scanner sc = new Scanner(System.in);
        int interacao;

        do {
            System.out.println("\nDIGITE A OPCAO DESEJADA: ");
            System.out.println("2. ATUALIZAR DOCUMENTO");
            System.out.println("3. DELETAR DOCUMENTO");
            System.out.println("0. SAIR");

            try {
                System.out.print("Opcao: ");
                interacao = sc.nextInt();
                sc.nextLine();

                switch (interacao) {
//                    case 1: //ADICIONAR DOCUMENTO
//                        System.out.println("Numero do Documento: ");
//                        String numero = sc.nextLine();
//                        System.out.println("Arquivo do Documento: ");
//                        String arquivo = sc.nextLine();
//
//                        documentoController.adicionarDocumento(" ", numero, arquivo);
//
//                        break;
                    case 2: //ATUALIZAR DOCUMENTO
                        System.out.println("Numero do Documento: ");
                        String numeroAtualizado = sc.nextLine();
                        System.out.println("Arquivo do Documento: ");
                        String arquivoAtualizado = sc.nextLine();

//                        documentoController.inserirTipoDocumento(numeroAtualizado);

//                        int resultadoAtualizado = documentoController.alterarDocumento(id_usuario, " ", numeroAtualizado, arquivoAtualizado);

                        break;
                    case 3: //DELETAR DOCUMENTO
                        System.out.println("Digite o identificador do documento: ");
                        int identificador = Integer.parseInt(sc.nextLine());
                        documentoController.deletarDocumento(identificador);
                        System.out.println("Documento excluido com sucesso");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
                interacao = -1; // Força repetição do loop
            }

        }while (interacao != 0);

        sc.close();
    }

}
