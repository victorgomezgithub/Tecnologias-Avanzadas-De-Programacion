package dip;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Speciality> medics;
	
	public Hospital(ArrayList<Speciality> medics) {
		this.medics = medics;
	}
	
	public void work() {
		for(Speciality s:medics) {
			s.readExpedient();
			s.diagnostic();
			s.takeAction();
		}
	}

}
