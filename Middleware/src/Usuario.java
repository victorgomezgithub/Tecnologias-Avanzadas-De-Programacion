
public abstract class Usuario {
	
	private String userName;
	private String password;
	private int attempts;
	
	public String getUsername() {
		return this.userName;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAttempts() {
		return this.attempts;
	}
	
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	
	public abstract int getNivelServicio();

}
