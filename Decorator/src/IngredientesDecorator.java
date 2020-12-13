
public abstract class IngredientesDecorator extends Pizza {

	protected Pizza p;
	
	public IngredientesDecorator(Pizza p) {
		this.p=p;
	}
	
	@Override
	public abstract String getName();
	
	@Override
	public abstract float getPrice();

}
