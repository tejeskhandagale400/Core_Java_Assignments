package com.classesofbasiccollection;

/**
 * Class School which contains name, city, school district, greatSchoolRanking
 * @author tkhandag
 *
 */
public class School 
{
	private String name;
	private String city;
	private String district;
	private int greatSchoolRanking;
	
	/**
	 * Paremeterized constructor 
	 * @param name
	 * @param city
	 * @param district
	 * @param greatSchoolRanking
	 */
	public School(String name, String city, String district, int greatSchoolRanking)
	{
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
		
	}

	/**
	 * Override method from set to set hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		return result;
	}

	/**
	 * Override method from set to to check 2 objects are equal or not
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		return true;
	}

	/**
	 *  To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", greatSchoolRanking="
				+ greatSchoolRanking + "]";
	}

}
