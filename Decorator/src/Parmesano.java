
public class Parmesano extends Queso {

	public Parmesano(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return p.getName()+ " con queso parmesano de "+ Maduracion() + " meses de maduración";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice() + .4f;
	}

	@Override
	public int Maduracion() {
		// TODO Auto-generated method stub
		return 3;
	}

}
