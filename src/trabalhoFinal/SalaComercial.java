package trabalhoFinal;

import java.io.Serializable;
import java.time.LocalDate;

public class SalaComercial extends Imoveis implements Serializable {
	public int qtdBanheiros;
	public int qtdComodos;

	public SalaComercial(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, String area,
			int qtdBanheiros, int qtdComodos) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area);
		this.qtdBanheiros = qtdBanheiros;
		this.qtdComodos = qtdComodos;
	}
        public SalaComercial(){super();}

	public int getQtdBanheiros() {
		return qtdBanheiros;
	}

	public boolean setQtdBanheiros(int qtdBanheiros) {
		if (qtdBanheiros > 0) {
			this.qtdBanheiros = qtdBanheiros;
			return true;
		}
		else
			return false;
	}

	public int getQtdComodos() {
		return qtdComodos;
	}

	public boolean setQtdComodos(int qtdComodos) {
		if (qtdComodos > 0) {
			this.qtdComodos = qtdComodos;
			return true;
		}
		else
			return false;
	}
	
	@Override
	public double calculaIndiceVendaLocacao() {
		if (this.qtdBanheiros > 0 && this.qtdComodos > 2)
			return 1;
		else if (this.qtdBanheiros > 1 && this.qtdComodos > 3)
			return 2;
		else
			return 0;
	};
}
