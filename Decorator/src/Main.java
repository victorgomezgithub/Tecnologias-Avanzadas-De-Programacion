
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pizza i = new MasaIntegral();
	Pizza q = new MasaQuinoa();
	Pizza n = new Chorizo(new Parmesano(new MasaMadre()));
	
	i = new Jamon(i);
	q = new Mozzarella(i);
	
	System.out.println("\n"+i.getName()+": ");
	System.out.println(i.getPrice()+" €");
	System.out.println("---------");
	System.out.println(q.getName()+": ");
	System.out.println(q.getPrice()+" €");
	System.out.println("---------");
	System.out.println(n.getName()+": ");
	System.out.println(n.getPrice()+" €");
	
	}
}
