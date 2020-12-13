
public class VasoMini extends Vaso {

	private float capacidad;
	public VasoMini() {
		
	}
	public VasoMini(VasoMini v ){
		super(v);
		this.capacidad=v.capacidad;
}

	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	public VasoMini clonar() {
		return new VasoMini(this);
	}
}
