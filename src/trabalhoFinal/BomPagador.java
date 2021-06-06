package trabalhoFinal;
public class BomPagador {
	public String Nome;
	public String CPF;
	
	public BomPagador(String nome, String cPF) {
		super();
		Nome = nome;
		CPF = cPF;
	}

	public String getNome() {
		return Nome;
	}

	public boolean setNome(String nome) {
		if (nome.length() > 0) {
			this.Nome = nome;
			return true;
		}
		else
			return false;
	}

	public String getCPF() {
		return CPF;
	}

	public boolean setCPF(String cPF) {
		if (cPF.length() > 0) {
			this.CPF = cPF;
			return true;
		}
		else
			return false;
	}
	
}
