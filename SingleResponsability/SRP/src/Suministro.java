
public class Suministro {
	
	
	private int cantidad;

	private ProductType supply;
	


	public Suministro(ProductType supply, int cantidad) {
		this.supply = supply;
		this.cantidad = cantidad;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ProductType getSupply() {
		return supply;
	}

	public void setSupply(ProductType supply) {
		this.supply = supply;
	}
	
	public void addSupplies(int amount) {
		this.cantidad += amount;
	}
	
	public void subtractSupplies(int amount) {
		this.cantidad -= amount;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Producto: " + this.supply.name() + ", Cantidad: " + this.cantidad;
	}
}
