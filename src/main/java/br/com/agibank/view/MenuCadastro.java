package br.com.agibank.view;

import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.DocumentoController;
import br.com.agibank.controller.UsuarioController;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuCadastro {
    public static void cadastro() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String nome;
        String apelido;
        String senha;
        String senhaConfirmada;
        String telefone;
        String email;
        LocalDate dataNascimento;
        String rua;
        String numero;
        String complemento;

        System.out.print(CoresTerminal.getYELLOW() + "CADASTRO DE USUARIO" + CoresTerminal.getRESET());
        System.out.print(CoresTerminal.getBLUE() +"\nNome: " + CoresTerminal.getRESET());
        nome = sc.next();
        sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Apelido: " + CoresTerminal.getRESET());
        apelido = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Senha: " + CoresTerminal.getRESET());
        senha = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Confirmacao senha: " + CoresTerminal.getRESET());
        senhaConfirmada = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Telefone: " + CoresTerminal.getRESET());
        telefone = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Email: " + CoresTerminal.getRESET());
        email = sc.nextLine();
        //System.out.print(CoresTerminal.getBLUE() + "Data de Nascimento (yyyy/MM/dd): " + CoresTerminal.getRESET());
        //dataNascimento = LocalDate.parse(sc.nextLine());
        System.out.print(CoresTerminal.getBLUE() + "Rua: " + CoresTerminal.getRESET());
        rua = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Numero: " + CoresTerminal.getRESET());
        numero = sc.nextLine();
        System.out.print(CoresTerminal.getBLUE() + "Complemento: " + CoresTerminal.getRESET());
        complemento = sc.nextLine();




        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario = new Usuario();

        if(usuarioController.cadastrarUsuario(nome,senha,senhaConfirmada, Integer.parseInt(telefone),apelido,email,rua, Integer.parseInt(numero),complemento) == 1) {

            System.out.println(CoresTerminal.getBLUE() + "Indique algumas informacoes sobre o documento escolhido para cadastro" + CoresTerminal.getRESET());
            System.out.print(CoresTerminal.getBLUE() + "Numero do Documento: " + CoresTerminal.getRESET());
            String numeroDoc = sc.nextLine();
            System.out.print(CoresTerminal.getBLUE() + "Arquivo do Documento: " + CoresTerminal.getRESET());
            String arquivo = sc.nextLine();

            int id_usuario = usuario.getId_Usuario();

            DocumentoController documentoController = new DocumentoController();
            documentoController.adicionarDocumento(id_usuario, " ", numero, arquivo);

            System.out.println(CoresTerminal.getGREEN() + "Cadastro realizado com sucesso!" + CoresTerminal.getRESET());
        }else{
            System.out.println(CoresTerminal.getRED() + "Erro ao realizar cadastro!" + CoresTerminal.getRESET());
            cadastro();
        }


    }
}
