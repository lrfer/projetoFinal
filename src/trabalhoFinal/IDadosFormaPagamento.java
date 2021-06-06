package trabalhoFinal;


public interface IDadosFormaPagamento {

	void Cadastrar(FormaPagamento c);

	void Listar();

	FormaPagamento Buscar(String tipo);

}