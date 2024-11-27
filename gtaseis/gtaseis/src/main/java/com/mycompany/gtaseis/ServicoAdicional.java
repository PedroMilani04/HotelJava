package com.mycompany.gtaseis;

//  ServicoAdicional: Classe para gerenciar serviços adicionais de um Cliente
import java.util.ArrayList;

public class ServicoAdicional {

    private ArrayList<Servico> servicos; //  servicos gerenciados
    private Cliente cliente;    // Cliente que solicitou o servico
    private Quarto quarto;  // Quarto do Cliente que solicitou o servico
    private double valorTotal;   //  valor total de todos os servicos

    // Construtor para Cliente com Quarto
    public ServicoAdicional(Cliente cliente, Quarto quarto) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.servicos = new ArrayList();
    }

    //Construtor para Cliente sem Quarto
    public ServicoAdicional(Cliente cliente) {
        this.cliente = cliente;
        this.quarto = null;
        this.servicos = new ArrayList();
    }

    // metodo para exibir todos os servicos adicionais solicitados (no console)
    public void exibirServicos() {
        System.out.println("\n Segue todos os servicos solicitados por " + this.cliente.getNome() + ": \n");
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            servico.exibir();
        }
    }

    // metodo para buscar servico com nome e dia como parametros e retorna o servico em si
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
    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    // metodo que remove servico adicional com parametro servico
    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    // metodo para remover um servico baseado com o nome e dia
    public void removerServicoPorNomeDia(String nome, int dia) {
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            if (servico.getNome().equals(nome) && servico.getDia() == dia) {
                servicos.remove(i);
            }
        }
    }

    // metodo que remove todos os servicos de um cliente
    public void removerTodosServicos() {
        servicos.clear();
    }

    //  metodos getters e setters
    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        if (this.quarto != null) {
            return quarto;
        } else {
            throw new IllegalStateException("O Cliente nao possui quarto.");
        }
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    //  getValorTotal retorna valor total de todos os servicos solicitados
    public double getValorTotal() {
        this.valorTotal = 0;
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            this.valorTotal += servico.getValor();
        }
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
