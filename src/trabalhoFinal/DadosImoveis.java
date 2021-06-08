package trabalhoFinal;


import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class DadosImoveis  implements IDadosImoveis  {
	private ArrayList<Imoveis> vetImoveis = new ArrayList<Imoveis>();
        private ArrayList<Casa> vetCasa = new ArrayList<Casa>();
        private ArrayList<Apartamento> vetApartamento = new ArrayList<Apartamento>();
        private ArrayList<Terreno> vetTerreno = new ArrayList<Terreno>();
        private ArrayList<SalaComercial> vetComercial = new ArrayList<SalaComercial>();
        private ArrayList<Imoveis> ativos = new ArrayList<Imoveis>();
	
        
        
       public void GerarArquivoBinarioSala(ArrayList<SalaComercial> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(SalaComercial c : lista){
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
       public void GerarArquivoBinarioCasa(ArrayList<Casa> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Casa c : lista){
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
       public void GerarArquivoBinarioApartamento(ArrayList<Apartamento> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Apartamento c : lista){
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
               
       public void GerarArquivoBinarioTerreno(ArrayList<Terreno> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Terreno c : lista){
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
	public void Cadastrar(Imoveis c) {
                 this.vetImoveis.add(c);
		this.vetImoveis.add(c);
		System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
	}
        
        public void Cadastrar(Casa c){
            this.vetImoveis.add(c);
            this.vetCasa.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
          public void Cadastrar(Terreno c){
            this.vetImoveis.add(c);
            this.vetImoveis.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
          public void Cadastrar(SalaComercial c){
             this.vetImoveis.add(c);
            this.vetImoveis.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
            public void Cadastrar(Apartamento c){
             this.vetImoveis.add(c);
            this.vetApartamento.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
	
	@Override
	public void Listar() {
		for(Imoveis Casa: this.vetImoveis) {
			Casa.toString();
		}
	}
	
	@Override
	public Imoveis Buscar(String situacao) {
		Imoveis c = null;
		situacao.toUpperCase();
		 for(Imoveis imovel:this.vetImoveis)
		 {
			 if(imovel.getSituacao().toUpperCase() == situacao) {
				 c = imovel;
				 break;
			 }
		 }
		 return c;
	}

    @Override
    public ArrayList<Casa> getCasas() {
        return this.vetCasa;
    }

    @Override
    public ArrayList<Apartamento> getApartamentos() {
        return this.vetApartamento;
    }

    @Override
    public ArrayList<SalaComercial> getSalasComercial() {
        return this.vetComercial;
    }

    @Override
    public ArrayList<Terreno> getTerrenos() {
        return this.vetTerreno;
    }
    public ArrayList<Imoveis> getImoveis(){
        return this.vetImoveis;
    }
    public Imoveis Get(int i ){
        return this.vetImoveis.get(i);
    }
    public List<Imoveis> getAtivos(){
         var ativos = vetImoveis.stream().filter( x-> x.Filter() == 1).collect(Collectors.toList());
         return ativos;
    }
    public void setUso(Imoveis v){
        int index = this.vetImoveis.indexOf(v);
        var update = this.vetImoveis.get(index);
        update.setSituacao("USO");
        update.setLocacao(false);
        update.setDisponivelLocacaoVenda(false);
        vetImoveis.set(index, update);
    }
        public void seInativo(Imoveis v){
        int index = this.vetImoveis.indexOf(v);
        var update = this.vetImoveis.get(index);
        update.setSituacao("INATIVO");
        vetImoveis.set(index, update);
    }

}
