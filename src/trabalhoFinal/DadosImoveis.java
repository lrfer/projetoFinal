package trabalhoFinal;

import java.util.*;

public class DadosImoveis extends ArquivoBinario<Imoveis> implements IDadosImoveis  {
	private ArrayList<Imoveis> vetImoveis = new ArrayList<Imoveis>();
	
	@Override
	public void Cadastrar(Imoveis c) {
		this.vetImoveis.add(c);
		System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
	}
        
        public void Cadastrar(Casa c){
            this.vetImoveis.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
          public void Cadastrar(Terreno c){
            this.vetImoveis.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
          public void Cadastrar(SalaComercial c){
            this.vetImoveis.add(c);
                System.out.println("Total de imoveis inseridos:");
		System.out.println(this.vetImoveis.size());
        }
            public void Cadastrar(Apartamento c){
            this.vetImoveis.add(c);
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


}
