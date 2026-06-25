package Exceptionhandling;

public class demo2 {
public static void main(String[]args) {
	int a[]= {12,23,56,89,7,0,3};	
	try {
	int c=a[0]/a[5];
	
	System.out.println(c);
	}
	
//	catch(ArithmeticException e) {
//		System.out.println("cannot divide by zero");
//		
//	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Array Index");
	}
	catch(Exception e) {
		System.out.println("parent of all exception");
	}
	try{
		System.out.println(a[8]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Array Index");
	}
	
}
}
