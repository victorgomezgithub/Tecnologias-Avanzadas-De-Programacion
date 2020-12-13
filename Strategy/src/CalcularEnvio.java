
public class CalcularEnvio {

	private EnvioStrategy strategy;
	private float pedido;
	
	
	public CalcularEnvio(float pedido) {
		this.pedido = pedido;
	}

	public CalcularEnvio(EnvioStrategy strategy,float pedido) {
		this.strategy = strategy;
		this.pedido = pedido;
	}

	public void setStrategy(EnvioStrategy strategy) {
		this.strategy = strategy;
	}
	
	public float precio() {
		return this.strategy.precio(pedido);
	}
	
	public String envio() {
		return this.strategy.envio();
	}

	

}
