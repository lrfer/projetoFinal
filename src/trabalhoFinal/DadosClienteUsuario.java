package trabalhoFinal;
import java.util.ArrayList;

public class DadosClienteUsuario extends ArquivoBinario<ClienteUsuario> implements IDadosClienteUsuario {
	private ArrayList<ClienteUsuario> vetClienteUsuario = new ArrayList<ClienteUsuario>();
	
	@Override
	public void Cadastrar(ClienteUsuario c) {
		this.vetClienteUsuario.add(c);
		System.out.println("Total de Clientes Usuario inseridos:");
		System.out.println(this.vetClienteUsuario.size());
	}
        public ArrayList<ClienteUsuario>  getClientesUsuarios(){
            return this.vetClienteUsuario;
        }
	
	@Override
	public void Listar() {
		for(ClienteUsuario cliente: this.vetClienteUsuario) {
			cliente.toString();
		}
	}
	
	@Override
	public ClienteUsuario Buscar(String nomeCliente ) {
		ClienteUsuario c = null;
		 for(ClienteUsuario transacao:this.vetClienteUsuario)
		 {
			 if(transacao.getNome().equals(nomeCliente)) {
				 c = transacao;
				 break;
			 }
		 }
		 return c;
	}

}
