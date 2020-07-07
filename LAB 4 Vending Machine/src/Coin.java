/**
 * Coin class
 *
 */
public class Coin {
	private double worth;
	private String name;
/**
 * Constructs coin	
 * @param val the worth of the coin
 * @param nam the name of the coin
 */
	Coin(double val, String nam) {
		this.setValue(val);
		this.setName(nam);
	}
	/**
	 * Gets the worth of the coin
	 * @return worth of coin
	 */
	public double getWorth() {
		return worth;
	}
	/**
	 * Sets the worth of the coin
	 * @param val the worth of the coin
	 */
	public void setValue(double val) {
		this.worth = val;
	}
	/**
	 * Gets the name of the coin
	 * @return the name of the coin
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the coin
	 * @param nam the name of the coin
	 */
	public void setName(String nam) {
		this.name = nam;
	}
	/**
	 * Formats the coin name and worth	
	 */
	public String toString() {
		return name + " @" + worth; 
	}
}