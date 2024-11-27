package com.mycompany.gtaseis;
import java.time.LocalDateTime;

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


	public Quarto () {}

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
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	public String getCliente() {
		return this.cpfCliente;
	}
	public int getNumeroDoQuarto() {
		return this.numeroDoQuarto;
	}
	public int getAndar() {
		return this.andar;
	}
	public double getPreco() {
		return this.preco;
	}
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
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade=disponibilidade;
	}
	public void setCpfCliente(String cliente) {
		this.cpfCliente=cliente;
	}
	public void setNumero(int numero) {
		this.numeroDoQuarto=numero;
	}
	public void setAndar(int andar) {
		this.andar=andar;
	}
        public LocalDateTime getDataHora() {
		return this.dataHora;
	}
        public void setDataHora(LocalDateTime dataHora) {
		this.dataHora=dataHora;
	}
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
