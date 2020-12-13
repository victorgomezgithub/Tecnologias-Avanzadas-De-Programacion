
public class CorreoStrategy implements EnvioStrategy {

	@Override
	public float precio(float pedido) {
		// TODO Auto-generated method stub
		return 1f*pedido;
	}

	@Override
	public String envio() {
		// TODO Auto-generated method stub
		String env = "Recogida en el establecimiento de Correos más cercano";
		return env;
	}

}
