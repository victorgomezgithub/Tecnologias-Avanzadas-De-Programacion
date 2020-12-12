
public class ProductoNoSeleccionado implements Estado {

	@Override
	public void introducirMoneda(Maquina m) {
		System.out.println("Antes tienes que escoger producto!");
	}

	@Override
	public void retirarMoneda(Maquina m) {
		System.out.println("Antes tienes que escoger producto!");
	}

	@Override
	public void seleccionarProductoNueces(Maquina m) {
		System.out.println("Producto seleccionado");
		m.setProductoSeleccionado(new Nueces());
		m.setEstado(new EstadoSinMonedasSuficientes());
	}

	@Override
	public void recogerProducto(Maquina m) {
		System.out.println("Antes tienes que escoger producto!");		
	}

	@Override
	public void seleccionarProductoFintaDeNaranja(Maquina m) {
		System.out.println("Producto seleccionado");
		m.setProductoSeleccionado(new FintaDeNaranja());
		m.setEstado(new EstadoSinMonedasSuficientes());		
	}

	@Override
	public void seleccionarProductoDuritos(Maquina m) {
		System.out.println("Producto seleccionado");
		m.setProductoSeleccionado(new Duritos());
		m.setEstado(new EstadoSinMonedasSuficientes());		
	}


}
