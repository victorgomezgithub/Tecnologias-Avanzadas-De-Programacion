public class Tecladobaratoluzescritura implements ControlLuz, Escritura{
	private boolean repro=false;
	private boolean mayus=false;
	private int esquemaluzactual=1;
	@Override
	public void toogleMayus() {
		mayus=!mayus;
				
	}

	@Override
	public void escribirletranumerosigno(char type) {
		System.out.println("Se escribe la letra:"+type);
		
	}

	@Override
	public void nextlightscheme() {
		esquemaluzactual= esquemaluzactual+1;
		System.out.println("Esquema de luz actual="+esquemaluzactual);
		if (esquemaluzactual==3) {
			System.out.println("Vuelta al primer esquema de luz");
			esquemaluzactual=1;
		}
				
	}

	@Override
	public void previuslightscheme() {
		esquemaluzactual= esquemaluzactual-1;
		System.out.println("Esquema de luz actual="+esquemaluzactual);
		if (esquemaluzactual==0) {
			System.out.println("Vuelta al ultimo esquema de luz");
			esquemaluzactual=9;
		}
				
	}

	@Override
	public void colorpersonalizado(int r, int g, int b) {
		System.out.println("Se establece el color r="+r+" g="+g+" b="+b);
		
	}

}
