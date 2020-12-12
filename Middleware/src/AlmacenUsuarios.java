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
			if (usuario.getUsername() == idUsuario)
				return true;
 		}
		
		return false;
	}
	
	public static boolean checkPassword(String username, String password) {
		for (Usuario usuario : tablaUsuario) {
			if(usuario.getUsername() == username) {
				if (usuario.getPassword() == password){
					usuario.setAttempts(0); 
					usuario.setLoginUsuario(true);
					return true;
				}
				usuario.setAttempts(usuario.getAttempts()+1);
			}
 		}
		
		return false;
	}
	
	public static boolean checkAttempts(String username) {	
		
		for (Usuario usuario : tablaUsuario) {
			if (usuario.getAttempts() <= 3)
				return true;
 		}		
		return false;
		
	}
	
	public static void booleanUpdateLogin(String username) {		
		for (Usuario usuario : tablaUsuario) {
			if (usuario.getUsername() == username)
				usuario.setLoginUsuario(true);
 		}		
	}
	
}
