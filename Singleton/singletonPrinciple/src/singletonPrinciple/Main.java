package singletonPrinciple;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main {

	//Quiero que mi programa se conecta a una api de una web
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		boolean aux = false;
		
		while(aux == false) {
			
			// email:  Luis@gm.com
			System.out.println("Introduzca correo:");
			String email = reader.readLine();
			
			// pass:  123
			System.out.println("Introduzca contraseña:");
			String password = reader.readLine();
			
			
			aux = SignIn.checkBBDD(email, password);
		}
		
		LoginData log = LoginData.getLoggin();
		
		System.out.println(log.getName());
		System.out.println(log.getFotos());
		System.out.println(log.getInfo());
		
	}

}
