import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<MascarillasDespuesDeImpuestos> mascarillasPorPa�s = new ArrayList<MascarillasDespuesDeImpuestos>();
		
		mascarillasPorPa�s.add(new MascarillasEnEspa�a());
		mascarillasPorPa�s.add(new MascarillasEnAlemania());
		mascarillasPorPa�s.add(new MascarillasEnPortugal());

		String paisMasCaro = buscarLaMasCara(mascarillasPorPa�s);
		
		System.out.println("El pais mas caro es " + paisMasCaro);

	}
	
	static String buscarLaMasCara(ArrayList<MascarillasDespuesDeImpuestos> mascarillasPorPa�s) {
		double precio = 0;
		String pais = "";
		for(MascarillasDespuesDeImpuestos precioPorPais : mascarillasPorPa�s) {
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
