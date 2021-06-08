package trabalhoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosTransacao  {
	private ArrayList<Transacao> vetImoveis = new ArrayList<Transacao>();
	
	public void Cadastrar(Transacao c) {
		this.vetImoveis.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetImoveis.size());
	}
	
	public void Listar() {
		for(Transacao cliente: this.vetImoveis) {
			cliente.toString();
		}
	}
	
        
         public void GerarArquivoBinario(ArrayList<Transacao> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Transacao c : lista){
                   FileOutputStream fileOut = new FileOutputStream(path);
                   ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                   objOut.writeObject(c);
                   System.out.println("Sucesso foi gravado em " + path);
               }
           }
           catch(Exception ex){
               System.out.print(ex);
           }
       } 
         public ArrayList<Transacao> getAll(){
             return this.vetImoveis;
         }

}
