import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		Maquina maquina = new Maquina();
		System.out.println("\n\nSe piden nueces, pagando 1.5 y se recogen:");
		maquina.seleccionarProducto("Nueces");
		maquina.introducirMoneda(new BigDecimal("1.5"));
		maquina.recogerProducto();
		
		System.out.println("\n\nSe retira dinero, se pide Finta de Naranja, pagando 1 ,se intenta recoger y se retira dinero:");
		maquina.retirarMoneda();
		maquina.seleccionarProducto("FintaDeNaranja");
		maquina.introducirMoneda(new BigDecimal("1"));
		maquina.recogerProducto();
		maquina.retirarMoneda();
		
	}

}
