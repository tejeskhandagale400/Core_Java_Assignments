
public class CalculateDiscount {

	public int calculationOfDiscount(int newPrice, int discountPercentage) {
		
		int discount = (newPrice * discountPercentage)/100;
		int newItemPrice = newPrice-discount;
		System.out.println(newItemPrice);
		return newItemPrice;
	}

}
