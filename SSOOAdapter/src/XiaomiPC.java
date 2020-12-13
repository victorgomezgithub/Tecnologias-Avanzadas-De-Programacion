
public class XiaomiPC implements Windows{

	@Override
	public double installexemonitoring() {
		System.out.println("Downloading exe, executing as administrator...");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("Installed correctly.");

		}
		return rand;
	}

	@Override
	public double taskmanagerprocess() {
		System.out.println("Ctrl+Alt+Supr, taskmanager, showing CPU and procesess");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("No illegal processes running currently.");

		}
		else {
			System.out.println("Chrome/Firefox catch illegal behavior.");

		}
		return rand;
		
	}

	@Override
	public double progmonitoringwindows() {
		System.out.println("Ctrl+Alt+Supr, taskmanager, showing CPU and procesess");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("All workspace running correctly");

		}
		else {
			System.out.println("No workspace running at this moment.");

		}
		return rand;
		
	}

}
