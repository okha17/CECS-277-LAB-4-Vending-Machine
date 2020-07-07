import java.util.ArrayList;
/**
 * Sets coins to Arraylist of coins
 *
 */
public class CoinSet {
	private ArrayList<Coin> set; 
	double change;
	/**
	 * Constructs Coinset arraylist
	 */
	CoinSet() {
		set = new ArrayList<Coin>(); 
		change = 0.0;
	}
	/**
	 * Gets the total value for coins
	 * @return the value of all the coins
	 */
	public double getValue() {
		double sum = 0.0;
	    for(int i =0; i < set.size(); i++) {
		    sum += (set.get(i)).getWorth();
	    }
	      return sum;
	}
	
	public double SetChange(double value) {
		change = change + value;
		return change;
	}
	/**
	 * Adds a coin to the coinset object
	 * @param other the coin that is added
	 */
	public void addCoin(Coin other) {
		set.add(other);  	
	}
	/**
	 * Adds a set of coins
	 * @param other the coinset that is added
	 */
	public void addCoins(CoinSet other) {
		set.addAll(other.set);
	}
	/**
	 * removes all coins in coinset
	 */
	public void removeAllCoins( ) {
		set.clear();	 
	}
	
}