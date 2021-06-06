package trabalhoFinal;
import java.util.ArrayList;
import trabalhoFinal.ArquivoBinario;

public class DadosClienteProprietario extends ArquivoBinario<ClienteProprietario> implements IDadosClientesProprietarios   {
	private ArrayList<ClienteProprietario> vetClienteProprietario = new ArrayList<ClienteProprietario>();
	

	@Override
	public void Cadastrar(ClienteProprietario c) {
		this.vetClienteProprietario.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetClienteProprietario.size());
	}
	

	@Override
	public void Listar() {
		for(ClienteProprietario cliente: this.vetClienteProprietario) {
			cliente.toString();
		}
	}
	
	@Override
	public ClienteProprietario Buscar(String nome ) {
		ClienteProprietario c = null;
		 for(ClienteProprietario Cliente:this.vetClienteProprietario)
		 {
			 if(Cliente.getNome().equals(nome)) {
				 c = Cliente;
				 break;
			 }
		 }
		 return c;
	}

}
