
public class Mozzarella extends Queso{

	public Mozzarella(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return p.getName()+ " con queso mozzarella de "+ Maduracion() + " meses de maduración";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice() + .7f;
	}

	@Override
	public int Maduracion() {
		// TODO Auto-generated method stub
		return 12;
	}
}
