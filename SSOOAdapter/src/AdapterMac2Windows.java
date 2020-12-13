public class AdapterMac2Windows implements Windows{
	
	private Mac mac;
	
	public AdapterMac2Windows(Mac mac) {
		this.mac= mac;
	}
	@Override
	public double installexemonitoring() {
		return mac.installdmgmonitoring();
	}

	@Override
	public double taskmanagerprocess() {
		return mac.finderprocess();
	}

	@Override
	public double progmonitoringwindows() {
		return mac.progmonitoringmac();
	}

}
