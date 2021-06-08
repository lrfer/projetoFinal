package trabalhoFinal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	public String Telefone;
	public String TelCelular;
	public LocalDate DataIngressoImobiliaria;
	public String Cargo;
	public static double SalarioBase = 1000;
	
	public Funcionario(String cpf, String nome, String telContato, Endereco endereco, String telefone, String telCelular,
			LocalDate dataIngressoImobiliaria, String cargo) {
		super(cpf, nome, telContato, endereco);
		Telefone = telefone;
		TelCelular = telCelular;
		DataIngressoImobiliaria = dataIngressoImobiliaria;
		Cargo = cargo;
	}
        public Funcionario(){}
	public String getTelefone() {
		return Telefone;
	}

	public boolean setTelefone(String telefone) {
		if (telefone.length() > 0) {
			this.Telefone = telefone;
			return true;
		}
		else
			return false;
	}

	public String getTelCelular() {
		return TelCelular;
	}

	public boolean setTelCelular(String telCelular) {
		if (telCelular.length() > 0) {
			this.TelCelular = telCelular;
			return true;
		}
		else
			return false;
	}

	public LocalDate getDataIngressoImobiliaria() {
		return DataIngressoImobiliaria;
	}

	public boolean setDataIngressoImobiliaria(LocalDate dataIngressoImobiliaria) {
		if (dataIngressoImobiliaria != null) {
			this.DataIngressoImobiliaria = dataIngressoImobiliaria;
			return true;
		}
		else
			return false;
	}

	public String getCargo() {
		return Cargo;
	}

	public boolean setCargo(String cargo) {
		if (cargo.length() > 0) {
			this.Cargo = cargo;
			return true;
		}
		else
			return false;
	}

	public static double getSalarioBase() {
		return SalarioBase;
	}
	
	public static boolean setSalarioBase(double salarioBase) {
		if (salarioBase > 0) {
			SalarioBase = salarioBase;
			return true;
		}
		else
			return false;
	}
	public double calculaSalarioEspecifico() {
		return SalarioBase;
	}

}
