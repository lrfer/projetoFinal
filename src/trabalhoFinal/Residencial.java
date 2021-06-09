package trabalhoFinal;
import java.io.Serializable;
import java.time.LocalDate;

public class Residencial extends Imoveis implements IImoveis, Serializable {
	public int qtdQuartos;
	public int qtdSuites;
	public int qtdSalasEstar;
	public int nroVagasGaregem;
	public boolean armarioEmbutido;
	public String descricao;
	
	
	public Residencial(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, String area,
			int qtdQuartos, int qtdSuites, int qtdSalasEstar, int nroVagasGaregem, boolean armarioEmbutido,
			String descricao) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area);
		this.qtdQuartos = qtdQuartos;
		this.qtdSuites = qtdSuites;
		this.qtdSalasEstar = qtdSalasEstar;
		this.nroVagasGaregem = nroVagasGaregem;
		this.armarioEmbutido = armarioEmbutido;
		this.descricao = descricao;
	}
        public Residencial(){super();};
	
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	public boolean setQtdQuartos(int qtdQuartos) {
		if (qtdQuartos > 0) {
			this.qtdQuartos = qtdQuartos;
			return true;
		}
		else
			return false;
	}
	public int getQtdSuites() {
		return qtdSuites;
	}
	public boolean setQtdSuites(int qtdSuites) {
		if (qtdSuites > 0) {
			this.qtdSuites = qtdSuites;
			return true;
		}
		else
			return false;
	}
	public int getQtdSalasEstar() {
		return qtdSalasEstar;
	}
	public boolean setQtdSalasEstar(int qtdSalasEstar) {
		if (qtdSalasEstar > 0) {
			this.qtdSalasEstar = qtdSalasEstar;
			return true;
		}
		else
			return false;
	}
	public int getNroVagasGaregem() {
		return nroVagasGaregem;
	}
	public boolean setNroVagasGaregem(int nroVagasGaregem) {
		if (nroVagasGaregem > 0) {
			this.nroVagasGaregem = nroVagasGaregem;
			return true;
		}
		else
			return false;
	}
	public boolean isArmarioEmbutido() {
		return armarioEmbutido;
	}
	public void setArmarioEmbutido(boolean armarioEmbutido) {
		this.armarioEmbutido = armarioEmbutido;
	}
	public String getDescricao() {
		return descricao;
	}
	public boolean setDescricao(String descricao) {
		if (descricao.length() > 0) {
			this.descricao = descricao;
			return true;
		}
		else
			return false;
	}
	
	public double calculaTaxaDeLocacao() {
		return 0;
	};
}
