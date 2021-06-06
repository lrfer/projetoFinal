package trabalhoFinal;
public class Cliente extends Pessoa implements ICliente {

	public String Email;
	public String Sexo;
	public String EstadoCivil;
	public String Profissao;
	
	public Cliente(String cpf, String nome, int telContato, Endereco endereco, String email, String sexo,
			String estadoCivil, String profissao) {
		super(cpf, nome, telContato, endereco);
		Email = email;
		Sexo = sexo;
		EstadoCivil = estadoCivil;
		Profissao = profissao;
	}

	public String getEmail() {
		return Email;
	}

	public boolean setEmail(String email) {
		if(email.length() > 0) {
		Email = email;
		return true;
		}
		else return false;
	}

	public String getSexo() {
		return Sexo;
	}

	public boolean setSexo(String sexo) {
		if(sexo.length()> 0) {
		Sexo = sexo;
		return true;
		}
		else return false;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public boolean setEstadoCivil(String estadoCivil) {
		if(estadoCivil.length() > 0)
		{
		EstadoCivil = estadoCivil;
		return true;
		}
		else return false;
	}

	public String getProfissao() {
		return Profissao;
	}

	public boolean setProfissao(String profissao) {
		if(profissao.length() > 0)
		{
		Profissao = profissao;
		return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return "Nome" + this.nome + "-" + "CPF: " + this.cpf + "- Email: " + this.Email;
	}

	@Override
	public double calculaBonusCliente() {
		return 0;
	}


}
