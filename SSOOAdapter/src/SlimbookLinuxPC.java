
public class SlimbookLinuxPC implements Linux{

	@Override
	public double sudoaptinstallmonitoring() {
		System.out.println("Sudo apt-get install monitoring...");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("Installed correctly.");

		}
		return rand;
	}

	@Override
	public double sudops() {
		System.out.println("Open terminal, ps -> showing CPU and procesess");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("No illegal processes running currently.");

		}
		else {
			System.out.println("Chrome/Firefox (linux) catch illegal behavior.");

		}
		return rand;
		
	}

	@Override
	public double sudosumonitoring() {
		System.out.println("Open terminal, ps -> showing CPU and procesess");
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
