package trabalhoFinal;

import java.io.Serializable;
import java.time.LocalDate;

public class Terreno extends Imoveis implements Serializable {
	public String largura;
	public String comprimento;
	public boolean aclive;
	public boolean declive;

	public Terreno(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, String area,
			String largura, String comprimento, boolean aclive, boolean declive) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area);
		this.largura = largura;
		this.comprimento = comprimento;
		this.aclive = aclive;
		this.declive = declive;
	}
        public Terreno(){super();}

	public String getLargura() {
		return largura;
	}

	public boolean setLargura(String largura) {
		if (largura.length() > 0) {
			this.largura = largura;
			return true;
		}
		else
			return false;
	}

	public String getComprimento() {
		return comprimento;
	}

	public boolean setComprimento(String comprimento) {
		if (comprimento.length() > 0) {
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
         @Override
        public String toString(){
            return "Terreno - " + this.endereco.nro + " " + this.endereco.rua;
        }
}
