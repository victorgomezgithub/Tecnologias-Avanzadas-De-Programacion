
public class TiendaStrategy implements EnvioStrategy {

	
	@Override
	public float precio(float pedido) {
		// TODO Auto-generated method stub
		return 0f*pedido;
	}

	@Override
	public String envio() {
		// TODO Auto-generated method stub
		String env = "Recogida en tienda";
		return env;
	}

}
