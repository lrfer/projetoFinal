package trabalhoFinal;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Imoveis implements IImoveis {
	public boolean venda;
	public boolean locacao;
	public LocalDate dataConstrucao;
	public double aluguelVendaCliente ;
	public double valorRealAluguelVenda;
	public double valorDestinadoImob;
	public Endereco endereco;
	public LocalDate dataColocadoVendaAlugar;
	public boolean disponivelLocacaoVenda;
	private byte situacao;
	public double area;
	
	public ArrayList<ClienteProprietario> lstClienteProprietario;
	
	public Imoveis(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco, LocalDate dataColocadoVendaAlugar,
			boolean disponivelLocacaoVenda, byte situacao, double area) {
		super();
		this.venda = venda;
		this.locacao = locacao;
		this.dataConstrucao = dataConstrucao;
		this.aluguelVendaCliente = aluguelVendaCliente;
		this.valorRealAluguelVenda = valorRealAluguelVenda;
		this.valorDestinadoImob = valorDestinadoImob;
		this.endereco = endereco;
		this.dataColocadoVendaAlugar = dataColocadoVendaAlugar;
		this.disponivelLocacaoVenda = disponivelLocacaoVenda;
		this.situacao = situacao;
		this.area = area;
	}
	
	public Imoveis(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco, LocalDate dataColocadoVendaAlugar,
			boolean disponivelLocacaoVenda, ArrayList<ClienteProprietario> lstClienteProprietario) {
		super();
		this.venda = venda;
		this.locacao = locacao;
		this.dataConstrucao = dataConstrucao;
		this.aluguelVendaCliente = aluguelVendaCliente;
		this.valorRealAluguelVenda = valorRealAluguelVenda;
		this.valorDestinadoImob = valorDestinadoImob;
		this.endereco = endereco;
		this.dataColocadoVendaAlugar = dataColocadoVendaAlugar;
		this.disponivelLocacaoVenda = disponivelLocacaoVenda;
		this.lstClienteProprietario = lstClienteProprietario;
	}
	
	public Imoveis() {
		this.venda = false;
		this.locacao = true;
		this.dataConstrucao = LocalDate.now();
		this.aluguelVendaCliente = 0;
		this.valorRealAluguelVenda = 0;
		this.valorDestinadoImob = 0;
		this.endereco = null;
		this.dataColocadoVendaAlugar = LocalDate.now();
		this.disponivelLocacaoVenda = false;
	}
	
	public double calculaIndiceVendaLocacao() {
		return 0;
	};
	
	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	public boolean isLocacao() {
		return locacao;
	}
	public void setLocacao(boolean locacao) {
		this.locacao = locacao;
	}
	public LocalDate getDataConstrucao() {
		return dataConstrucao;
	}
	public boolean setDataConstrucao(LocalDate dataConstrucao) {
		if(dataConstrucao != null) {
			this.dataConstrucao = dataConstrucao; return true;
		}
		else return false;
	}
	public double getAluguelVendaCliente() {
		return aluguelVendaCliente;
	}
	public boolean setAluguelVendaCliente(double aluguelVendaCliente) {
		if(aluguelVendaCliente > 0 ) {
		this.aluguelVendaCliente = aluguelVendaCliente; return true;
		}
		else return false;
	}
	public double getValorRealAluguelVenda() {
		return valorRealAluguelVenda;
	}
	public boolean setValorRealAluguelVenda(double valorRealAluguelVenda) {
		if(valorRealAluguelVenda > 0) {
		this.valorRealAluguelVenda = valorRealAluguelVenda; return true;
		}
		else return false;
	}
	public double getValorDestinadoImob() {
		return valorDestinadoImob;
	}
	public boolean setValorDestinadoImob(double valorDestinadoImob) {
		if(valorDestinadoImob > 0 ) {
		this.valorDestinadoImob = valorDestinadoImob; return true;
		}
		else return false;
	}
	public LocalDate getDataColocadoVendaAlugar() {
		return dataColocadoVendaAlugar;
	}
	public boolean setDataColocadoVendaAlugar(LocalDate dataColocadoVendaAlugar) {
		if(dataColocadoVendaAlugar != null) {
		this.dataColocadoVendaAlugar = dataColocadoVendaAlugar; return true;
		}
		else return false;
	}
		
	public boolean getDisponivelLocacaoVenda() {
		return disponivelLocacaoVenda;
	}
	public void setDisponivelLocacaoVenda(boolean disponivelLocacaoVenda) {
		this.disponivelLocacaoVenda = disponivelLocacaoVenda;
	}
	public double getArea() {
		return this.area;
	}
	public boolean setArea(double area) {
		if (area > 0) {
			this.area = area;
			return true;
		}
		else
			return false;
	}

	
	public void setSituacao(String situacao) {
		situacao.toUpperCase();
		if(situacao == "ATIVO")
			this.situacao = 1;
		if(situacao == "INATIVO")
			this.situacao = 2;
		if(situacao == "USO")
			this.situacao = 3;
	}
	
	public String getSituacao() {
		if(this.situacao == 1)
			return "Ativo";
		if(this.situacao == 2)
			return "Inativo";
		if(this.situacao == 3)
			return "USO";
		else
			return "error";
	}
		
}
