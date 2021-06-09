package trabalhoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
        
            public void GerarArquivoBinarioEndereco(ArrayList<Endereco> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Endereco c : lista){
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
