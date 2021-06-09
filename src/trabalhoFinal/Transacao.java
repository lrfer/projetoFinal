package trabalhoFinal;

import java.time.LocalDate;

public class Transacao {
	public LocalDate dataTrasacao;
	public String nroContato;
	public ClienteUsuario clienteUsuario;
	public Imoveis imoveis;
	public FormaPagamento formaPagamento;
	public Corretor corretor;
        public String valorCliente;
        public String ValorReal;
        public String ValorDestinadoImob;
	
	public Transacao(String nroContato, ClienteUsuario clienteUsuario, Imoveis imoveis,
			FormaPagamento formaPagamento, Corretor corretor,String valorCliente,String valorReal, String valorImob) {
		super();
		this.dataTrasacao = LocalDate.now();
		this.nroContato = nroContato;
		this.clienteUsuario = clienteUsuario;
		this.imoveis = imoveis;
		this.formaPagamento = formaPagamento;
		this.corretor = corretor;
                this.ValorDestinadoImob = valorImob;
                this.ValorReal = valorReal;
                this.valorCliente = valorCliente;
	}
	
	public Transacao(ClienteUsuario clienteUsuario, Imoveis imoveis) {
		this.dataTrasacao = LocalDate.now();
		this.nroContato = "1";
		this.formaPagamento = null;
		this.corretor = null;
		this.clienteUsuario = clienteUsuario;
		this.imoveis = imoveis;
	}
        public Transacao(){}

	public LocalDate getDataTrasacao() {
		return dataTrasacao;
	}

	public boolean setDataTrasacao(LocalDate dataTrasacao) {
		if (dataTrasacao != null) {
			this.dataTrasacao = dataTrasacao;
			return true;
		}
		else
			return false;
	}

	public String getNroContato() {
		return nroContato;
	}
	
	public void efetuarTransacao(Transacao transacao,Imoveis imoveis,FormaPagamento pagamento,
			Corretor corretor,boolean isVenda,String numeroContato, boolean corretorRealizou, double valorVenda) {
		corretor.setVendasMes(imoveis.getAluguelVendaCliente());
		imoveis.venda = isVenda;
		imoveis.locacao = !isVenda;
		imoveis.setDisponivelLocacaoVenda(false);
		imoveis.setSituacao("USO");
		transacao.dataTrasacao = LocalDate.now();
		transacao.nroContato = numeroContato;
		transacao.formaPagamento = pagamento;
		transacao.corretor = corretor;
		transacao.imoveis = imoveis;
		if (corretorRealizou && valorVenda != 0)
			Corretor.calculaSalarioEspecifico(valorVenda);
	}

	public boolean setNroContato(String nroContato) {
		if (nroContato.length() > 0) {
			this.nroContato = nroContato;
			return true;
		}
		else
			return false;
	}

}
