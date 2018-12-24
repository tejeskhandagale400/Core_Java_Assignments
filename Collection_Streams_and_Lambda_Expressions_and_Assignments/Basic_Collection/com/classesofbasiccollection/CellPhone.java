package com.classesofbasiccollection;

/**
 * Class cellPhone which contains company, model, description, operatingSstem, price
 * @author tkhandag
 *
 */
public class CellPhone 
{
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;

	/**
	 * Parameterized constructor
	 * @param company
	 * @param model
	 * @param description
	 * @param operatingSystem
	 * @param price
	 */
	public CellPhone(String company, String model, String description, String operatingSystem, double price)
	{
		this.company =  company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
		
	}

	/**
	 * Override method from set to set hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}

	/**
	 *  To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}

}
