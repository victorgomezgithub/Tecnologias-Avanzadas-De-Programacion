
public class Jamon extends Embutido {

	public Jamon(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return p.getName()+ " con jamon";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice() + 0.9f;
	}
}
