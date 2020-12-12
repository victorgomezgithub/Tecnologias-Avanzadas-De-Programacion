import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		Maquina maquina = new Maquina();
		maquina.seleccionarProducto("Nueces");
		maquina.introducirMoneda(new BigDecimal("1.5"));
		maquina.recogerProducto();
	}

}
