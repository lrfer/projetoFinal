package trabalhoFinal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
        
        public void GerarArquivoBinarioCorretor(ArrayList<Corretor> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Corretor c : lista){
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
        public Corretor get(int i){
            return this.vetCorretor.get(i);
        }
        
        public void AtualizaValores(Corretor c,double venda)
        {
            int index = this.vetCorretor.indexOf(c);
            var cor = this.vetCorretor.get(index);
            cor.calculaSalarioEspecifico(venda);
        }

}
