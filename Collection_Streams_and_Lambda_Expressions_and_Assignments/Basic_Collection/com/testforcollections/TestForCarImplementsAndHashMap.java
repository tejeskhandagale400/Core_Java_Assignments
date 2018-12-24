package com.testforcollections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Test;

import com.classesofbasiccollection.Car;
import com.classesofbasiccollection.Student;

public class TestForCarImplementsAndHashMap {
/**
 * Test for car to order it on the basis of make (company name)
 */
	@Test
	public void test() 
	{
		Car carOne = new Car("Maruti ", "Maruti 800", 2018, 650000);
		Car carTwo = new Car("Ferrari ", "Ferrari 001", 2018, 20000000);
		Car carThree = new Car("Honda ", "Honda City", 2018, 950000);
		
		TreeSet<Car> carSet = new TreeSet<Car>();
		carSet.add(new Car("Maruti ", "Maruti 800", 2018, 650000));
		carSet.add(new Car("Ferrari ", "Ferrari 001", 2018, 20000000));
		carSet.add(new Car("Honda ", "Honda City", 2018, 950000));
		carSet.add(new Car("Mahindra "," 800", 2018, 650000));
		carSet.add(new Car("Maruti ", "Maruti Alto", 2018, 650000));
		
		Iterator<Car> itr = carSet.iterator(); 
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}
	

	/**
	 * Test for simple map to store all of our class students names and their favorite fruits.
	 */
	@Test
	public void testForHashMap() 
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("Tejas", "Mango");
		map.put("Shubham", "Banana");
		map.put("Rohan", "Apple");
		map.put("Shubham2", "Pianapple");
		 
		/**
		 * Student names And There favourite fruit
		 */
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey());
		}
		
		/**
		 * Getting the value by giving key
		 */
			System.out.println(map.get("Tejas") );
			System.out.println(map.get("Shubham") );
			System.out.println(map.get("Rohan") );
			System.out.println(map.get("Shubham2") );
			 
	}

	
	

}
