package encapsulation;


class SBIBank{
	private int amount=50000;
	
	void withdrawn(int x) {
		if(amount>x) {
			amount=amount-x;
			System.out.println("Withdrawn succssful");
			System.out.println("Available balance is: "+amount);
		}
		else {
			System.out.println("insufficient balance");
			System.out.println("Available balance is: "+amount);
		}
	}
}
public class demo {

	public static void main(String[] args) {
		SBIBank s1=new SBIBank();
		s1.withdrawn(20000);

	}

}
