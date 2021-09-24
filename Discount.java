package featureone;

public class Discount {

	private int productId;
	private double price;
	private double percentageDiscount;
	
	Discount(){
		productId = 0;
		price = 0;
		percentageDiscount = 0;
	}
	
	Discount(int newProductId, double newPrice){
		productId = newProductId;
		price = newPrice;
	}
	
	public void setProductId(int newProductId) {
		productId = newProductId;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setPercentageDiscount(double newPercentageDiscount) {
		percentageDiscount = newPercentageDiscount;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	
	public double getDiscountedPrice() {
		return (price - ((percentageDiscount/100) * price));
	}
	testing
}
