package trabalhoFinal;

public interface IDadosTransacao {

	void Cadastrar(Transacao c);

	void Listar();

	Transacao Buscar(String nomeCliente);

}