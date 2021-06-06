package trabalhoFinal;

import java.time.LocalDate;

public class Terreno extends Imoveis {
	public double largura;
	public double comprimento;
	public boolean aclive;
	public boolean declive;

	public Terreno(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, double area,
			double largura, double comprimento, boolean aclive, boolean declive) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area);
		this.largura = largura;
		this.comprimento = comprimento;
		this.aclive = aclive;
		this.declive = declive;
	}

	public double getLargura() {
		return largura;
	}

	public boolean setLargura(double largura) {
		if (largura > 0) {
			this.largura = largura;
			return true;
		}
		else
			return false;
	}

	public double getComprimento() {
		return comprimento;
	}

	public boolean setComprimento(double comprimento) {
		if (comprimento > 0) {
			this.comprimento = comprimento;
			return true;
		}
		else
			return false;
	}

	public boolean isAclive() {
		return aclive;
	}

	public void setAclive(boolean aclive) {
		this.aclive = aclive;
	}

	public boolean isDeclive() {
		return declive;
	}

	public void setDeclive(boolean declive) {
		this.declive = declive;
	}
	
	@Override
	public double calculaIndiceVendaLocacao() {
		if (this.aclive)
			return 1;
		else if (this.declive)
			return 2;
		else
			return 0;
	};
}
