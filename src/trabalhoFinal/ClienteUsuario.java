package trabalhoFinal;
import java.util.ArrayList;

public class ClienteUsuario extends Cliente {
	public ArrayList<BomPagador> BomPagador;

	public ClienteUsuario(String nome, String cPF,Endereco endereco, String telContato, String email, String sexo,
			String estadoCivil, String profissao) {
		super(nome, cPF, telContato, endereco, email, sexo, estadoCivil, profissao,false);
	}
	
        public ClienteUsuario(){};
	@Override
	public double calculaBonusCliente() {
		if (this.BomPagador.isEmpty())
			return 1;
		else
			return 2;
	};

}
