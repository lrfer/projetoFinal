package trabalhoFinal;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Pessoa implements Serializable  {
	public String cpf;
	public String nome;
	public String telContato;
	public Endereco endereco;
	
	
	public Pessoa(String cpf, String nome, String telContato, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telContato = telContato;
		this.endereco = endereco;
	}
        public Pessoa(){};

	public String getCpf() {
		return cpf;
	}


	public boolean setCpf(String cpf) {
		if(this.isCPF(cpf)) {
			this.cpf = cpf;
			return true;
		}
		else return false;
	}


	public String getNome() {
		return nome;
	}


	public boolean setNome(String nome) {
		if(nome.length()> 0) {
		this.nome = nome;
		return true;
		}
		else return false;
	}


	public String getTelContato() {
		return telContato;
	}


	public boolean setTelContato(String telContato) {
		if(telContato.length() > 0) {
		this.telContato = telContato;
		return true;
		}
		else return false;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public boolean setEndereco(Endereco endereco) {
		if(endereco != null) {
		this.endereco = endereco;
		return true;
		}
		return false;
	}
	
	public  boolean isCPF(String CPF) {
	        if (CPF.equals("00000000000") ||
	            CPF.equals("11111111111") ||
	            CPF.equals("22222222222") || CPF.equals("33333333333") ||
	            CPF.equals("44444444444") || CPF.equals("55555555555") ||
	            CPF.equals("66666666666") || CPF.equals("77777777777") ||
	            CPF.equals("88888888888") || CPF.equals("99999999999") ||
	            (CPF.length() != 11))
	            return(false);

	        char dig10, dig11;
	        int sm, i, r, num, peso;

	        try {

	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {
	            num = (int)(CPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48); 
	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(CPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);

	            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (InputMismatchException erro) {
	                return(false);
	            }
	        }

	        public static String imprimeCPF(String CPF) {
	            return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
	            CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
	        }
	
}
