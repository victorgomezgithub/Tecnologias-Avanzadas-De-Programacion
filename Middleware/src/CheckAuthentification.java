
public class CheckAuthentification extends Middleware{

	@Override
	public boolean check(String usuario, String password,String accion) {
		
		if (AlmacenUsuarios.checkUser(usuario))
		{
			if (AlmacenUsuarios.checkPassword(usuario,password))
			{
				return checkNext(usuario, password, accion);
			}
		}
		
		return false;
	}

}
