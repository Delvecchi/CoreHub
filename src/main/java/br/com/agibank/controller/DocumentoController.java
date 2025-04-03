package br.com.agibank.controller;

import br.com.agibank.beans.Documento;
import br.com.agibank.beans.Usuario;
import br.com.agibank.dao.DocumentoDAO;

import java.sql.SQLException;

public class DocumentoController {
    private DocumentoDAO DocumentoDAO = new DocumentoDAO();

    public DocumentoController() throws SQLException {
    }

    public int adicionarDocumento(int idUsuario, String tipo, String numero, String arquivo) throws SQLException {
        try {
            Documento documento = new Documento(1, idUsuario, tipo, numero, arquivo);
            DocumentoDAO.criarDocumento(documento);
            inserirTipoDocumento(numero, idUsuario);
        } catch (SQLException e) {
         System.out.println(e.getMessage());
        }

        return 0;
    }

//    public void cadastroEAdicaoDeDocumento() throws SQLException {
//        // Primeiro, cadastra o usuário e obtém o id_usuario
//        int idUsuario = cadastrarUsuario("João", "senha123", "senha123", 123456789, "Joãozinho", "joao@email.com", "Rua A", 123, "Apt 101");
//
//        if (idUsuario != 0) { // Se o cadastro for bem-sucedido
//            // Agora, adiciona o documento associando ao id_usuario
//            adicionarDocumento(idUsuario, "RG", "123456789", "caminho/do/arquivo.pdf");
//        } else {
//            System.out.println("Cadastro do usuário falhou.");
//        }
//    }


    public void deletarDocumento(int id_documento){
        try{
            DocumentoDAO.deletarDocumento(id_documento);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

//    public int alterarDocumento(int id_usuario, String tipo, String numero, String arquivo) throws SQLException {
//        DocumentoDAO.atualizarDocumento(id_usuario, tipo, numero, arquivo);
//        inserirTipoDocumento(numero);
//        return id_usuario;
//    }

    public void inserirTipoDocumento(String numero, int idUsuario) {
        try {
            if (numero.length() == 11) {
                DocumentoDAO.determinarTipoDocumento("cpf", idUsuario);
            } else if (numero.length() == 8) {
                DocumentoDAO.determinarTipoDocumento("rg", idUsuario);
            } else if (numero.length() == 9) {
                DocumentoDAO.determinarTipoDocumento("cnh", idUsuario);
            } else if (numero.length() == 14) {
                DocumentoDAO.determinarTipoDocumento("cnpj", idUsuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void adicionarDocumento(String numero) {
    }
}

