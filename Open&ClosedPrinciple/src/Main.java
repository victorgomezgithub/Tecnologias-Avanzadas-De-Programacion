import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<MascarillasDespuesDeImpuestos> mascarillasPorPaís = new ArrayList<MascarillasDespuesDeImpuestos>();
		
		mascarillasPorPaís.add(new MascarillasEnEspaña());
		mascarillasPorPaís.add(new MascarillasEnAlemania());
		mascarillasPorPaís.add(new MascarillasEnPortugal());

		String paisMasCaro = buscarLaMasCara(mascarillasPorPaís);
		
		System.out.println("El pais mas caro es " + paisMasCaro);

	}
	
	static String buscarLaMasCara(ArrayList<MascarillasDespuesDeImpuestos> mascarillasPorPaís) {
		double precio = 0;
		String pais = "";
		for(MascarillasDespuesDeImpuestos precioPorPais : mascarillasPorPaís) {
			if( pais.isEmpty()) {
				precio = precioPorPais.calcularPrecio(10, 2.6);
				pais = precioPorPais.getPais();
			}
			
			if(precio < precioPorPais.calcularPrecio(10, 2.6)){
				precio = precioPorPais.calcularPrecio(10, 2.6);
				pais = precioPorPais.getPais();
			}
						
		}
		
		return pais;
		
	}
	
	

}
