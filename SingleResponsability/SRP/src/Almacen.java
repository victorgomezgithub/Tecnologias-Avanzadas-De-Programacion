import java.util.ArrayList;
import java.util.HashMap;

public class Almacen {
	
	HashMap<ProductType, Suministro> suministros = new HashMap<ProductType, Suministro>();
	ArrayList<Camera> cameras = new ArrayList<Camera>();
	
	
	
	public Almacen() {
		
	}
	
	public void addSupply(Suministro s) {
		if(suministros.containsKey(s.getSupply())) {
			Suministro aux = suministros.get(s.getSupply());
			aux.addSupplies(s.getCantidad());
		} else {
			suministros.put(s.getSupply(), s);
		}	
	}
	
	public void sellSupply(ProductType pT, int amount) {
		if(suministros.containsKey(pT)) {
			Suministro aux = suministros.get(pT);
			if(aux.getCantidad()>= amount) {
				aux.subtractSupplies(amount);
			} else {
				System.out.println("Solamente disponemos de "+aux.getCantidad()+" de este producto.");
			}
		} else {
			System.out.println("No disponemos de ese producto.");
		}
	}
	
	public void reportSupplies() {
		for(Suministro s: suministros.values()) {
			System.out.println(s);
		}
		
	}
	
	public void addCamera(Camera c) {
		cameras.add(c);
	}
}
