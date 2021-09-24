
public class TestApp {

	public static void main(String[] args) {
		//FOR CUSTOMER WITH MEMBERSHIP
		Registration c1 = new Registration(1, "Syafiq", "Syafiq123", "Member");
		Bank c1BankAcc = new Bank(1001, 10000);
		
		System.out.println("\n               Account Details");
		System.out.println("------------------------------------------------");
		System.out.println(c1.toString());
		System.out.println("Bank Account ID: " + c1BankAcc.getId());
		System.out.printf("Balance: $%.2f\n", c1BankAcc.getBalance());
		
		
		System.out.println("\n                Shopping Cart");
		System.out.println("------------------------------------------------");
		Item c1i1 = new Item(3,"Beans",2, 100.0);
	    Item c1i2 = new Item(2, "Cheese",4, 50.0);
	    Item c1i3 = new Item(1, "Bread",1, 75.0);
	    
	    ShoppingCart c1cart = new ShoppingCart();
	    c1cart.addToCart(c1i1);
	    c1cart.addToCart(c1i2);
		c1cart.addToCart(c1i3);
		c1cart.showCart();		
		
//		cart.printInvoice();
		System.out.println("Total amount: $" + c1cart.getTotalAmount());
		
		System.out.println();
		
		Membership member1 = new Membership (c1cart.getTotalAmount());
		member1.setMemberDiscount(15);
		member1.member();
		System.out.println("15% Membership discount");
		System.out.println(member1.toString());
		
		System.out.println("\n                Payment Successful");
		System.out.println("------------------------------------------------");
		System.out.printf("Account Card Balance: $%.2f\n", (c1BankAcc.getBalance() - member1.getDiscountedPrice()));	
		System.out.println("------------------------------------------------");
		
		
		System.out.println();
		//FOR CUSTOMER THAT HAS NO MEMBERSHIP
		Registration c2 = new Registration(2, "Amy", "Amy123", "Non-Member");
		Bank c2BankAcc = new Bank(1002, 50000);
		
		System.out.println("\n               Account Details");
		System.out.println("------------------------------------------------");
		System.out.println(c2.toString());
		System.out.println("Bank Account ID: " + c2BankAcc.getId());
		System.out.printf("Balance: $%.2f\n", c2BankAcc.getBalance());
		
		System.out.println("\n                Shopping Cart");
		System.out.println("------------------------------------------------");
		Item c2i1 = new Item(1,"Banana",4, 100.0);
	    Item c2i2 = new Item(2, "Soda",4, 50.0);
	    Item c2i3 = new Item(3, "Apple",5, 75.0);
	    
	    ShoppingCart c2cart = new ShoppingCart();
	    c2cart.addToCart(c2i1);
	    c2cart.addToCart(c2i2);
		c2cart.addToCart(c2i3);
		c2cart.showCart();
		
		c2cart.removeFromCart(c2i3);
		c2cart.showCart();
		
		Membership member2 = new Membership (c2cart.getTotalAmount());
		member2.nonmember();
		System.out.println(member2.toString());
		
		System.out.println("\n                Payment Successful");
		System.out.println("------------------------------------------------");
		System.out.printf("Account Card Balance: $%.2f\n", (c2BankAcc.getBalance() - member2.getDiscountedPrice()));	
		System.out.println("------------------------------------------------");
		System.out.println();
		
	}
}
