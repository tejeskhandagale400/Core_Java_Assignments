package com.capgemini.carparkingdetails;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkedCarOwenerList 
{
	private HashMap<Integer,ArrayList<ParkedCarOwnerDetails>> carParkedList = new HashMap<Integer,ArrayList<ParkedCarOwnerDetails>>();    
	private  HashMap<ArrayList<ParkedCarOwnerDetails>,Integer> temporary = new HashMap<ArrayList<ParkedCarOwnerDetails>,Integer>();    

	private static int token ;
	 
	public void addNewCar(ParkedCarOwnerDetails carOwenerDetails)
	{	
		if(token < 240 )
		{
		ArrayList<ParkedCarOwnerDetails> carList = new ArrayList<ParkedCarOwnerDetails>();
		carList.add(carOwenerDetails);
		carParkedList.put(token, carList);
		temporary.put(carList, token);
		token++;
		}
		else
		{
			System.out.println("Parking is Full");
		}
	}

	@Override
	public String toString() 
	{
		return "ParkedCarOwenerList [carParkedList=" + carParkedList + "]";
	}

	public void removeNewCar(ParkedCarOwnerDetails car ) 
	{
		ArrayList<ParkedCarOwnerDetails> carToRemove = new ArrayList<ParkedCarOwnerDetails>();		
		carToRemove.add(car ); 						//storing the given object into array list	
 		System.out.println(token);	
 		token = temporary.get(carToRemove);					//Getting the token of a particular car by passing value
 		carParkedList.remove(token);
 		System.out.println(carParkedList);
	}

	public String getparkedcarlocation(int tokenToFindLocation)
	{
		String location = null;
		if(tokenToFindLocation <80)
		{
			 location = tokenToFindLocation < 20 ? "Car is at First floor First Section " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation >= 20 && tokenToFindLocation< 40 ? "Car is at First floor Second Section at position " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation >= 40 && tokenToFindLocation< 60 ? "Car is at First floor Third Section at position " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation >= 60 && tokenToFindLocation< 80 ? "Car is at First floor Fourth Section at position " +tokenToFindLocation+" number" :null;
			 
		}
		
		else if( tokenToFindLocation >= 80 &&  tokenToFindLocation <= 159)
		{
			 location = tokenToFindLocation < 100 ? "Car is at Second floor First Section " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation < 100 ? "Car is at Second floor First Section " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation < 100 ? "Car is at Second floor First Section " +tokenToFindLocation+" number" :null;
			 location = tokenToFindLocation < 100 ? "Car is at Second floor First Section " +tokenToFindLocation+" number" :null;
					
		}
		
		else if( tokenToFindLocation >= 80 &&  tokenToFindLocation <= 159)
		{
			
		}0
		
		else if( tokenToFindLocation >= 160 &&  tokenToFindLocation <= 239)
		{
			
		}
 		return location;
	} 
	
}
