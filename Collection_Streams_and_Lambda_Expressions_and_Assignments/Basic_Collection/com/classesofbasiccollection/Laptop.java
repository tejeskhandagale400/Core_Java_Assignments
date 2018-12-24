package com.classesofbasiccollection;

/**
 * Laptop class which contans details of  company, model, operatingSystem, processor
 * @author tkhandag
 *
 */
public class Laptop 
{
	private String company;
	private int model;
	private String operatingSystem;
	private String processor;
	
	/**
	 * Parameterized constructor
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param processor
	 */
	public Laptop(String company, int model, String operatingSystem, String processor)
	{	
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	/**
	 * Override method from set to set hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		return result;
	}

	/**
	 *   Override method from set to to check 2 objects are equal or not
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}
	/**
	 *  To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}
	
	

}
