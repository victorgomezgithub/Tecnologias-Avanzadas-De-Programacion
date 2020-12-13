
public class CheckAttempts extends Middleware{

	@Override
	public boolean check(String usuario, String password, String accion) {
		if (AlmacenUsuarios.checkAttempts(usuario))
			return checkNext(usuario, password, accion);
		
			return false;
		
	}

}
