
public class UsuarioFuncional extends Usuario{

	
	public UsuarioFuncional(String username,String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setAttempts(0);
	}
	
	@Override
	public int getNivelServicio() {
		return 7;
	}

}
