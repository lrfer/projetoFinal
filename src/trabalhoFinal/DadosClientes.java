package trabalhoFinal;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class DadosClientes extends ArquivoBinario<Cliente> implements IDadosCLientes {
	private ArrayList<Cliente> vetCliente = new ArrayList<Cliente>();
        private ArrayList<ClienteUsuario> vetClienteUsuario = new ArrayList<ClienteUsuario>();

	
	@Override
	public void Cadastrar(Cliente c) {
		this.vetCliente.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetCliente.size());
	}
	public void Cadastrar(ClienteUsuario c) {
                this.vetCliente.add(c);
		this.vetClienteUsuario.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetCliente.size() + vetClienteUsuario.size() );
	}
        public void GerarArquivoBinarioCliente(ArrayList<Cliente> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Cliente c : lista){
                   FileOutputStream fileOut = new FileOutputStream(path);
                   ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                   objOut.writeObject(c);
                   System.out.print("Sucesso foi gravado em " + path);
               }
           }
           catch(Exception ex){
               System.out.print(ex);
           }
       } 
        
       public void GerarArquivoBinarioClienteUsuario(ArrayList<ClienteUsuario> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(ClienteUsuario c : lista){
                   FileOutputStream fileOut = new FileOutputStream(path);
                   ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                   objOut.writeObject(c);
                   System.out.print("Sucesso foi gravado em " + path);
               }
           }
           catch(Exception ex){
               System.out.print(ex);
           }
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
        public List<Cliente> getProprietarios(){
             var cliente = this.vetCliente.stream().filter(x -> x.proprietario).collect(Collectors.toList());
             return cliente;
        }

}
