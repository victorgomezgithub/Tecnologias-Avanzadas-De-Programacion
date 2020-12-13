import java.math.BigDecimal;

public abstract class Producto {

	private BigDecimal precio;
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public BigDecimal precioAPagarMenos(BigDecimal cantidad) {
		precio = precio.subtract(cantidad);
		return precio;
	}
	
}
