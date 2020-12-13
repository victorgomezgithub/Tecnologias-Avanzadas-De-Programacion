
public class UsuarioAdministrador extends Usuario{

	public UsuarioAdministrador(String username,String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setAttempts(0);
	}
	
	@Override
	public int getNivelServicio() {
		return 10;
	}

}
