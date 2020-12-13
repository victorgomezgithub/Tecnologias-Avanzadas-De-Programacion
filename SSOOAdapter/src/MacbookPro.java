
public class MacbookPro implements Mac{

	@Override
	public double installdmgmonitoring() {
		System.out.println("Downloading dmg, moving to aplicattions...");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("Installed correctly.");

		}
		return rand;
	}

	@Override
	public double finderprocess() {
		System.out.println("Moving to Finder, showing CPU and procesess");
		double rand= Math.round(Math.random());
		if (rand==1) {
			System.out.println("No illegal processes running currently.");

		}
		else {
			System.out.println("Safari catch illegal behavior.");

		}
		return rand;
		
	}

	@Override
	public double progmonitoringmac() {
		System.out.println("Moving to Finder, showing CPU and procesess");
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
