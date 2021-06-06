package trabalhoFinal;


public interface IDadosEndereco {

	void Cadastrar(Endereco c);

	void Listar();

	Endereco Buscar(int cep);

}