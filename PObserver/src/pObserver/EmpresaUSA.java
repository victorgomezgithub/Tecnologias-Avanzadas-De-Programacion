package pObserver;

public class EmpresaUSA  implements EmpresaObserver {
	private double prize;

	@Override
	public void update(double prize) {
		this.prize = prize;
		System.out.println("Prize: " + this.prize + "$");
	}

	@Override
	public double cambiar(double prize) {
		// TODO Auto-generated method stub
		return prize;
	}


}
