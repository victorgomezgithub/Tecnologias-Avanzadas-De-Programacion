package singletonPrinciple;

public class API {
	
	private final String emailBBDD = "Luis@gm.com";
	private final String passwordBBDD = "123";
	
	public boolean checkUser(String email, String password) {
		
		boolean b = false;
		
		if(emailBBDD.equals(email) && passwordBBDD.equals(password)) {
			LoginData log = LoginData.getLoggin();
			log.init("Luis", "Fotos Portugal", "Quierete...");
			
			b = true;
			System.out.println("¡Bienvenido!");

		} else {
			System.out.println("Los datos introducidos no son correctos, vuelva a intentarlo.");
		}
		
		return b;
	}
}
