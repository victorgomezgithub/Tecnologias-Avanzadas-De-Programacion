
public abstract class Embutido extends IngredientesDecorator{

	public Embutido(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public abstract String getName();

	@Override
	public abstract float getPrice();
}
