
public abstract class Queso extends IngredientesDecorator{

	public Queso(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public abstract String getName();

	@Override
	public abstract float getPrice();
	
	public abstract int Maduracion();
}
