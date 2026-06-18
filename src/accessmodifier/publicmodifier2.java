package accessmodifier;


class college {
	public void display() {
		System.out.println("public modifier access child class");
	}
}
public class publicmodifier2 extends college {

	public static void main(String[] args) {
		publicmodifier2 s1=new publicmodifier2();
		s1.display();

	}

}
