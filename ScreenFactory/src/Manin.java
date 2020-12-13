
public class Manin {

	public static void main(String[] args) {
		Pantalla p1= ScreensFactory.getPantalla("15");
		Pantalla p2= ScreensFactory.getPantalla("15 laminado");
		Pantalla p3= ScreensFactory.getPantalla("13");
		Pantalla p4= ScreensFactory.getPantalla("14.1 laminado");
		
		System.out.print("El precio para la primera pantalla sera de "+p1.getImportePantalla()+" euros. \n");
		System.out.print("El precio para la segunda pantalla sera de "+p2.getImportePantalla()+" euros. \n");
		System.out.print("El precio para la tercera pantalla sera de "+p3.getImportePantalla()+" euros. \n");
	}

}
