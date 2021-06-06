package trabalhoFinal;

import java.util.ArrayList;

public class DadosTransacao  {
	private ArrayList<Imoveis> vetImoveis = new ArrayList<Imoveis>();
	
	public void Cadastrar(Imoveis c) {
		this.vetImoveis.add(c);
		System.out.println("Total de clientes inseridos:");
		System.out.println(this.vetImoveis.size());
	}
	
	public void Listar() {
		for(Imoveis cliente: this.vetImoveis) {
			cliente.toString();
		}
	}
	
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
