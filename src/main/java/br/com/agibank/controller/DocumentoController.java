package br.com.agibank.controller;

import br.com.agibank.beans.Documento;
import br.com.agibank.beans.Usuario;
import br.com.agibank.dao.DocumentoDAO;
import br.com.agibank.view.CoresTerminal;

import java.sql.SQLException;
import java.time.LocalDate;

public class DocumentoController {
    private DocumentoDAO DocumentoDAO = new DocumentoDAO();

    public DocumentoController() throws SQLException {
    }

    public void adicionarDocumento(int id_usuario, String tipo, int numero, String arquivo) throws SQLException {
        Documento documento = new Documento(id_usuario, tipo, numero, arquivo);
        try {
           DocumentoDAO.criarDocumento(documento);
        } catch (SQLException e) {
         System.out.println(e.getMessage());
        }

    }

    public void deletarDocumento(int id_documento){
        try{
            DocumentoDAO.deletarDocumento(id_documento);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void alterarDocumento(int id_usuario, String tipo, int numero, String arquivo) throws SQLException {
        DocumentoDAO.atualizarDocumento(id_usuario, tipo, numero, arquivo);
    }

    public void inserirDocumento(String numero) {
        try {
            if (numero.length() == 11) {
                DocumentoDAO.determinarTipoDocumento("cpf");
            } else if (numero.length() == 8) {
                DocumentoDAO.determinarTipoDocumento("rg");

            } else if (numero.length() == 9) {
                DocumentoDAO.determinarTipoDocumento("cnh");
            } else if (numero.length() == 14) {
                DocumentoDAO.determinarTipoDocumento("cnpj");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

