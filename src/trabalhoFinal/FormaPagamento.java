package trabalhoFinal;

import java.io.Serializable;

public class FormaPagamento implements Serializable  {
	public String tipo;

	public FormaPagamento(String tipo) {
		super();
		this.tipo = tipo;
	}
        public FormaPagamento(){}

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
