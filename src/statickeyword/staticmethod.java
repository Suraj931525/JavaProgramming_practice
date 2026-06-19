package statickeyword;
//
//class test{
//	static void emp() {
//		
//		System.out.println("static method");
//	}
//	
//	void get() {
//		System.out.println("i am non static method");
//	}
//}
//
//public class staticmethod {
//
//	public static void main(String[] args) {
//		test.emp();  // call static methods without creting object of class
//		test s1=new test();
//		s1.get();     // call non static method need to create the object of class
//	}
//
//}

class test{
	
	static int x=10;
	static void emp() {
		System.out.println(x);  // static variable call in static method but non static variable not call in the static method
//		get();  static method not call nono static method
		System.out.println("static method");
	}
	
	void get() {
		emp();                       // non static method call static method
		System.out.println("i am non static method");
	}
}

public class staticmethod {

	public static void main(String[] args) {
		
		test s1=new test();
		s1.get();     // call non static method need to create the object of class
	}

}
