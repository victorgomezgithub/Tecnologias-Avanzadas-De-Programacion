
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VasoTubo tubo= new VasoTubo();
		tubo.setColor("rojo");
		tubo.setTipo("VasoTubo");
		tubo.setPrecio(1.5f);
		tubo.setSize("Grande");
		
		VasoTubo tubo2 = tubo.clonar();
		tubo2.setPrecio(2.5f);
		tubo2.setSize("Pequeño");
		
		VasoMini mini= new VasoMini();
		mini.setColor("azul");
		mini.setTipo("VasoMini");
		mini.setPrecio(1.5f);
		mini.setCapacidad(2f);
		
		VasoMini mini2 = mini.clonar();
		mini2.setColor("amarillo");
		mini2.setCapacidad(5.5f);
		
		System.out.println("Características Vaso1");
		System.out.println("Tipo:"+tubo.getTipo()+" Color:"+tubo.getColor()+" Precio:"+tubo.getPrecio()+"€"+" Tamaño:"+tubo.getSize());
		
		System.out.println("------------------");
		System.out.println("Características Vaso2");
		System.out.println("Tipo:"+tubo2.getTipo()+" Color:"+tubo2.getColor()+" Precio:"+tubo2.getPrecio()+"€"+" Tamaño:"+tubo2.getSize());
		
		System.out.println("------------------");
		System.out.println("Características Vaso3");
		System.out.println("Tipo:"+mini.getTipo()+" Color:"+mini.getColor()+" Precio:"+mini.getPrecio()+"€"+" Tamaño:"+mini.getCapacidad()+"L");
	
		System.out.println("------------------");
		System.out.println("Características Vaso4");
		System.out.println("Tipo:"+mini2.getTipo()+" Color:"+mini2.getColor()+" Precio:"+mini2.getPrecio()+"€"+" Tamaño:"+mini2.getCapacidad()+"L");
	
	}

}
