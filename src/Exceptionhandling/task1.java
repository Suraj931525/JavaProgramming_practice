package Exceptionhandling;

public class task1 {

	public static void main(String[] args) {
		int a=15;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch( ArithmeticException e) {
			System.out.println("cannot divided by zero");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.out.println(e.getLocalizedMessage());



			
		}
		
		System.out.println("hello");
	}

}
