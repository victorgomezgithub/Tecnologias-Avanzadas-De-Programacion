
public class UsuarioCliente extends Usuario{

	public UsuarioCliente(String username,String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setAttempts(0);
	}
	
	@Override
	public int getNivelServicio() {
		return 5;
	}

}
