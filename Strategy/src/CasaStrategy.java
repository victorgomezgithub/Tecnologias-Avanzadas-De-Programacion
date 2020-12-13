
public class CasaStrategy implements EnvioStrategy {

	@Override
	public float precio(float pedido) {
		// TODO Auto-generated method stub
		return 2f*pedido;
	}

	@Override
	public String envio() {
		// TODO Auto-generated method stub
		String env = "Envio a domicilio";
		return env;
	}

}
