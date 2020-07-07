import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 * Creates Vending Machine
 */
public class VendingMachine 
{
	DecimalFormat df = new DecimalFormat("#.00"); 
	private ArrayList<Product> products;
	public CoinSet coins;
	public CoinSet currentCoins;
	public ArrayList<Product> storage;
	private double change;
	/**
	 * Constructs Vending Machine variables
	 */
	VendingMachine() 
	{
		products = new ArrayList<Product>();
		coins = new CoinSet();
		currentCoins = new CoinSet();
		storage = new ArrayList<Product>();
		change = 0.0;
	}
	
	public double getChange() {
		return change;
	}
	/**
	 * Calls the addCoin method from CoinSet to add money to current coins
	 * @param other reference to coin that is being added
	 */
	public void addMoney(Coin other)
	   { 
	      currentCoins.addCoin(other);
	   }
	/**
	 * Adds a product to the Vending Machine
	 * @param pro the product that is being added
	 * @param quantity the number of products being added
	 */
	public void addProduct(Product pro, int quantity) 
	{
		if(products.contains(pro)) {
			System.out.println( pro.getDescription() + " already exists");
		}
		else {
			for(int i = 0; i < quantity; i++) {
				products.add(pro);
			} 	
			storage.add(pro);
		}
	}
	/**
	 * Method to purchase the product that also calculates change
	 * @param pro the product being purchased
	 */
	public void buyProduct(Product pro)  
	{	
			if (currentCoins.getValue() >= pro.getPrice()) 
			{	
				products.remove(pro);  
				double total = (currentCoins.getValue()) - (pro.getPrice());
				
				String name = "temp";
				Coin tempCoin = new Coin(total, name);
				coins.addCoin(tempCoin);
				
				
			    System.out.println("Inserted $" + df.format(currentCoins.getValue())); 
		        currentCoins.removeAllCoins();
		        currentCoins.addCoins(coins);
		        coins.removeAllCoins();
		        
		        change = coins.SetChange(pro.getPrice());
		        
		        
		        System.out.println("Purchased: " + pro.toString());
			    System.out.println("Change of $" + df.format(currentCoins.getValue())); 
			    currentCoins.removeAllCoins();
			}
			else 
			{
				System.out.println("Insufficient money!");
			}
	}
	/**
	 * The method removes all the money in current coins
	 */
	public void removeMoney() 
	{
		System.out.println("Removed $ " + df.format(getChange()));
		currentCoins.removeAllCoins(); 
	}
	/**
	 * Displays the name of the products in the machine
	 */
	public void disProduct()
	  { 
		Product pro[] = storage.toArray(new Product[0]);
		for(int i = 0; i < pro.length; i++)
		{
			System.out.println(pro[i].toString());
		} 
	  }
	/**
	 * Sets the ArrayList of products to an array
	 * @return the array of products
	 */
	public Product[] getProductTypes() 
	{
		Product pro[] = storage.toArray(new Product[0]);
		return pro;
	}
}
