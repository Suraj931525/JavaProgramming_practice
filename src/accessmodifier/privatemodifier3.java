package accessmodifier;


class college11{
	private void display() {
		System.out.println("pvpit budhgaon");
	}
}
public class privatemodifier3 extends college {

	public static void main(String[] args) {
		college11 s1=new college11();
//		s1.display();  // child class not access the the private method

	}

}
