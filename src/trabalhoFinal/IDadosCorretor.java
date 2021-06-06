package trabalhoFinal;
public interface IDadosCorretor {

	void Cadastrar(Corretor c);

	void Listar();

	Corretor Buscar(String nomeCliente);

}