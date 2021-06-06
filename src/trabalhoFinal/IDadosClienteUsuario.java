
package trabalhoFinal;
public interface IDadosClienteUsuario {

	void Cadastrar(ClienteUsuario c);

	void Listar();

	ClienteUsuario Buscar(String nomeCliente);

}