import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Windows> pcs = new ArrayList<>();
		
		pcs.add(new XiaomiPC());
		pcs.add(new AdapterMac2Windows(new MacbookPro()));
		pcs.add(new AdapterLinux2Windows(new SlimbookLinuxPC()));
		for(Windows a : pcs) {
			double success= a.installexemonitoring();
			System.out.println("\n");
			if (success==0){
				System.out.println("Not installed correctly, trying another time.\n");
				a.installexemonitoring();
				System.out.println("\n");

			}
		}
		for(Windows a : pcs) {
			a.taskmanagerprocess();
			System.out.println("\n");

			
		}
		for(Windows a : pcs) {
			double illegal= a.progmonitoringwindows();
			if(illegal==0) {
				System.out.println("This PC will be punished.");
				System.out.println("\n");
			}

			
		}

	}

}
