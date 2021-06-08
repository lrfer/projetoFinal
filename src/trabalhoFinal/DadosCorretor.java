package trabalhoFinal;

import java.util.ArrayList;

public class DadosCorretor extends ArquivoBinario<Corretor> implements IDadosCorretor  {
	private ArrayList<Corretor> vetCorretor = new ArrayList<Corretor>();
	
	@Override
	public void Cadastrar(Corretor c) {
		this.vetCorretor.add(c);
		System.out.println("Total de transações inseridos:");
		System.out.println(this.vetCorretor.size());
	}
	
	@Override
	public void Listar() {
		for(Corretor cliente: this.vetCorretor) {
			cliente.toString();
		}
	}
        public ArrayList<Corretor> getCorretor(){
            return this.vetCorretor;
        }
	
	@Override
	public Corretor Buscar(String nomeCliente ) {
		Corretor c = null;
	/*	 for(Corretor transacao:this.vetCorretor)
		 {
			 if(transacao.getNome().equals(nomeCliente)) {
				 c = transacao;
				 break;
			 }
		 }*/
		 return c;
	}

}
