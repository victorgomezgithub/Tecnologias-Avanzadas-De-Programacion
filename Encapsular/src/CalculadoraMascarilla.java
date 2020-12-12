
public class CalculadoraMascarilla {
	
	
	public CalculadoraMascarilla() {
	}

	public void calcularPrecioMascarillasPorPais(String pais, int numeroMascarillas, double precio) {
		
		double precioTotal = numeroMascarillas * precio;
		
		precioTotal = getPrecioConImpuesto(precioTotal, pais);
		
		System.out.println(numeroMascarillas + " x Mascarilla con precio " + precio +" en " + pais + " a: " + precioTotal + " euros");
	}
	
	private double getPrecioConImpuesto(double precioTotal, String pais) {

		if(pais.equals("ALEMANIA"))
			return precioTotal * 1.05;
		
		if(pais.equals("PORTUGAL"))
			return precioTotal * 1.06;
		
		if(pais.equals("ESLOVENIA"))
			return precioTotal * 1.22;
		
		return precioTotal;
		
	}
}
