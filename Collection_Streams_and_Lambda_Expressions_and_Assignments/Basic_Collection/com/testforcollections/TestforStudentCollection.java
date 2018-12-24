package com.testforcollections;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.Test;

import com.classesofbasiccollection.Student;

public class TestforStudentCollection {
	/**
	 * Student list using ArrayList it It adds duplicates and maintance insertion order 
	 */
	@Test
	public void testOfStudentUsingArrayList() 
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add( new Student("Tejas"));
		studentList.add( new Student("Shubham"));
		studentList.add( new Student("Rohan"));
		studentList.add( new Student("Rushar"));
		studentList.add( new Student("Shubham"));
		studentList.add( new Student("Akash"));
		studentList.add( new Student("Deepika"));
		studentList.add( new Student("Ankita"));
		studentList.add( new Student("Ujwala"));
		studentList.add( new Student("Mrudula"));
		studentList.add( new Student("Banu"));

		Iterator<Student> itr=studentList.iterator(); 
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
				
		

	}
	
	/**
	 * testOfStudent Using Lisked List
	 */
	@Test
	public void testOfCollectionUsingLinkedList() 
	{		
		LinkedList<Student> list2 = new LinkedList(); 
		list2.add( new Student("Tejas"));
		list2.add( new Student("Shubham"));
		list2.add( new Student("Rohan"));
		list2.add( new Student("Rushar"));
		list2.add( new Student("Shubham"));
		list2.add( new Student("Akash"));
		list2.add( new Student("Deepika"));
		list2.add( new Student("Ankita"));
		list2.add( new Student("Ujwala"));
		list2.add( new Student("Mrudula"));
		list2.add( new Student("Banu"));
		
		System.out.println(" use of Linked List");
		Iterator<Student> itr2 = list2.iterator(); 
		while(itr2.hasNext())
		{
		System.out.println(itr2.next());
		}
	}

	/**
	 * Test of Studen using Tree set
	 */
	@Test
	public void testOfCollectionUsingTreeSet() 
	{		
		TreeSet<Student> set=new TreeSet<Student>();  
		set.add(new Student("Tejas"));
		set.add(new Student("Shubham"));
		set.add(new Student("Rohan"));
		set.add(new Student("Rushar"));
		set.add(new Student("Shubham"));
		set.add(new Student("Akash"));
		set.add(new Student("Deepika"));
		set.add(new Student("Ankita"));
		set.add(new Student("Ujwala"));
		set.add(new Student("Mrudula"));
		set.add(new Student("Banu"));
		
		System.out.println(" use of Tree set");
		Iterator<Student> itr3 = set.iterator(); 
		while(itr3.hasNext())
		{
		System.out.println(itr3.next());
		}

	}
	

}
