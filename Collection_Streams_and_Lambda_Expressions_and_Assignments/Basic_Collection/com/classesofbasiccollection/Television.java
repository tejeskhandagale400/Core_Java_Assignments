package com.classesofbasiccollection;
/**
 * Television  Class which contains company, type (LCD, LED, Plasma), 3D enabled, price
 * @author tkhandag
 *
 */
public class Television
{
	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;
	
	/**
	 * Parameterized constructor for class Television
	 * @param company
	 * @param type
	 * @param threeDEnabled
	 * @param price
	 */
	public Television(String company, String type, boolean threeDEnabled, double price)
	{
		this.company = company;
		this.type = type;
		this.price = price;
		this.threeDEnabled = threeDEnabled;
		
	}

	/**
	 *  Override method from set to set hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/**
	 *  To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}

}
