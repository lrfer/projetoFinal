package trabalhoFinal;
import java.util.*;

public class DadosClientes extends ArquivoBinario<Cliente> implements IDadosCLientes {
	private ArrayList<Cliente> vetCliente = new ArrayList<Cliente>();
        private ArrayList<ClienteUsuario> vetClienteUsuario = new ArrayList<ClienteUsuario>();

	
	@Override
	public void Cadastrar(Cliente c) {
		this.vetCliente.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetCliente.size());
	}
	public void CadastrarUsuario(ClienteUsuario c) {
		this.vetClienteUsuario.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetCliente.size() + vetClienteUsuario.size() );
	}
        
        
        public ArrayList<Cliente> getClientes(){
            return this.vetCliente;
        }
        
        public ArrayList<ClienteUsuario> getClientesUsuario(){
            return this.vetClienteUsuario;
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
