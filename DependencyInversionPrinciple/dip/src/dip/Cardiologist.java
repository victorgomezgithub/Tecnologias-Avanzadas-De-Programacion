package dip;

public class Cardiologist implements Speciality {

	@Override
	public void readExpedient() {
		System.out.println("hmmm... interesante...");
	}

	@Override
	public void diagnostic() {
		System.out.println("Usted es un licantropo.");
	}

	@Override
	public void takeAction() {
		System.out.println("Tome estas pastillas una vez al més cuando haya luna llena.");
	}

}
