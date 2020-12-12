
public class CheckAuthentification extends Middleware{

	@Override
	public boolean check(String usuario, String password) {
		
		if (AlmacenUsuarios.checkUser(usuario))
		{
			if (AlmacenUsuarios.checkPassword(usuario,password))
			{
				return checkNext(usuario, password);
			}
			
			System.out.println("Contraseña Inconrrecta");
		} else {
			System.out.println("Usuario Inconrrecto");
		}
		
		
		return false;
	}

	@Override
	public boolean accion(String usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
