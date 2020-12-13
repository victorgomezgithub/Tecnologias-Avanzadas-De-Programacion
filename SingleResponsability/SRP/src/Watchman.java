
public class Watchman extends Employer{


	public Watchman(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void doWork() {
		System.out.println("Vigilando");
	}

}
