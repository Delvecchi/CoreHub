package br.com.agibank.controller;

import br.com.agibank.beans.transacoes.StatusTransacao;
import br.com.agibank.beans.transacoes.Transacao;


import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class VerificacaoSegurancaTransacao {
    Transacao transacao = new Transacao();
    StatusTransacao statusTransacao = new StatusTransacao();

    public VerificacaoSegurancaTransacao() throws SQLException { }

    public int horarioTransacao(Date data) throws SQLException {
        Timestamp timestamp = Timestamp.valueOf("2025-03-31 10:30:00");
        Date dataTransacao = new Date();

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataTransacao);

        int hora = calendario.get(Calendar.HOUR);



        return hora;
    }

}
