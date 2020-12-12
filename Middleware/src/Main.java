

public class Main {

	public static void main(String[] args) {

		AlmacenUsuarios.añadirUsuario(new UsuarioCliente("Joe","1234"));
		
		Middleware middleware = new CheckAttempts();
		
		middleware.linkWith(new CheckAuthentification());
		
		Server server = new Server(middleware);
		
		server.logIn("Joe", "134");
		server.logIn("Joe", "134");
		server.logIn("Joe", "134");

		if (server.logIn("Joe", "1234"))
			System.out.println("Estamos dentro");
		
		else
			System.out.println("Estamos fuera");
		
	}

}
