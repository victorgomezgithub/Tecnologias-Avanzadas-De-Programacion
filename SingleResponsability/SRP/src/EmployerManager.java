import java.util.ArrayList;

public class EmployerManager {

	private ArrayList<Employer> e = new ArrayList<Employer>();
	
	public EmployerManager() {
		
	}
	
	public void Trabajar() {
		for(Employer aux:e) {
			aux.doWork();
		}
	}
	
	public void addEmployer(Employer emplo) {
		e.add(emplo);
	}

}
