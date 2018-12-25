package com.capgemini.carparkingdetails;

public class ParkedCarOwnerDetails 
{
	private String ownerName;
	private String carModel;
	private int carNO;
	private String ownerMobileNo;
	private String owerAddress; 
	
	public ParkedCarOwnerDetails(String ownerName, String carModel, int carNO, String ownerMobileNo, String owerAddress ) 
	{
		this.ownerName =  ownerName;
		this.carModel =  carModel;
		this.carNO =  carNO;
		this.ownerMobileNo  = ownerMobileNo;
		this.owerAddress =  owerAddress; 
	}

	public String getOwnerName() 
	{
		return ownerName;
	}

	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}

	public String getOwnerMobileNo() 
	{
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(String ownerMobileNo) 
	{
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwerAddress() 
	{
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) 
	{
		this.owerAddress = owerAddress;
	}

	public String getCarModel() 
	{
		return carModel;
	}

	public int getCarNO() 
	{
		return carNO;
	}

	@Override
	public String toString() {
		return "ParkedCarOwnerDetails [ownerName=" + ownerName + ", carModel="
				+ carModel + ", carNO=" + carNO + ", ownerMobileNo="
				+ ownerMobileNo + ", owerAddress=" + owerAddress + "]";
	}

}
