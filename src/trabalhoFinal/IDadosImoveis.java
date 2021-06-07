package trabalhoFinal;

import java.util.ArrayList;

public interface IDadosImoveis {

	void Cadastrar(Imoveis c);

	void Listar();

	Imoveis Buscar(String situacao);
        
        ArrayList<Casa> getCasas();
        
        ArrayList<Apartamento> getApartamentos();
        
        ArrayList<SalaComercial> getSalasComercial();
        
        ArrayList<Terreno> getTerrenos();
        

}