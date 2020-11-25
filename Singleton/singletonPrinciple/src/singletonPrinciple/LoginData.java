package singletonPrinciple;

public class LoginData {
	

	private String name;
	private String fotos;
	private String info;

	
	private static LoginData myLog;
	
	

	public static LoginData getLoggin() {
		if(myLog==null) {
			myLog = new LoginData();
		}
		return myLog;
	}
	
	public LoginData() {
		
	}
	
	public void init(String nombre, String fotos, String info) {
		this.name = nombre;
		this.fotos = fotos;
		this.info = info;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
