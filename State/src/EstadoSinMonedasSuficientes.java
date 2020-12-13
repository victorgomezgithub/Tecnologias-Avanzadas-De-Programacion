
public class EstadoSinMonedasSuficientes implements Estado{

	@Override
	public void introducirMoneda(Maquina m) {
		System.out.println("Moneda introducida");
		m.pagandoProducto(m.getMonedaIntroducida());
		if (m.getProductoSeleccionado().getPrecio().doubleValue() > 0) {
			System.out.println("Introducir más monedas");
		} else {
			System.out.println("Todo pagado, no hay devoluciones");
			m.setEstado(new EstadoEntregaProducto());
		}
		

	}

	@Override
	public void retirarMoneda(Maquina m) {
		System.out.println("Retiramos monedas y deseleccionamos producto");
		m.setEstado(new EstadoProductoNoSeleccionado());
		
	}



	@Override
	public void recogerProducto(Maquina m) {
		System.out.println("No hay nada que recoger...");
		
	}

	@Override
	public void seleccionarProductoNueces(Maquina m) {
		System.out.println("Producto ya seleccionado!");
		
	}

	@Override
	public void seleccionarProductoFintaDeNaranja(Maquina m) {
		System.out.println("Producto ya seleccionado!");
		
	}

	@Override
	public void seleccionarProductoDuritos(Maquina m) {
		System.out.println("Producto ya seleccionado!");
		
	}

}
