
public class Camera {
	
	private int id;
	
	public Camera() {
		this.id = (int) (Math.random()*1000);
	}

	public int getId() {
		return id;
	}

	public void record() {
		System.out.println("Grabando en la cámara: " + id);
	}
	
	

}
