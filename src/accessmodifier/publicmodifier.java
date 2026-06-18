package accessmodifier;




 class sample {
	 public void sample(){
		 System.out.println("this is public access modifier access in outside class");
	 }
	 public void display() {
		 System.out.println("this is public access modifier access in inside class");
	 }
	
}

public class publicmodifier {

	public static void main(String[] args) {
		sample s1=new sample();
		s1.sample();
		s1.display();
	}

}
