
public class Chorizo extends Embutido {

	public Chorizo(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return p.getName()+ " con chorizo";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice() + 1.6f;
	}
}
