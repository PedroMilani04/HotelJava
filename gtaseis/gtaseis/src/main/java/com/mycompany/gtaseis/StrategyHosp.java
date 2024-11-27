package com.mycompany.gtaseis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
/**
 * Classe que implementa a estratégia de pagamento para hospedes.
 * Esta estratégia calcula o custo total da estadia e dos serviços utilizados
 * oferecendo um desconto para hospedes nos serviços adicionais no check-out.
 */
public class StrategyHosp extends Strategy {
    protected ArrayList <PagamentoReserva> pagamentos;
    

    /**
     * Método sobrescrito da classe base. Não utilizado diretamente, mas
     * mantido devido à assinatura abstrata na classe `Strategy`.
     */
    @Override
    public void gerarPagamento() {
        // Não utilizado, mas mantido devido à assinatura da classe base
    }

/**
     * Gera o pagamento para o cliente com base no check-out, considerando o custo
     * da estadia e dos serviços adicionais.
     * 
     * @param out o objeto `CheckOut` contendo as informações da reserva e dos serviços
     * @param c o cliente que está realizando o pagamento
     * @param idPaga o identificador da transação ou do pagamento
     */
    public void gerarPagamento(CheckOut out, Cliente c, String idPaga) {

        double d = 5.0;
        boolean temQuarto = false;
        double total = 0;
        for (Quarto q : out.quartos) {
            if (q.getCliente() == c.getCpf()) {
                LocalDateTime checkIn = q.getDataHora();
                // Period estadia = Period.between(checkIn, dataAtual);
                long estadia = ChronoUnit.DAYS.between(checkIn, LocalDateTime.now());
                total = q.getPreco() * estadia;
                q.setDisponibilidade(true);
                q.setDataHora(null);
                temQuarto = true;

                break;
            }
        }
        double desconto, custoServico;
        for (int i = 0; i < out.servicos.size(); i++) {
            if (out.servicos.get(i).getCliente() == c) {
                desconto = d / 100 * out.servicos.get(i).getValorTotal();
                custoServico = out.servicos.get(i).getValorTotal() - desconto;
                total = total + custoServico;
                break;
            }

        }
        PagamentoReserva paga = new PagamentoReservaPresencial(idPaga, total);
        pagamentos.add(paga);

        //--------------------------------------------------------------------------------
    }

}
