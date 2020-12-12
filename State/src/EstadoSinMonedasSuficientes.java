import java.math.BigDecimal;

public class EstadoSinMonedasSuficientes implements Estado{

	@Override
	public void introducirMoneda(Maquina m) {
		System.out.println("Moneda introducida");
		m.pagandoProducto(new BigDecimal(1));
		if (m.getProductoSeleccionado().getPrecio().doubleValue() > 0) {
			System.out.println("Introducir más monedas");
		} else {
			m.setEstado(new EstadoEntregaProducto());
		}
		

	}

	@Override
	public void retirarMoneda(Maquina m) {
		System.out.println("Retiramos monedas y deselccionamos producto");
		m.setEstado(new ProductoNoSeleccionado());
		
	}

	@Override
	public void seleccionarProducto(Maquina m) {
		System.out.println("Producto ya seleccionado!");
		
	}

	@Override
	public void recogerProducto(Maquina m) {
		System.out.println("No hay nada que recoger...");
		
	}

}
