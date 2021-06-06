package trabalhoFinal;

public class FormaPagamento {
	public String tipo;

	public FormaPagamento(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean setTipo(String tipo) {
		if(tipo.length() > 0) {
		this.tipo = tipo;
		return true;
		}
		else return false;
	}
	
}
