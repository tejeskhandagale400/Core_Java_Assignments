package com.testforcollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.classesofbasiccollection.Car;
import com.classesofbasiccollection.CellPhone;
import com.classesofbasiccollection.Laptop;
import com.classesofbasiccollection.School;
import com.classesofbasiccollection.Television;

public class TestOfCollectionUsingSet {

	@Test
	public void testUsingSet() 
	{
		Laptop laptopOne = new Laptop("Dell" ,3000 ,"Windows 10" , 	"Intel i3");
		Laptop laptopTwo = new Laptop("HP" ,2520 ,"Windows 10" , 	"Intel i5");
		Laptop laptopThree = new Laptop("Dell" ,3000 ,"Windows 8" , "Intel i5");

		Car carOne = new Car("Maruti", "Maruti 800", 2018, 650000);
		Car carTwo = new Car("Ferrari", "Ferrari 001", 2018, 20000000);
		Car carThree = new Car("Maruti", "Maruti 800", 2018, 950000);

		Television  televisionOne = new Television("Sony", "LED", true, 50000);
		Television  televisionTwo = new Television("Onida", "LCD", false, 25000);
		Television  televisionThree = new Television("Sony", "LED", true, 50000);
		
		CellPhone   cellPhoneOne = new CellPhone("Samsung", "Galaxy Grand Prime ", "1.2 GHZ processor with 8mp rear Camera", "Android", 10000);
		CellPhone   cellPhoneTwo = new CellPhone("MI", "Redmi note 5 pro", "1.8 GHZ processor with 13 + 2mp rear Camera", "Android", 15000);
		CellPhone   cellPhoneThree = new CellPhone("MI", "Redmi note 5 pro ", "1.8 GHZ processor with 13 + 2mp rear Camera", "Android", 15000);
		
		School schoolOne = new School("G. B. Vader High School", "pali", "Raigad", 20);
		School schoolTwo = new School("High School Of pen", "Pen", "Raigad", 5);
		School schoolThree = new School("High School of pen", "Pen", "Raigad", 6);
		


		Set<Laptop> laptopList = new HashSet<Laptop>();  
		laptopList.add(laptopOne);
		laptopList.add(laptopTwo);
		laptopList.add(laptopThree);
		
		Set<Car> carList = new HashSet<Car>();  
		carList.add(carOne);
		carList.add(carTwo);
		carList.add(carThree);
		
		Set<Television> televisionList = new HashSet<Television>();  
		televisionList.add(televisionOne);
		televisionList.add(televisionTwo);
		televisionList.add(televisionThree);
		
		Set<CellPhone> cellPhoeList = new HashSet<CellPhone>();  
		cellPhoeList.add(cellPhoneOne);
		cellPhoeList.add(cellPhoneTwo);
		cellPhoeList.add(cellPhoneThree);
		
		Set<School> schoolList = new HashSet<School>();  
		schoolList.add(schoolOne);
		schoolList.add(schoolTwo);
		schoolList.add(schoolThree);
		
		System.out.println(laptopList);
		System.out.println(carList);
		System.out.println(televisionList);
		System.out.println(cellPhoeList.toString());
		System.out.println(schoolList.toString());
		
	}

}
