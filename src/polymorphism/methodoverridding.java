package polymorphism;


class college{
	void display() {
		System.out.println("hello");
	}
}
class student1 extends college{
	void display() {
		System.out.println("hi");
	}
}
public class methodoverridding {

	public static void main(String[] args) {
		student1  s1=new student1();
		s1.display();
	}

}
