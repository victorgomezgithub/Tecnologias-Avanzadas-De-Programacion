
public class MasaQuinoa extends Pizza {

	public MasaQuinoa() {
		this.setName("Pizza de quinoa " + this.addGlutenFree());
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 1.6f;
	}

	private String addGlutenFree() {
	    String g = "sin gluten";
		return g;
	}

}
