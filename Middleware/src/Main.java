

public class Main {

	public static void main(String[] args) {

		AlmacenUsuarios.añadirUsuario(new UsuarioCliente("Joe","1234"));
		
		Middleware middleware = new CheckAttempts();
		
		middleware.linkWith(new CheckAuthentification()).linkWith(new CheckLevel());
		
		
		Server server = new Server(middleware);
		System.out.println("\n\nPrueba para usuario Cliente:");
		server.requestAction("Jo", "1234", "SELECT"); //Intenta con nombre incorrecto
		server.requestAction("Joe", "1234", "UPDATE"); //Intenta accion de demasiado nivel
		server.requestAction("Joe", "123", "SELECT");//Intenta con contraseña incorrecta
		
		AlmacenUsuarios.añadirUsuario(new UsuarioAdministrador("Sara","000"));
		System.out.println("\n\nPrueba para usuario Adminstrador:");
		server.requestAction("Sar", "000", "SELECT");//Intenta con nombre Incorrecto
		server.requestAction("Sara", "000", "UPDATE");//Intenta una acción la cual tiene nivel
		server.requestAction("Sara", "00", "SELECT");//Intenta una accion con contraseña incorrecta

		System.out.println("\n\nPrueba demasiados intentos de contraseña usuario:");
		server.requestAction("Sara", "00", "SELECT");//Intenta una accion con contraseña incorrecta
		server.requestAction("Sara", "00", "SELECT");//Intenta una accion con contraseña incorrecta
		server.requestAction("Sara", "00", "SELECT");//Intenta una accion con contraseña incorrecta
		server.requestAction("Sara", "000", "SELECT");//Intenta una accion con contraseña correcta, pero esta bloqueado


	}

}
