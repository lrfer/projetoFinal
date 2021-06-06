package trabalhoFinal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	public int Telefone;
	public int TelCelular;
	public LocalDate DataIngressoImobiliaria;
	public String Cargo;
	public static double SalarioBase = 1000;
	
	public Funcionario(String cpf, String nome, int telContato, Endereco endereco, int telefone, int telCelular,
			LocalDate dataIngressoImobiliaria, String cargo) {
		super(cpf, nome, telContato, endereco);
		Telefone = telefone;
		TelCelular = telCelular;
		DataIngressoImobiliaria = dataIngressoImobiliaria;
		Cargo = cargo;
	}

	public int getTelefone() {
		return Telefone;
	}

	public boolean setTelefone(int telefone) {
		if (telefone > 0) {
			this.Telefone = telefone;
			return true;
		}
		else
			return false;
	}

	public int getTelCelular() {
		return TelCelular;
	}

	public boolean setTelCelular(int telCelular) {
		if (telCelular > 0) {
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
