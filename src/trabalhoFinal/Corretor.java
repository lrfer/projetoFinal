package trabalhoFinal;
import java.time.LocalDate;

public class Corretor extends Funcionario {	
	public LocalDate DataInicioCorretor;
	public String CursoVendas;
	public static double VendasMes;
	public static final double PorcentagemComissao = 0.05;
	
	public Corretor(String cpf, String nome, String telContato, Endereco endereco, String telefone, String telCelular,
			LocalDate dataIngressoImobiliaria, String cargo, LocalDate dataInicioCorretor, String cursoVendas) {
		super(cpf, nome, telContato, endereco, telefone, telCelular, dataIngressoImobiliaria, cargo);
		DataInicioCorretor = dataInicioCorretor;
		CursoVendas = cursoVendas;
		VendasMes = 0;
	}
	public Corretor(){}
	public double getVendasMes() {
		return VendasMes;
	}

	public void setVendasMes(double vendasMes) {
		VendasMes += vendasMes;
	}

	public LocalDate getDataInicioCorretor() {
		return DataInicioCorretor;
	}
	public boolean setDataInicioCorretor(LocalDate dataInicioCorretor) {
		if (dataInicioCorretor != null) {
			this.DataInicioCorretor = dataInicioCorretor;
			return true;
		}
		else
			return false;
	}
	public String getCursoVendas() {
		return CursoVendas;
	}
	public boolean setCursoVendas(String cursoVendas) {
		if (cursoVendas.length() > 0) {
			this.CursoVendas = cursoVendas;
			return true;
		}
		else
			return false;
	}
	public static double getPorcentagemComissao() {
		return PorcentagemComissao;
	}
	/*
	public static boolean setPorcentagemComissao(double porcentagemComissao) {
		if (porcentagemComissao > 0) {
			PorcentagemComissao = porcentagemComissao;
			return true;
		}
		else
			return false;
	}
	*/
	public static void calculaSalarioEspecifico(double valorVenda) {
		VendasMes += 1;
               Funcionario.SalarioBase += (PorcentagemComissao * valorVenda);
	}
	public void limpaVendasMes() {
		VendasMes = 0;
	}

}
