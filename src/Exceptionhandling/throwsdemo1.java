package Exceptionhandling;

class ritesh{
	void get(int x,int y) throws ArithmeticException {
		int z=x/y;
		System.out.println(z);
	}
}

public class throwsdemo1 {

	public static void main(String[] args) {
		ritesh s1=new ritesh();
		try {
			s1.get(20, 0);
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide zero");
		}
		

	}

}
