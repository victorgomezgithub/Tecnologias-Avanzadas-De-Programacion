import java.util.ArrayList;

public class AlmacenUsuarios {
	
	private static ArrayList<Usuario> tablaUsuario = new ArrayList<Usuario>();
	
	
	private AlmacenUsuarios() {
		
	}
	
	public static void añadirUsuario(Usuario user) {
		tablaUsuario.add(user);
	}
	
	public static boolean checkUser(String idUsuario) {
		for (Usuario usuario : tablaUsuario) {
			if (usuario.getUsername().equals(idUsuario))
				return true;
 		}
		System.out.println("Usuario no encontrado");
		
		return false;
	}
	
	public static boolean checkPassword(String username, String password) {
		for (Usuario usuario : tablaUsuario) {
			if(usuario.getUsername().equals(username)) {
				if (usuario.getPassword().equals(password)){
					usuario.setAttempts(0); 
					return true;
				}
				usuario.setAttempts(usuario.getAttempts()+1);
			}
 		}
		System.out.println("Contraseña Errónea");
		return false;
	}
	
	public static boolean checkAttempts(String username) {	
		
		for (Usuario usuario : tablaUsuario) {
			if (usuario.getUsername().equals(username)) {
				if(usuario.getAttempts() <= 3){
					return true;
				} else {
					System.out.println("Demasiados Intentos, usuario bloqueado");
					return false;
				}
			}

 		}		
		System.out.println("Usuario inexistente");
		return false;
		
	}
	
	public static boolean checkLevel(String username, int nivelNecesario) {
		for (Usuario usuario : tablaUsuario) {
			if (usuario.getUsername().equals(username) && usuario.getNivelServicio() >= nivelNecesario)
			{
				System.out.println("Tiene permiso para esa acción");	
				return true;
			}
 		}
		System.out.println("No tiene permiso para esa acción");	
		return false;
	}

	
}
