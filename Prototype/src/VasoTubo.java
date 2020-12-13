
public class VasoTubo extends Vaso {

	private String size;
	public VasoTubo() {
		
	}
	public VasoTubo(VasoTubo v ){
		super(v);
		this.size=v.size;
}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public VasoTubo clonar() {
		return new VasoTubo(this);
	}
}
