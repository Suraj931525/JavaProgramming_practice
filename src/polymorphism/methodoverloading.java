package polymorphism;

class student{
//	// method same parameter different
//	void display() {
//		
//		
//		System.out.println("hello");
//	}
//	void display(int x) {
//		System.out.println("hi");
//	}
//}
	
	
	// parameter same datatype different
//	void display(int a) {
//		System.out.println("hello");
//	}
//	void display(float a) {
//		System.out.println("hi");
//	}
//}
	
	// sequence of data type should be different
	void display(int a ,float b) {
		System.out.println("hello");
	}
	void display(float b ,int a) {
		System.out.println("hi");
	}
}


public class methodoverloading {

	public static void main(String[] args) {
		student s1=new student();
		s1.display(10,2.5f);
		s1.display(5.5f,5);
		
	}

}
