package patronObserver;

import java.util.ArrayList;


public class VisEmpresa{
	
private ArrayList<EmpresaObserver> observers;
private final String name;
private double prize;


	public VisEmpresa(String name, double prize) {
		observers = new ArrayList<>();
		this.name = name;
		this.prize = prize;
		
	}
	
	public void modificarPrecioCompra() {
		
		this.prize = this.prize*1.1; 
		System.out.println("Nombre empresa: " + this.name);
		notifyObservers();
	}
	
	public void modificarPrecioVenta() {
		this.prize = this.prize*0.9;
		System.out.println("Nombre empresa: " + this.name);
		notifyObservers();
	}
	
	public void addObserver(EmpresaObserver o) {
		this.observers.add(o);
	}
	
	public void removeObserver(EmpresaObserver o) {
		this.observers.remove(o);
	}
	
	public void notifyObservers() {
		
		for(EmpresaObserver o : this.observers) {
			
			o.update(this.prize);
			
		}
	}

	public double getPrize() {
		return prize;
	}
	public String getName() {
		return name;
	}
	

}
