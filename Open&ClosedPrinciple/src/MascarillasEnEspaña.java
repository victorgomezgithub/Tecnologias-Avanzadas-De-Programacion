
public class MascarillasEnEspa�a implements MascarillasDespuesDeImpuestos{

	private final String PAIS = "ESPA�A";
	
	@Override
	public double calcularPrecio(int numeroMascarillas, double precioMascarillas) {
		System.out.println("\n\nESPA�A\n");
		System.out.println("El precio de " + numeroMascarillas + " a: " + precioMascarillas + "�");
		double precioDespuesDeImpuestos = numeroMascarillas * precioMascarillas * 1.21;
		System.out.println("Despues de impuestos es: " + String.format("%.2f", precioDespuesDeImpuestos));
		return precioDespuesDeImpuestos;
	}

	@Override
	public String getPais() {
		return PAIS;
	}

}
