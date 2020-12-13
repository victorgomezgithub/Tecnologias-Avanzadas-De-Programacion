import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		ProductType tp = null;
		
		Almacen alma = new Almacen();
		Suministro s;
		EmployerManager em = new EmployerManager();
		Employer e;
		Camera c;
		
		int aux = 10;
		int tipoProd = 0;
		int cantidad = 0;
		int tipoEmple = 0;
		String name;
		int salary;
		
		while(aux != 0) {
			System.out.println("Escoja una opción: ");
			System.out.println("1- Añadir un producto.");
			System.out.println("2- Añadir un empleado");
			System.out.println("3- Mandar trabajar");
			System.out.println("4- Añadir cámaras");
			System.out.println("5- Grabar cámaras");
			System.out.println("0- Salir");

			aux = Integer.parseInt(reader.readLine());
			
			switch(aux) {
			case 1:
				System.out.println("Seleccione tipo de producto");
				System.out.println("1- Comida");
				System.out.println("2- Bebida");
				System.out.println("3- Utiles");
				tipoProd = Integer.parseInt(reader.readLine());
				System.out.println("¿Cuantos productos?");
				cantidad = Integer.parseInt(reader.readLine());
				
				switch(tipoProd) {
				case 1:
					tp = tp.Comida;
					s = new Suministro(tp, cantidad);
					alma.addSupply(s);
					break;
				case 2:
					tp = tp.Bebida;
					s = new Suministro(tp, cantidad);
					alma.addSupply(s);
					break;
				case 3:
					tp = tp.Utiles;
					s = new Suministro(tp, cantidad);
					alma.addSupply(s);
					break;
				}
				break;
			case 2:
				System.out.println("Seleccione tipo de empleado");
				System.out.println("1- Vigilante");
				System.out.println("2- Operador");
				tipoEmple = Integer.parseInt(reader.readLine());
				System.out.println("Introduzca nombre");
				name = reader.readLine();
				System.out.println("Introduzca sueldo");
				salary = Integer.parseInt(reader.readLine());
						
				switch(tipoEmple) {
				case 1:
					e = new Watchman(name, salary);
					em.addEmployer(e);
					break;
					
				case 2:
					e = new Operator(name, salary);
					em.addEmployer(e);
					break;
				}
				break;
			case 3:
				em.Trabajar();
				break;
			case 4:
				c =  new Camera();
				alma.addCamera(c);
				break;
			case 5:
				c =  new Camera();
				c.record();
				break;

			}

			
		}
		
		
		

	}

}
