package programarinterfaz;

public class General extends Producto {

	public General(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.precio = calcularIVA(precioBase);
		
	}

	@Override
	public double calcularIVA(double precioBase) {
		// TODO Auto-generated method stub
		return precioBase * 1.21;
	}
}
