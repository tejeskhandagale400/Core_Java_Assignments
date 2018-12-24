package com.testforcollections;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import org.junit.Test;

import com.classesofbasiccollection.Car;
import com.classesofbasiccollection.CellPhone;
import com.classesofbasiccollection.Laptop;
import com.classesofbasiccollection.School;
import com.classesofbasiccollection.Television;

public class testForBasicCollectionUsingArrayList {

	/**
	 * Test for Array List for Laptop ,Car , Television , CellPhone ,School
	 */
	@Test
	public void testUsingArrayList() 
	{
		Laptop laptopOne = new Laptop("Dell" ,3000 ,"Windows 10" , 	"Intel i3");	//Creating Objects for laptop
		Laptop laptopTwo = new Laptop("HP" ,2520 ,"Windows 10" , 	"Intel i5");
		Laptop laptopThree = new Laptop("Acer" ,3100 ,"Windows 8" , "Intel i5");

		Car carOne = new Car("Maruti ", "Maruti 800", 2018, 650000);	//Creating Objects for Car
		Car carTwo = new Car("Ferrari ", "Ferrari 001", 2018, 20000000);
		Car carThree = new Car("Honda ", "Honda City", 2018, 950000);

		Television  televisionOne = new Television("Sony", "LED", true, 50000);		//Creating Objects for Television
		Television  televisionTwo = new Television("Onida", "LCD", false, 25000);
		Television  televisionThree = new Television("Samsung", "LED", true, 40000);
		
		CellPhone   cellPhoneOne = new CellPhone("Samsung", "Galaxy Grand Prime ", "1.2 GHZ processor with 8mp rear Camera", "Android", 10000);
		CellPhone   cellPhoneTwo = new CellPhone("MI", "Redmi note 5 pro", "1.8 GHZ processor with 13 + 2mp rear Camera", "Android", 15000);
		CellPhone   cellPhoneThree = new CellPhone("Asus", "Zenfone 5 ", "1.8 GHZ processor with 16mp Camera", "Android", 14000);
		
		School schoolOne = new School("G. B. Vader High School", "pali", "Raigad", 20);		//Creating Objects for School
		School schoolTwo = new School("High School Of Pune", "Pune", "Pune", 5);
		School schoolThree = new School("High School of Alibaug", "Alibaug", "Raigad", 6);
		
		/**
		 * Adding the objects in collection using Arraylist 
		 */
		ArrayList<Laptop> laptopList =  new ArrayList<Laptop>();
		laptopList.add(laptopOne);
		laptopList.add(laptopTwo);
		laptopList.add(laptopThree);
		
		ArrayList<Car> carList =  new ArrayList<>();
		carList.add(carOne);
		carList.add(carTwo);
		carList.add(carThree);
		
		ArrayList<Television> televisionList =  new ArrayList();
		televisionList.add(televisionOne);
		televisionList.add(televisionTwo);
		televisionList.add(televisionThree);
		
		ArrayList<CellPhone> cellPhoeList =  new ArrayList();
		cellPhoeList.add(cellPhoneOne);
		cellPhoeList.add(cellPhoneTwo);
		cellPhoeList.add(cellPhoneThree);
		
		ArrayList<School> schoolList =  new ArrayList();
		schoolList.add(schoolOne);
		schoolList.add(schoolTwo);
		schoolList.add(schoolThree);
		
		for(int count = 0 ; count<laptopList.size() ; count++)
		System.out.println(laptopList.get(count));

		for(int count = 0 ; count<carList.size() ; count++)
		System.out.println(carList.get(count));
		
		for(int count = 0 ; count<televisionList.size() ; count++)
			System.out.println(televisionList.get(count));
		
		for(int count = 0 ; count<cellPhoeList.size() ; count++)
			System.out.println(cellPhoeList.get(count));
		
		for(int count = 0 ; count<schoolList.size() ; count++)
			System.out.println(schoolList.get(count));
		
	}

}
