package featureone;

public class TestMembership {

	public static void main(String[] args) {
		
		Membership dc = new Membership (100);
		dc.setMemberDiscount(15);
//		dc.member();
		dc.nonmember();
		System.out.println(dc.toString());
	}
	
}

