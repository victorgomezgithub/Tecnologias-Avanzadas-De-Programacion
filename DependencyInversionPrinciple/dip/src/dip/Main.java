package dip;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Speciality> medics = new ArrayList<Speciality>();
		Neurologist n;
		Cardiologist c;
		FamilyDoctor f;
		
		medics.add(n = new Neurologist());
		medics.add(c = new Cardiologist());
		medics.add(n = new Neurologist());
		medics.add(f = new FamilyDoctor());
		
		

		
		
		Hospital hospital = new Hospital(medics);
		
		hospital.work();
	}

}
