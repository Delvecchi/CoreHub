package br.com.agibank.controller;

import java.sql.SQLException;
import java.time.LocalTime;

public class VerificacaoSegurancaTransacaoController {

    public VerificacaoSegurancaTransacaoController() throws SQLException { }

    public boolean verificacaoSeguranca(double mediaValores, double valor) throws SQLException {
        boolean resultado = Boolean.parseBoolean(null);
        LocalTime horarioAtual = LocalTime.now();
        LocalTime start = LocalTime.of(6, 0);  // 6:00 AM
        LocalTime end = LocalTime.of(22, 0);   // 10:00 PM
        if ((valor <= mediaValores) && horarioAtual.isAfter(start) && horarioAtual.isBefore(end)) {
            resultado = true;
        }

        return resultado;
    }

}
