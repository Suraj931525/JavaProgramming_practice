package accessmodifier;

class demo{
	 private void sample(){
		 System.out.println("this is public access modifier access in outside class");
	 }
	 private void display() {
		 System.out.println("this is public access modifier access in inside class");
	 }
	
}

public class privatemodifier1 {
	public static void main(String[] args) {
		demo s1=new demo();
//		s1.sample();
//		s1.display();  //  private access modifier is not access outside class
	}

}
