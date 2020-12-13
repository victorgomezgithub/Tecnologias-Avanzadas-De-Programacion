
public class ScreensFactory {
	public static Pantalla getPantalla(String tipo) {
		 
		 if (tipo.equals("15")) {
		 
		 return new Pantalla15();
		 }
		 if (tipo.equals("13")) {
			 
			 return new Pantalla13();
			 }
		 if (tipo.equals("15 laminado")) {
		 
		 return new VidrioLaminado();
		 }
		 else {
			 System.out.println("No disponemos de pantallas del tipo "+tipo);
		 }
		return null;
	 }
}
