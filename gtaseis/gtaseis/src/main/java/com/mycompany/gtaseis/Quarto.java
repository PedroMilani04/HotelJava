package com.mycompany.gtaseis;
import java.time.LocalDateTime;



/**
 * Representa um quarto de hotel. Esta classe armazena informações sobre o quarto, como
 * sua disponibilidade, o cliente associado através do CPF e não da classe Cliente, a classe quarto
 * ignora totalmente a existencia do cliente, o número do quarto, o preço, o andar em que se encontra,
 * e o tipo de quarto (empresarial, casal, família, presidencial).
 * 
 * A classe permite gerenciar o estado do quarto, como sua disponibilidade, e manipular suas propriedades.
 */

public class Quarto {
	protected boolean disponibilidade;
	protected String cpfCliente;
	protected int numeroDoQuarto;
	protected double preco;
	protected int andar;
        protected LocalDateTime dataHora;
	protected enum TIPO{
		empresarial,
		casal,
		familia,
		presidencial;
	};
	protected TIPO tipo;


    /**
     * Construtor padrão da classe Quarto, que não inicializa os atributos.
     */

	public Quarto () {}

/**
     * Construtor da classe Quarto, que inicializa todos os atributos com base nas informações fornecidas.
     * O preço é determinado com base no tipo do quarto informado.
     * 
     * @param dispo Indica se o quarto está disponível.
     * @param cliente CPF do cliente que reservou o quarto.
     * @param numero Número do quarto.
     * @param andar Andar onde o quarto está localizado.
     * @param tipo Tipo de quarto (0 - empresarial, 1 - casal, 2 - família, 3 - presidencial).
     */
	public Quarto (boolean dispo, String cliente, int numero, int andar, int tipo) {
	this.disponibilidade=dispo;
	this.cpfCliente=cliente;
	this.numeroDoQuarto=numero;
	this.andar=andar;
	switch(tipo) {
	case 0: this.tipo= TIPO.empresarial;
		this.preco=450;
		break;
	case 1: this.tipo= TIPO.casal;
		this.preco=400.50;
		break;
	case 2: this.tipo= TIPO.familia;
		this.preco=524.8;
		break;
	case 3: this.tipo= TIPO.presidencial;
		this.preco=783.72;
		break;
	default: System.out.println("Tipo informado não compatível");
	}
	}
	
	/**
     * Retorna a disponibilidade do quarto (se está ocupado ou livre).
     * 
     * @return true se o quarto estiver disponível, false caso contrário.
     */
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}

	/**
     * Retorna o CPF do cliente que fez a reserva do quarto.
     * 
     * @return O CPF do cliente.
     */
	public String getCliente() {
		return this.cpfCliente;
	}
	 /**
     * Retorna o número do quarto.
     * 
     * @return O número do quarto.
     */
	public int getNumeroDoQuarto() {
		return this.numeroDoQuarto;
	}
	/**
     * Retorna o andar em que o quarto está localizado.
     * 
     * @return O andar do quarto.
     */
	public int getAndar() {
		return this.andar;
	}
	/**
     * Retorna o preço do quarto.
     * 
     * @return O preço do quarto.
     */
	public double getPreco() {
		return this.preco;
	}
	/**
     * Retorna o tipo do quarto como um número inteiro (0 - empresarial, 1 - casal, 2 - família, 3 - presidencial).
     * 
     * @return O tipo do quarto.
     */
	public int getTipo() {
		switch(tipo) {
		case empresarial: return 0;
		case casal: return 1;
		case familia: return 2;
		case presidencial: return 3;
		default: System.out.println("Quarto com tipo não informado ou inválido");
			return -1;
		}
	}
	/**
     * Define a disponibilidade do quarto (se ele está disponível ou ocupado).
     * 
     * @param disponibilidade O novo estado de disponibilidade do quarto.
     */
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade=disponibilidade;
	}
	/**
     * Define o CPF do cliente que reservou o quarto.
     * 
     * @param cliente O CPF do cliente.
     */
	public void setCpfCliente(String cliente) {
		this.cpfCliente=cliente;
	}
	/**
     * Define o número do quarto.
     * 
     * @param numero O número do quarto.
     */
	public void setNumero(int numero) {
		this.numeroDoQuarto=numero;
	}
	/**
     * Define o andar em que o quarto está localizado.
     * 
     * @param andar O andar do quarto.
     */
	public void setAndar(int andar) {
		this.andar=andar;
	}
	/**
     * Retorna a data e hora associada ao quarto, como a data de check-in.
     * 
     * @return A data e hora associada ao quarto.
     */
        public LocalDateTime getDataHora() {
		return this.dataHora;
	}
	/**
     * Define a data e hora associada ao quarto (por exemplo, data de check-in).
     * 
     * @param dataHora A data e hora a ser definida para o quarto.
     */
        public void setDataHora(LocalDateTime dataHora) {
		this.dataHora=dataHora;
	}
	/**
     * Define o tipo do quarto com base no código fornecido.
     * 
     * @param tipo O código do tipo de quarto (0 - empresarial, 1 - casal, 2 - família, 3 - presidencial).
     */
	public void setTipo(int tipo) {
		switch(tipo) {
		case 0: this.tipo= TIPO.empresarial;
			this.preco=450;
			break;
		case 1: this.tipo= TIPO.casal;
			this.preco=400.50;
			break;
		case 2: this.tipo= TIPO.familia;
			this.preco=524.8;
			break;
		case 3: this.tipo= TIPO.presidencial;
			this.preco=783.72;
			break;
		default: System.out.println("Tipo informado não disponível");
		}
	}
}
