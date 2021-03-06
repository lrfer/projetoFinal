package trabalhoFinal;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosLogin extends ArquivoBinario<Login>  implements IDadosLogin {
	private ArrayList<Login> vetLogin = new ArrayList<Login>();
	

	@Override
	public void Cadastrar(Login c) {
		this.vetLogin.add(c);
		System.out.println("Total de formas de pagamento inseridos:");
		System.out.println(this.vetLogin.size());
	}
	

	@Override
	public void Listar() {
		for(Login login: this.vetLogin) {
			login.toString();
		}
	}
        
         public void GerarArquivoBinarioLogin(ArrayList<Login> lista,String nomeArquivo) {
          String path = "C:\\Users\\Public\\" + nomeArquivo + ".tmp";
           try{
               for(Login c : lista){
                   FileOutputStream fileOut = new FileOutputStream(path);
                   ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                   objOut.writeObject(c);
                   System.out.print("Sucesso foi gravado em " + path);
               }
           }
           catch(Exception ex){
               System.out.print(ex);
           }
        }
	

	@Override
	public Login Buscar(String usuario ) {
		Login c = null;
		 for(Login login:this.vetLogin)
		 {
			 if(login.getUsuario().equals(usuario)) {
				 c = login;
				 break;
			 }
		 }
		 return c;
	}
        
        public int Check(Login l){
            for(Login login:this.vetLogin)
            {
                if(login.getUsuario().equals(l.Usuario)){
                    if(login.getSenha().equals(l.Senha)){
                        return 0;
                    }
                    return -1;
                }
            }
            return -2;
        }
        public ArrayList<Login> getAll(){
            return this.vetLogin;
        }

}
