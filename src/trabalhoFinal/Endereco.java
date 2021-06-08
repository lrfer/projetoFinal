package trabalhoFinal;
import java.io.Serializable;  
public class Endereco implements Serializable {
	public String rua;
	public int nro;
	public int cep;
	public String cidade;
	public String bairro;
	
	
	public Endereco(String rua, int nro, int cep, String cidade, String bairro) {
		super();
		this.rua = rua;
		this.nro = nro;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
        public Endereco(){super();}
	public String getRua() {
		return rua;
	}
	public boolean setRua(String rua) {
		if (rua.length() > 0) {
			this.rua = rua;
			return true;
		}
		else
			return false;
	}
	public int getNro() {
		return nro;
	}
	public boolean setNro(int nro) {
		if (nro > 0) {
			this.nro = nro;
			return true;
		}
		else
			return false;
	}
	public int getCep() {
		return cep;
	}
	public boolean setCep(int cep) {
		if (cep > 0) {
			this.cep = cep;
			return true;
		}
		else
			return false;
	}
	public String getCidade() {
		return cidade;
	}
	public boolean setCidade(String cidade) {
		if (cidade.length() > 0) {
			this.cidade = cidade;
			return true;
		}
		else
			return false;
	}
	public String getBairro() {
		return bairro;
	}
	public boolean setBairro(String bairro) {
		if (bairro.length() > 0) {
			this.bairro = bairro;
			return true;
		}
		else
			return false;
	}
	
	
	
}
