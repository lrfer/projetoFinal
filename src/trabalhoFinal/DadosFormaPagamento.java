package trabalhoFinal;
import java.util.ArrayList;


public class DadosFormaPagamento extends ArquivoBinario<FormaPagamento> implements IDadosFormaPagamento {
	private ArrayList<FormaPagamento> vetFormaPagamento = new ArrayList<FormaPagamento>();
	

	
	public void Cadastrar(FormaPagamento c) {
		this.vetFormaPagamento.add(c);
		System.out.println("Total de formas de pagamento inseridos:");
		System.out.println(this.vetFormaPagamento.size());
	}
	

	
	public void Listar() {
		for(FormaPagamento cliente: this.vetFormaPagamento) {
			cliente.toString();
		}
	}
	
	
	@Override
	public FormaPagamento Buscar(String tipo ) {
		FormaPagamento c = null;
		 for(FormaPagamento formaPagamento:this.vetFormaPagamento)
		 {
			 if(formaPagamento.getTipo().equals(tipo)) {
				 c = formaPagamento;
				 break;
			 }
		 }
		 return c;
	}

}
