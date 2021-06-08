package trabalhoFinal;

import java.util.ArrayList;

public class DadosFuncionarios implements IDadosFuncionarios  {
	private ArrayList<Funcionario> vetFuncionario = new ArrayList<Funcionario>();
	

	@Override
	public void Cadastrar(Funcionario c) {
		this.vetFuncionario.add(c);
		System.out.println("Total de formas de pagamento inseridos:");
		System.out.println(this.vetFuncionario.size());
	}
	

	@Override
	public void Listar() {
		for(Funcionario cliente: this.vetFuncionario) {
			cliente.toString();
		}
	}
	public ArrayList<Funcionario> getFuncionarios(){
            return vetFuncionario;
        }
	
	@Override
	public Funcionario Buscar(String nome ) {
		Funcionario c = null;
		 for(Funcionario funcionario:this.vetFuncionario)
		 {
			 if(funcionario.getNome().equals(nome)) {
				 c = funcionario;
				 break;
			 }
		 }
		 return c;
	}
        public Funcionario Get(int i)
        {
            return this.vetFuncionario.get(i);
        }

}
