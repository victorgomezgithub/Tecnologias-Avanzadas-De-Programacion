
public class CheckAttempts extends Middleware{

	@Override
	public boolean check(String usuario, String password) {
		if (AlmacenUsuarios.checkAttempts(usuario))
			return checkNext(usuario, password);
		
			System.out.println("Demasiados Intentos, usuario bloqueado");
			return false;
		
	}

	@Override
	public boolean accion(String usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
