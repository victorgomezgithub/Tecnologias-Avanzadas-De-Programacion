import java.util.ArrayList;

public class CentroComercial {

	private ArrayList<Tienda> tiendas;
	private ArrayList<Restaurante> restaurantes;
	private Parking parking;
	
	
	public CentroComercial() {
		tiendas  = new ArrayList<Tienda>();
		restaurantes = new ArrayList<Restaurante>();
		setParking(new ParkingPequeño());
	}
	
	public ArrayList<Tienda> getTiendas() {
		return tiendas;
	}


	public void addTiendas(Tienda tienda) {
		tiendas.add(tienda);
	}
	
	
	public ArrayList<Restaurante> getRestaurantes() {
		return restaurantes;
	}


	public void addRestaurante(Restaurante restaurante) {
		restaurantes.add(restaurante);
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}
	
	
	
	public void getInformacionCentroComercial() {

		getInfoTiendas();
		getInfoRestaurantes();
		getInfoParking();

	}
	
	private void getInfoTiendas() {
		System.out.println("DATOS TIENDAS");
		System.out.println("*************");
		for(Tienda tienda: tiendas) {
			tienda.getInformacion();
		}
	}
	
	
	private void getInfoRestaurantes() {
		System.out.println("DATOS RESTAURANTES");
		System.out.println("******************");
		for(Restaurante restuarante: restaurantes) {
			restuarante.getInformacion();
		}
	}
	
	private void getInfoParking()
	{
		System.out.println("DATOS PARKING");
		System.out.println("******************");
		parking.getInformacion();
	}
}
