package br.com.agibank;
import br.com.agibank.beans.Documento;
import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.DocumentoController;
import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.AgenciaController;
import br.com.agibank.dao.DocumentoDAO;
import br.com.agibank.daos.UsuarioDAO;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.agibank.dao.conta.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException{
//        Scanner sc = new Scanner(System.in);
//        MenuInicial.exibirMenuInicial(sc);
        try {
//            Documento documento = new Documento(1, 12, " ", " ", " ");
//            DocumentoDAO documentoDAO = new DocumentoDAO();
//            documentoDAO.criarDocumento(documento);

//            DocumentoController documentoController = new DocumentoController();
//            documentoController.adicionarDocumento(12, " ", "12345678901", "foto");

            DocumentoController documentoController = new DocumentoController();
            documentoController.adicionarDocumento(12, " ", "12345678901", " ");

//            DocumentoDAO documentoDAO = new DocumentoDAO();
//            documentoDAO.deletarDocumento(8);

//            DocumentoDAO documentoDAO = new DocumentoDAO();
//            documentoDAO.determinarTipoDocumento("cpf");


//            DocumentoController documentoController = new DocumentoController();
//            documentoController.inserirTipoDocumento("12312312");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}