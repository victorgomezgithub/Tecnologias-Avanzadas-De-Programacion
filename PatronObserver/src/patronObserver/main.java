package patronObserver;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int opcion;
		VisEmpresa i = new VisEmpresa("Inditex", 25.0);
		i.addObserver(new EmpresaChina());
		i.addObserver(new EmpresaUSA());
		i.addObserver(new EmpresaEU());
		
		System.out.println(i.getName());
		System.out.println(i.getPrize());	
		
		do {
			System.out.println("Elige opción:\n1.- Comprar" +
					"\n2.-Vender\n" +
					"0.- Salir \n\n");
			
			 opcion = leerOpcion();
			 
			switch(opcion) {
				case 1:
					i.modificarPrecioCompra();
					break;
				case 2:
					i.modificarPrecioVenta();
					break;
				default:
		}
		}while(opcion != 0);
		
		
	
		
	}
	public static int leerOpcion() {
		Scanner myObj = new Scanner(System.in);  
		int opcion =  myObj.nextInt();
		return opcion;
	}

}
