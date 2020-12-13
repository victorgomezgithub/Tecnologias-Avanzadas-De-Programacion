
public class AdapterLinux2Windows implements Windows{
	
	private Linux linux;
	
	public AdapterLinux2Windows(Linux linux) {
		this.linux= linux;
	}
	@Override
	public double installexemonitoring() {
		return linux.sudoaptinstallmonitoring();
	}

	@Override
	public double taskmanagerprocess() {
		return linux.sudops();
	}

	@Override
	public double progmonitoringwindows() {
		return linux.sudosumonitoring();
	}

}
