
public abstract class Employer {
	
	private String name;
	private int salary;
	
	public Employer(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public abstract void doWork();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
