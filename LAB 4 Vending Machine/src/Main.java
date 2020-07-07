
public class Main {
	public static void main (String args[]) {
		VendingMachine mach = new VendingMachine();
		VendingMachineMenu ven = new VendingMachineMenu();
		ven.run(mach);
	}

}
