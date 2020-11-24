package dip;

public class FamilyDoctor implements Speciality{

	@Override
	public void readExpedient() {
		System.out.println("Ya veo...");
		
	}

	@Override
	public void diagnostic() {
		System.out.println("Doloris de cocorotix.");
		
	}

	@Override
	public void takeAction() {
		System.out.println("Paracetamol y deje el LoL.");
		
	}
	
	

}
