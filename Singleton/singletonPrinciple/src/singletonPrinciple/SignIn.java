package singletonPrinciple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignIn {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	static API db = new API();
	
	
	// Representación de consulta de datos a una API
	public static boolean checkBBDD(String email, String password) throws IOException {
		
		boolean b;
	
		return b = db.checkUser(email, password);
	}

}
