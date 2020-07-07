/**
 * The product class
 */
public class Product {
	private String description;
	private double price;
	/**
	 * Default constructor for product variables
	 */
	Product() {
		description = "NULL";
		price = 0.0;
	}
	/**
	 * Argument constructor that creates a product object
	 * @param des name of product
	 * @param prc price of product
	 */
	Product(String des, double prc) {
		this.setDescription(des);
		this.setPrice(prc);
	}
	/**
	 * Gets the name of product
	 * @return the name of the product
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Sets the name of the product
	 * @param des the name of the product
	 */
	public void setDescription(String des) {
		this.description = des;
	}
	/**
	 * Gets the price of the product
	 * @return the price of the product
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the price of the product
	 * @param prc the price of the product
	 */
	public void setPrice(double prc) {
		this.price = prc;
	}
	/**
	 * Formats the name and price of the product
	 */
	public String toString() {
		return description + " @  $" + price;
	}
	/**
	 * Compares product to another product 
	 * @param the product compared
	 * @return true if same, false if not
	 */
	public boolean equals(Object other) {
		if(this == other) {
			return true;
		}
		if(other == null) {
			return false;
		}
		if(getClass() != other.getClass()) {
			return false;
		}
		
		Product prod = (Product)other;
	    return description.equals(prod.description) && price == prod.price;
	}
}
