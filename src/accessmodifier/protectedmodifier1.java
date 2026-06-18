package accessmodifier;

class emp2 {
	public void sample() {
		System.out.println("protected modifier  is done the inside class");
	}
	public void display() {
		emp2 s1=new emp2();
		s1.sample();
	}
}
public class protectedmodifier1 {

	public static void main(String[] args) {
		emp2 s1=new emp2();
		s1.display();
	}

}
