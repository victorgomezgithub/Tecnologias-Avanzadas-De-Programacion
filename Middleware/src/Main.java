

public class Main {

	public static void main(String[] args) {

		AlmacenUsuarios.añadirUsuario(new UsuarioCliente("Joe","1234"));
		
		Middleware middleware = new CheckAttempts();
		
		middleware.linkWith(new CheckAuthentification()).linkWith(new CheckLevel());
		
		
		Server server = new Server(middleware);
		
		server.requestAction("Jo", "1234", "SELECT");
		server.requestAction("Joe", "1234", "UPDATE");
		server.requestAction("Joe", "123", "SELECT");
		
	}

}
