package trabalhoFinal;
import java.util.*;

public class DadosClientes extends ArquivoBinario<Cliente> implements IDadosCLientes {
	private ArrayList<Cliente> vetCliente = new ArrayList<Cliente>();
	
	@Override
	public void Cadastrar(Cliente c) {
		this.vetCliente.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetCliente.size());
	}
	
	@Override
	public void Listar() {
		for(Cliente cliente: this.vetCliente) {
			cliente.toString();
		}
	}
	
	@Override
	public Cliente Buscar(String nome) {
		 Cliente c = null;
		 for(Cliente cliente:this.vetCliente)
		 {
			 if(cliente.getNome().equals(nome)) {
				 c = cliente;
				 break;
			 }
		 }
		 return c;
	}

}
