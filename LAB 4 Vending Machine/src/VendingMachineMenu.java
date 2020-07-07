import java.util.Scanner;
/**
 * The VendingMachineMenu creates the menu to display VendingMachine
 */
public class VendingMachineMenu {
	private Scanner in; 
	private static Coin[] coins =
		{ 
			new Coin (0.05, "nickel"),
			new Coin (0.10, "dime"),
			new Coin (0.25, "quarter"),
			new Coin (1.00, "dollar"),
		};
	/**
	 * Constructs Scanner 
	 */
	VendingMachineMenu() { 
		in =  new Scanner(System.in);
	}
	
	public Object getChoice(Object[] choices) {
		while(true) {
			char c = 'A';
			for(Object choice: choices) {
				System.out.println(c + ")" + choice);
				c++;
			}
			String input = in.next();
			int n = input.toUpperCase().charAt(0) - 'A';
			if(0 <= n && n < choices.length) {
				return choices[n];
			}
		}
	}
	/**
	 * Method that runs entire Vending Machine
	 * @param m Vending Machine object
	 */
	void run(VendingMachine m) {
	    boolean choice = true;
	    
		while (choice) 
		{
			System.out.println("Vending Machine: \n");
			System.out.println(" S)how proudcts\n I)nsert coin \n B)uy\n A)dd product\n R)emove coins\n Q)uit\n");
		    System.out.print ("Selection: " );
	        
		    switch (in.next().charAt(0)) {
		    case 'S':
		    	m.disProduct(); 
		    	break; 
		    case 'I':
		    	System.out.println("A)" + coins[0].toString());
		    	System.out.println("B)" + coins[1].toString());
		    	System.out.println("C)" + coins[2].toString());
		    	System.out.println("D)" + coins[3].toString());
		    	
		    	switch(in.next().charAt(0)) {
		    	case 'A':
		            m.addMoney(coins[0]);
			    	System.out.println("Inserted $0.05");
		            break;
		    	case 'B':
		    		m.addMoney(coins[1]);
			    	System.out.println("Inserted $0.10");
		    		break;
		    	case 'C':
		    		m.addMoney(coins[2]);
			    	System.out.println("Inserted $0.25");
		    		break;
		    	case 'D':
		    		m.addMoney(coins[3]);
			    	System.out.println("Inserted $1.00");
		    		break;
			    default:
			    	System.out.println("Incorrect coin insertion!");
			    	break;
		    	}
		    	break;
		    case 'B':
		    	Product pro[] = m.getProductTypes();
		    	//getChoice(pro);
		    	char c = 'A';
		    	for( int i = 0; i < pro.length; i++) {
		    		System.out.println(c + ") " + pro[i].toString());
		    		c++; 
		    	}
		    	if(pro.length == 0) {
		    		System.out.println("There are no products");
		    	}
		    	else {
			    		m.buyProduct(pro[(int)in.next().charAt(0) - 65]);		    		
		    		}
		    	break;
		    case 'A':
	            System.out.print("Description:");
	            String des = in.next();	
	            System.out.print("Price:");
	            double prc = in.nextDouble();
	            System.out.print("Quantity:");
	            int quan = in.nextInt();
	            m.addProduct(new Product(des, prc), quan);
		    	break;
		    case 'R':
		    	m.removeMoney();
		    	break;
		    case 'Q':
		    	choice = false;
		    	System.out.println("Please come again!");
		    	break;
		    default:
		    	System.out.println("Incorrect choice");
		    	break;
		    }
	    }
	}

}
