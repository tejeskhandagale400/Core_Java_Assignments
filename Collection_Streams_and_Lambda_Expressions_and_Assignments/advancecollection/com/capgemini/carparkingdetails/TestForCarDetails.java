package com.capgemini.carparkingdetails;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForCarDetails 
{

	@Test
	public void test() 
	{
		ParkedCarOwnerDetails  carOne = new ParkedCarOwnerDetails("Tejas" , "Lamborgini" ,2022 ,"7276483145" ,"At post - pali");
		ParkedCarOwnerDetails  carTwo = new ParkedCarOwnerDetails("Shubham" , "nano" ,2021 ,"7276483145" ,"At post - Rajstan");
		
		ParkedCarOwenerList parkedList = new  ParkedCarOwenerList();
		parkedList.addNewCar(carOne);
		parkedList.addNewCar(carTwo);
		//System.out.println(parkedList);
	//	parkedList.removeNewCar(carTwo);
		  
		System.out.println(parkedList.getparkedcarlocation(1));
		//String location = parkedList.getparkedcarlocation(0);
  	}

}
