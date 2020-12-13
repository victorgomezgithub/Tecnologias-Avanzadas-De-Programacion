package dip;

public class Neurologist implements Speciality {

	@Override
	public void readExpedient() {
		System.out.println("¿Cómo dice que se llama?");

	}

	@Override
	public void diagnostic() {
		System.out.println("Usted tiene un craneo privilegiado");
		
	}

	@Override
	public void takeAction() {
		System.out.println("Siga así");
		
	}

}
