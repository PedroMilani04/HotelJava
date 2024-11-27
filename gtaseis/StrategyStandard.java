package com.mycompany.gtaseis;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class StrategyStandard extends Strategy {
    protected ArrayList <PagamentoReserva> pagamentos;
    
    @Override
    public void gerarPagamento() {
        // Não utilizado, mas mantido devido à assinatura da classe base
    }

    public void gerarPagamento(CheckOut out, Cliente c, String idPaga) {

        double total = 0;
        for (Quarto q : out.quartos) {
            if (q.getCliente() == c.getCpf()) {
                LocalDateTime checkIn = q.getDataHora();
                // Period estadia = Period.between(checkIn, dataAtual);
                long estadia = ChronoUnit.DAYS.between(checkIn, LocalDateTime.now());
                total = q.getPreco() * estadia;
                q.setDisponibilidade(true);
                q.setDataHora(null);

                break;
            }
        }
        for (int i = 0; i < out.servicos.size(); i++) {
            if (out.servicos.get(i).getCliente() == c) {
                total = total + out.servicos.get(i).getValorTotal();
                break;
            }

        }
        PagamentoReserva paga = new PagamentoReservaPresencial(idPaga, total);
        pagamentos.add(paga);

        //--------------------------------------------------------------------------------
    }

}
