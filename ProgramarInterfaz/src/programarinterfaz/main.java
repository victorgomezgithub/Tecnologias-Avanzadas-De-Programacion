package programarinterfaz;

public class main {

	public static void main(String[] args) {
		Producto g = new General("televisor", 140.5);
		Producto r = new Reducido("cine", 8);
		Producto s = new Superreducido("leche", 0.54);
		
		System.out.println("Nombre: " + g.nombre);
		System.out.println("Precio Base: " + g.precioBase);
		System.out.println("Precio Iva: " + g.precio);
		System.out.println("Nombre: " + r.nombre);
		System.out.println("Precio Base: " + r.precioBase);
		System.out.println("Precio Iva: " + r.precio);
		System.out.println("Nombre: " + s.nombre);
		System.out.println("Precio Base: " + s.precioBase);
		System.out.println("Precio Iva: " + s.precio);

	}

}
