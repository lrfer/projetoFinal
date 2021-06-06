package trabalhoFinal;

import java.util.ArrayList;

public class DadosEndereco extends ArquivoBinario<Endereco> implements IDadosEndereco {
	private ArrayList<Endereco> vetEndereco = new ArrayList<Endereco>();
	

	@Override
	public void Cadastrar(Endereco c) {
		this.vetEndereco.add(c);
		System.out.println("Total de endereços inseridos:");
		System.out.println(this.vetEndereco.size());
	}
	

	@Override
	public void Listar() {
		for(Endereco cliente: this.vetEndereco) {
			cliente.toString();
		}
	}
	
	
	@Override
	public Endereco Buscar(int cep ) {
		Endereco c = null;
		 for(Endereco endereco:this.vetEndereco)
		 {
			 if(endereco.getCep() == cep) {
				 c = endereco;
				 break;
			 }
		 }
		 return c;
	}

}
