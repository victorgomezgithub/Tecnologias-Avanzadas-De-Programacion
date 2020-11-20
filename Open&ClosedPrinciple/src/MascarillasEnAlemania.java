
public class MascarillasEnAlemania implements MascarillasDespuesDeImpuestos{

	
	@Override
	public double calcularPrecio(int numeroMascarillas, double precioMascarillas) {
		System.out.println("\n\nALEMANIA\n");
		System.out.println("El precio de " + numeroMascarillas + " a: " + precioMascarillas + "�");
		double precioDespuesDeImpuestos = numeroMascarillas * precioMascarillas * 1.05;
		System.out.println("Despues de impuestos es: " + String.format("%.2f", precioDespuesDeImpuestos));
		return precioDespuesDeImpuestos;
	}

	@Override
	public String getPais() {
		return "ALEMANIA";
	}
	 
	
	
}
