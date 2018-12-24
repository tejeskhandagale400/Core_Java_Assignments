package com.classesofbasiccollection;

public class Student implements Comparable<Student>
{
	private String name;
	
	public Student(String name)
	{
		this.name = name;
		
	}
	
	/**
	 *  To string method to get the parameters of object in one string and display it
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}

}
