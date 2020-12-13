
public class EstadoEntregaProducto implements Estado{

	@Override
	public void introducirMoneda(Maquina m) {
		System.out.println("¡Recoge tu producto!");
	}

	@Override
	public void retirarMoneda(Maquina m) {
		System.out.println("¡Recoge tu producto!");		
	}

	@Override
	public void recogerProducto(Maquina m) {
		System.out.println("¡Producto entregado!");
		m.setEstado(new EstadoProductoNoSeleccionado());
	}

	@Override
	public void seleccionarProductoNueces(Maquina m) {
		System.out.println("¡Recoge tu producto!");		
		
	}

	@Override
	public void seleccionarProductoFintaDeNaranja(Maquina m) {
		System.out.println("¡Recoge tu producto!");		
		
	}

	@Override
	public void seleccionarProductoDuritos(Maquina m) {
		System.out.println("¡Recoge tu producto!");		
		
	}

}
