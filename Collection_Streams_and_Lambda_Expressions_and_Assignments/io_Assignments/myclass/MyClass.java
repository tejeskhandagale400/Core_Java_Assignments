package com.capgemeni.myclass;

import java.io.Serializable;

/**
 * 
 * @author tkhandag
 *
 */
public class MyClass implements Serializable
{
	/**
	 * Declaration of instance members
	 */
	private String name;
	private int rollNumber;
	private int age;
	
	/**
	 * parameterized constructor
	 * @param name
	 * @param rollNumber
	 * @param age
	 */
	public MyClass(String name, int rollNumber, int age) 
	{
			 this.name = name;
			 this.age = age;
			 this.rollNumber = rollNumber;
	}
	
	/**
	 * To string method to get details
	 */
	@Override
	public String toString() 
	{
		return "MyClass [name=" + name + ", rollNumber=" + rollNumber
				+ ", age=" + age + "]";
	}

}
