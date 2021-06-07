package trabalhoFinal;
import java.time.LocalDate;

public class Casa extends Residencial {

	public boolean piscina;
	public boolean condominio;

	public Casa(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, String area,
			int qtdQuartos, int qtdSuites, int qtdSalasEstar, int nroVagasGaregem, boolean armarioEmbutido,
			String descricao, boolean piscina, boolean condominio) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area, qtdQuartos, qtdSuites, qtdSalasEstar,
				nroVagasGaregem, armarioEmbutido, descricao);
		this.piscina = piscina;
		this.condominio = condominio;
	}
        public Casa(){super();};

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean getCondominio() {
		return condominio;
	}

	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}

	@Override
	public double calculaIndiceVendaLocacao() {
		if (this.piscina)
			return 1;
		else
			return 0;
	};
}
