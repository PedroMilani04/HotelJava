package com.mycompany.gtaseis;

//  ServicoAdicional: Classe para gerenciar serviços adicionais de um Cliente
import java.util.ArrayList;

/**
 * Classe que gerencia os serviços adicionais solicitados por um cliente.
 * Cada serviço pode estar associado a um cliente, com ou sem quarto reservado.
 */

public class ServicoAdicional {

    private ArrayList<Servico> servicos; //  servicos gerenciados
    private Cliente cliente;    // Cliente que solicitou o servico
    private Quarto quarto;  // Quarto do Cliente que solicitou o servico
    private double valorTotal;   //  valor total de todos os servicos

    // Construtor para Cliente com Quarto

     /**
     * Construtor para clientes com quarto.
     * 
     * @param cliente o cliente que solicitou o serviço
     * @param quarto o quarto associado ao cliente
     */
    public ServicoAdicional(Cliente cliente, Quarto quarto) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.servicos = new ArrayList();
    }

    //Construtor para Cliente sem Quarto

    /**
     * Construtor para clientes sem quarto.
     * 
     * @param cliente o cliente que solicitou o serviço
     */

    public ServicoAdicional(Cliente cliente) {
        this.cliente = cliente;
        this.quarto = null;
        this.servicos = new ArrayList();
    }

    // metodo para exibir todos os servicos adicionais solicitados (no console)

    /**
     * Exibe todos os serviços adicionais solicitados no console.
     */
    public void exibirServicos() {
        System.out.println("\n Segue todos os servicos solicitados por " + this.cliente.getNome() + ": \n");
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            servico.exibir();
        }
    }

    // metodo para buscar servico com nome e dia como parametros e retorna o servico em si
    /**
     * Busca um serviço pelo nome e dia.
     * 
     * @param nome o nome do serviço
     * @param dia o dia do serviço
     * @return o serviço encontrado, ou null se não for encontrado
     */
    public Servico buscarPorNomeDia(String nome, int dia) {
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            if (servico.getNome().equals(nome) && servico.getDia() == dia) {
                return servico; // servico encontrado
            }
        }
        return null; // servico nao encontrado
    }

    //  metodo que adiciona um servico
    /**
     * Adiciona um novo serviço à lista de serviços.
     * 
     * @param servico o serviço a ser adicionado
     */

    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    // metodo que remove servico adicional com parametro servico
    /**
     * Remove um serviço específico da lista de serviços.
     * 
     * @param servico o serviço a ser removido
     */

    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    // metodo para remover um servico baseado com o nome e dia

    /**
     * Remove um serviço com base no nome e no dia.
     * 
     * @param nome o nome do serviço
     * @param dia o dia do serviço
     */
    public void removerServicoPorNomeDia(String nome, int dia) {
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            if (servico.getNome().equals(nome) && servico.getDia() == dia) {
                servicos.remove(i);
            }
        }
    }

    // metodo que remove todos os servicos de um cliente
    /**
     * Remove todos os serviços solicitados por um cliente.
     */
    public void removerTodosServicos() {
        servicos.clear();
    }

    //  metodos getters e setters

    /**
     * Retorna a lista de serviços gerenciados.
     * 
     * @return a lista de serviços
     */
    public ArrayList<Servico> getServicos() {
        return servicos;
    }
    /**
     * Define a lista de serviços gerenciados.
     * 
     * @param servicos a nova lista de serviços
     */
    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
/**
     * Retorna o cliente associado aos serviços.
     * 
     * @return o cliente associado
     */
    public Cliente getCliente() {
        return cliente;
    }
 /**
     * Define o cliente associado aos serviços.
     * 
     * @param cliente o cliente a ser associado
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Retorna o quarto associado ao cliente.
     * 
     * @return o quarto associado
     * @throws IllegalStateException se o cliente não possuir um quarto
     */
    public Quarto getQuarto() {
        if (this.quarto != null) {
            return quarto;
        } else {
            throw new IllegalStateException("O Cliente nao possui quarto.");
        }
    }

/**
     * Define o quarto associado ao cliente.
     * 
     * @param quarto o quarto a ser associado
     */
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    //  getValorTotal retorna valor total de todos os servicos solicitados
    
    /**
     * Calcula e retorna o valor total de todos os serviços solicitados.
     * 
     * @return o valor total dos serviços
     */
    public double getValorTotal() {
        this.valorTotal = 0;
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            this.valorTotal += servico.getValor();
        }
        return this.valorTotal;
    }
/**
     * Define o valor total dos serviços (não recomendado, pois é calculado automaticamente).
     * 
     * @param valorTotal o valor total a ser definido
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
