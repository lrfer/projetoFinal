package trabalhoFinal;

import java.io.Serializable;

public class Login implements Serializable  {	
	public String Usuario;
	public String Senha;
	
	public Login(String usuario, String senha) {
		super();
		Usuario = usuario;
		Senha = senha;
	}
        public Login(){}
	
	public String getUsuario() {
		return Usuario;
	}
	public boolean setUsuario(String usuario) {
		if(usuario.length() > 0) {
		Usuario = usuario; return true;
		}
		else return false;
	}
	public String getSenha() {
		return Senha;
	}
	public boolean setSenha(String senha) {
		if(senha.length() > 0) {
		Senha = senha; return true;
		}
		else return false;
	}

}
