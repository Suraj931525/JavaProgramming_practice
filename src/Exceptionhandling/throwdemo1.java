package Exceptionhandling;


class balancekhatamexception extends RuntimeException{
	public balancekhatamexception(String message) {
		super(message);
	}
}


	class bank1{
		int amount=10000;
		void withdrawn(int x) {
			if(amount>x) {
				int avlbal=amount-x;
				System.out.println("Trasaction successful");
				System.out.println("Available balance ::"+avlbal);
			}
//			else {
//				System.out.println("trasaction fail");
//			}
			else {
				throw new balancekhatamexception("Insufficient Balance"); 
			}
			System.out.println("continue your shopping");
		}
	}
	public class throwdemo1 {

		public static void main(String[] args) {
			bank1 s1=new bank1();
			s1.withdrawn(20000);
			System.out.println("continue your shopping");
			
		}
		
	}
			
			
			

		
