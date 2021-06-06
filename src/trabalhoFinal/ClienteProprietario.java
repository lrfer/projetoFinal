package trabalhoFinal;
import java.time.LocalDate;

public class ClienteProprietario extends Cliente {
	public LocalDate DataCadastroPrimeiroImovel;

	public ClienteProprietario(String nome, String cPF, Endereco endereco, int telContato, String email,
			String sexo, String estadoCivil, String profissao, LocalDate dataCadastroPrimeiroImovel) {
		super(nome, cPF, telContato, endereco, email, sexo, estadoCivil, profissao);
		this.DataCadastroPrimeiroImovel = dataCadastroPrimeiroImovel;
	}
	
	public LocalDate getDataCadastroPrimeiroImovel() {
		return DataCadastroPrimeiroImovel;
	}

	public boolean setDataCadastroPrimeiroImovel(LocalDate dataCadastroPrimeiroImovel) {
		if(dataCadastroPrimeiroImovel != null) {
		DataCadastroPrimeiroImovel = dataCadastroPrimeiroImovel;
		return true;
		}
		else return false;
	}
	
	@Override
	public double calculaBonusCliente() {
		if (DataCadastroPrimeiroImovel.isAfter(LocalDate.now()))
			return 1;
		else
			return 2;
	}

}
