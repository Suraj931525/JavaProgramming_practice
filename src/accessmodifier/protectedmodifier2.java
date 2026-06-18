package accessmodifier;

class college33 {
	public void display() {
		System.out.println("protected modifier access child class");
	}
}
public class protectedmodifier2 extends college33{

	public static void main(String[] args) {
		college33 s1=new college33();
		s1.display();

	}

}
