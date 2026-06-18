package accessmodifier;



class emp {
	public void sample() {
		System.out.println("this is done the inside class");
	}
	public void display() {
		emp s1=new emp();
		s1.sample();
	}
}
public class publicmodifier1 {

	public static void main(String[] args) {
		emp s1=new emp();
		s1.display();
		

	}

}
