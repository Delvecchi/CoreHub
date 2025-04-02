package br.com.agibank;
import br.com.agibank.controller.VerificacaoSegurancaTransacaoController;
import br.com.agibank.dao.DocumentoDAO;
import br.com.agibank.dao.transacoes.VerificacaoSegurancaDAO;
import br.com.agibank.daos.UsuarioDAO;
import br.com.agibank.view.MenuDocumento;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
//        Scanner sc = new Scanner(System.in);
//        MenuInicial.exibirMenuInicial(sc);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        int resultado = usuarioDAO.localizarIdUsuario(123);
        System.out.println(resultado);
//        try {

//                VerificacaoSegurancaDAO verificacaoSegurancaDAO = new VerificacaoSegurancaDAO();
//                double resultado = verificacaoSegurancaDAO.mediaValores(1);
//                System.out.println(resultado);

//                VerificacaoSegurancaDAO verificacaoSegurancaDAO = new VerificacaoSegurancaDAO();
//                double resultado = verificacaoSegurancaDAO.maiorValor(1);
//                System.out.println(resultado);

//            VerificacaoSegurancaDAO verificacaoSegurancaDAO = new VerificacaoSegurancaDAO();
//            Date resultado = verificacaoSegurancaDAO.horarioTransacao(3);
//            System.out.println(resultado);

//            VerificacaoSegurancaTransacaoController verificacaoSegurancaTransacaoController = new VerificacaoSegurancaTransacaoController();
//            boolean resultado = verificacaoSegurancaTransacaoController.verificacaoSeguranca(2000, 2200 );
//            System.out.println(resultado);

////            Documento documento = new Documento(1, 12, " ", " ", " ");
////            DocumentoDAO documentoDAO = new DocumentoDAO();
////            documentoDAO.criarDocumento(documento);
//
////            DocumentoController documentoController = new DocumentoController();
////            documentoController.adicionarDocumento(12, " ", "12345678901", "foto");
//
////            DocumentoController documentoController = new DocumentoController();
////            documentoController.adicionarDocumento(12, " ", "12345678901", " ");
//
//            DocumentoDAO documentoDAO = new DocumentoDAO();
//            documentoDAO.deletarDocumento(22);
//
////            DocumentoDAO documentoDAO = new DocumentoDAO();
////            documentoDAO.determinarTipoDocumento("cpf");
//
//
////            DocumentoController documentoController = new DocumentoController();
////            documentoController.inserirTipoDocumento("12312312");
//
//        MenuDocumento menuDocumento = new MenuDocumento();
//        menuDocumento.exibirMenuDocumento(15);

//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }





    }
}