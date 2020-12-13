
public class Main {

	public static CalcularEnvio web;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String productos1 = "Pedido: Camiseta Gris, Pantalones Pinzas Rojos";
		float pedido1 = 3.2f;
		web = new CalcularEnvio(new CasaStrategy(),pedido1);
		
		System.out.println("-------------------");
		System.out.println(productos1);
		System.out.println("\n"+web.envio()+" "+ web.precio()+" €" );
		TiendaPulsado();
		System.out.println(web.envio()+" "+ web.precio()+" €" );
		System.out.println("-------------------");
		
		String productos2 = "Pedido: Chaqueta Amarilla";
		float pedido2 = 9.2f;
		web = new CalcularEnvio(pedido2);
		CorreoPulsado();
		System.out.println(productos2);
		System.out.println("\n"+web.envio()+" "+ web.precio()+" €" );	
		System.out.println("-------------------");
		
	}

public static void CorreoPulsado() {
// TODO Auto-generated method stub
Main.web.setStrategy(new CorreoStrategy());
}

public static void CasaPulsado() {
	// TODO Auto-generated method stub
	Main.web.setStrategy(new CasaStrategy());
	}

public static void TiendaPulsado() {
	// TODO Auto-generated method stub
	Main.web.setStrategy(new TiendaStrategy());
	}

}
