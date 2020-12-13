
public abstract class Vaso {

    private String color;
    private String tipo;
    private float precio;

    public Vaso() {
    	
    }
    public Vaso(String color, String tipo, float precio){
        this.color = color;
        this.tipo = tipo;
        this.precio = precio;
	}
	public Vaso(Vaso v){
	    this.color = v.color;
	    this.tipo = v.tipo;
	    this.precio = v.precio;
	}
    public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
  
    public abstract Vaso clonar();
}
