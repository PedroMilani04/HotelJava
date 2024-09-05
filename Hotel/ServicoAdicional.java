/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;

public class ServicoAdicional {

    private ArrayList<Servico> servicos; //servicos gerenciados
    private Cliente cliente;            //Cliente que solicitou o servico
    private double valorTotal;          //valor total de todos os servicos
    //private Quarto quarto;

    public ServicoAdicional() {
    }

    public ServicoAdicional(Cliente cliente) {
        this.cliente = cliente;
        this.servicos = new ArrayList();
    }

    //  metodo que adiciona um servico
    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    // metodo para remover um servico especifico
    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    // metodo que remove todos os servicos de um cliente
    public void removerTodosServicos() {
        servicos.clear();
    }

    // metodo para exibir todos os servicos adicionais solicitados (no console)
    public void exibirServicos() {
        System.out.println("\n Segue todos os servicos solicitados por "+this.cliente.getNome()+": \n");
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            servico.exibir();
        }
    }

    // metodo para buscar servico especifico
    public Servico buscarPorNome(String nome) {
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            if (servico.getNome().equals(nome)) {
                return servico; // servico encontrado
            }
        }
        return null; // servico nao encontrado
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
    
    //  getValorTotal vai retornar todos os precos dos servicos solicitados somados
    public double getValorTotal() {
        this.valorTotal = 0;
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            this.valorTotal=+servico.getPreco();
        }
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
