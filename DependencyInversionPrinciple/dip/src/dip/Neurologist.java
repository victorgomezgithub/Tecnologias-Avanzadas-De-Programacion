package dip;

public class Neurologist implements Speciality {

	@Override
	public void readExpedient() {
		System.out.println("�C�mo dice que se llama?");

	}

	@Override
	public void diagnostic() {
		System.out.println("Usted tiene un craneo privilegiado");
		
	}

	@Override
	public void takeAction() {
		System.out.println("Siga as�");
		
	}

}
