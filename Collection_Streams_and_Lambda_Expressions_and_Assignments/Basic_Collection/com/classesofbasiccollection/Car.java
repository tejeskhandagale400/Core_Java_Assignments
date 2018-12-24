package com.classesofbasiccollection;

/**
 * class car  which contains make, model, year, price
 * @author tkhandag
 *
 */
public class Car implements Comparable<Car>
{
	private String make;
	
	/**
	 * Parameterized constructor
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, int year, double price) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	private String model;
	private int year;
	private double price;
	
	/**
	 * Override method from set to set hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	/**
	 * To set object by order on the basis of make	
	 */
	@Override
	public int compareTo(Car o) {
		
		return this.make.compareTo(o.make);
	}

}
