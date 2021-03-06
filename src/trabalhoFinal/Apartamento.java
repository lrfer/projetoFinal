package trabalhoFinal;
import java.io.Serializable;
import java.time.LocalDate;

public class Apartamento extends Residencial implements Serializable{
	public int andar;
	public String valorCondominio;
	public boolean portaria24hs;

	public Apartamento(boolean venda, boolean locacao, LocalDate dataConstrucao, double aluguelVendaCliente,
			double valorRealAluguelVenda, double valorDestinadoImob, Endereco endereco,
			LocalDate dataColocadoVendaAlugar, boolean disponivelLocacaoVenda, byte situacao, String area,
			int qtdQuartos, int qtdSuites, int qtdSalasEstar, int nroVagasGaregem, boolean armarioEmbutido,
			String descricao, int andar, String valorCondominio, boolean portaria24hs) {
		super(venda, locacao, dataConstrucao, aluguelVendaCliente, valorRealAluguelVenda, valorDestinadoImob, endereco,
				dataColocadoVendaAlugar, disponivelLocacaoVenda, situacao, area, qtdQuartos, qtdSuites, qtdSalasEstar,
				nroVagasGaregem, armarioEmbutido, descricao);
		this.andar = andar;
		this.valorCondominio = valorCondominio;
		this.portaria24hs = portaria24hs;
	}
        public Apartamento(){super();}

	public int getAndar() {
		return andar;
	}

	public boolean setAndar(int andar) {
		if (andar > 0) {
			this.andar = andar;
			return true;
		}
		else
			return false;
	}

	public String getValorCondominio() {
		return valorCondominio;
	}

	public boolean setValorCondominio(String valorCondominio) {

                this.valorCondominio = valorCondominio;
			return true;

	}

	public boolean isPortaria24hs() {
		return portaria24hs;
	}

	public void setPortaria24hs(boolean portaria24hs) {
		this.portaria24hs = portaria24hs;
	}

	@Override
	public double calculaIndiceVendaLocacao() {
		if (this.portaria24hs)
			return 1;
		else
			return 0;
	};
        @Override
        public String toString(){
            return "Apartamento - " + this.endereco.nro + " " + this.endereco.rua;
        }
}
