package trabalhoFinal;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
	
        public ArrayList<FormaPagamento> getFormaPagamento(){
            return this.vetFormaPagamento;
        }
        
         public void GerarArquivoBinarioFormaPagamento(ArrayList<FormaPagamento> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(FormaPagamento c : lista){
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
        public FormaPagamento Get(int i){
            return this.vetFormaPagamento.get(i);
        }

}
