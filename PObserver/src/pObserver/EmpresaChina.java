package pObserver;

public class EmpresaChina implements EmpresaObserver{
	private double prize;
	
	@Override
	public void update(double prize) {
		// TODO Auto-generated method stub
		this.prize = cambiar(prize);	
		System.out.println("Prize: " + this.prize + "¥");
	}
	

	@Override
	public double cambiar(double prize) {
		return  prize * 104.1;
		
	}

}