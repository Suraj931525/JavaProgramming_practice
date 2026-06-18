package accessmodifier;

class demo2 {
	 protected void sample(){
		 System.out.println("this is public access modifier access in outside class");
	 }
	 protected void display() {
		 System.out.println("this is public access modifier access in inside class");
	 }
	
}

public class protectedmodifier {

	public static void main(String[] args) {
		demo2 s1=new demo2();
		s1.sample();
		s1.display();

	}

}
