
public class MascarillasEnPortugal implements MascarillasDespuesDeImpuestos{
	
	
	@Override
	public double calcularPrecio(int numeroMascarillas, double precioMascarillas) {
		System.out.println("\n\nPORTUGAL\n");
		System.out.println("El precio de " + numeroMascarillas + " a: " + precioMascarillas + "€");
		double precioDespuesDeImpuestos = numeroMascarillas * precioMascarillas * 1.06;
		System.out.println("Despues de impuestos es: " + String.format("%.2f", precioDespuesDeImpuestos));
		return precioDespuesDeImpuestos;
	}

	@Override
	public String getPais() {
		return "PORTUGAL";
	}
	
}
