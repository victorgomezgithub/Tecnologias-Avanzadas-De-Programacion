
public class CheckLevel extends Middleware{

	@Override
	public boolean check(String usuario, String password, String accion) {

		if(accion.equals("SELECT") && AlmacenUsuarios.checkLevel(usuario, 5))
			return checkNext(usuario, password, accion);
		
		if(accion.equals("UPDATE") && AlmacenUsuarios.checkLevel(usuario, 7))
			return checkNext(usuario, password, accion);
		
		if(accion.equals("DELETE") && AlmacenUsuarios.checkLevel(usuario, 10))
			return checkNext(usuario, password, accion);
		

		return false;
	}

}
