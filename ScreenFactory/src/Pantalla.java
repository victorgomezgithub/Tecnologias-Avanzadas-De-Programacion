
public abstract class Pantalla {
	private double precio=100;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public abstract double getImportePantalla();
}
