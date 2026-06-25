package Exceptionhandling;




class bank{
	int amount=10000;
	void withdrawn(int x) {
		if(amount>x) {
			int avlbal=amount-x;
			System.out.println("Trasaction successful");
			System.out.println("Available balance ::"+avlbal);
		}
//		else {
//			System.out.println("trasaction fail");
//		}
		else {
			throw new ArithmeticException("Insufficient Balance"); 
		}
		System.out.println("continue your shopping");
	}
}
public class throwdemo {

	public static void main(String[] args) {
		bank s1=new bank();
		s1.withdrawn(20000);
		
		
		

	}

}
