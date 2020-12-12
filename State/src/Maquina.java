import java.math.BigDecimal;

public class Maquina {

	private Producto productoSeleccionado;
	private Estado current;

	public Maquina() {
		setProductoSeleccionado(null);
		this.current = new ProductoNoSeleccionado();
	}

	public void setEstado(Estado e) {
		this.current = e;
	}

	public void introducirMoneda() {
		this.current.introducirMoneda(this);
	}

	public void retirarMoneda() {
		this.current.retirarMoneda(this);
	}

	public void seleccionarProducto(String producto) {
		if(producto.equals("Nueces"))
			this.current.seleccionarProductoNueces(this);
		if(producto.equals("FintaDeNaranja"))
			this.current.seleccionarProductoFintaDeNaranja(this);
		if(producto.equals("Duritos"))
			this.current.seleccionarProductoDuritos(this);
	}

	public void recogerProducto() {
		this.current.recogerProducto(this);
	}

	public Producto getProductoSeleccionado() {
		return productoSeleccionado;
	}

	public void setProductoSeleccionado(Producto productoSeleccionado) {
		this.productoSeleccionado = productoSeleccionado;
	}
	
	public void pagandoProducto(BigDecimal valor) {
		System.out.println("Falta por pagar: " + productoSeleccionado.precioAPagarMenos(valor));
	}

}
