package Hotel;

public class Quarto {
	private boolean disponibilidade;
	private String cpfCliente;
	private int numeroDoQuarto;
	private double preco;
	private int andar;
	private enum TIPO{
		empresarial,
		casal,
		familia,
		presidencial;
	};
	private TIPO tipo;


	private Quarto () {}

	private Quarto (boolean dispo, String cliente, int numero, int andar, int tipo) {
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
	}
	}
	
	private boolean getDisponibilidade() {
		return disponibilidade;
	}
	private String getCliente() {
		return cpfCliente;
	}
	private int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}
	private double getPreco() {
		return preco;
	}
	private int getTipo() {
		switch(tipo) {
		case empresarial: return 0;
		case casal: return 1;
		case familia: return 2;
		case presidencial: return 3;
		}
	}
	private void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade=disponibilidade;
	}
	private void setCpfCliente(String cliente) {
		this.cpfCliente=cliente;
	}
	private void setNumero(int numero) {
		this.numeroDoQuarto=numero;
	}
	private void setAndar(int andar) {
		this.andar=andar;
	}
	private void setTipo(int tipo) {
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
		}
	}
}


