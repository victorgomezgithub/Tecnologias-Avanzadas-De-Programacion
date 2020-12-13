
public class Main {

	public static void main(String[] args) {
		
		CentroComercial centroComercial = new CentroComercial();
		
		
		centroComercial.addTiendas(new TiendaZara());
		centroComercial.addTiendas(new TiendaPrimark());
		centroComercial.addRestaurante(new RestauranteFrances());
		centroComercial.addRestaurante(new RestauranteItaliano());
		centroComercial.setParking(new ParkingGrande());
		centroComercial.getInformacionCentroComercial();
	

		
	}

}
