package testaccessmodifier;
import accessmodifier.protectedmodifier3;
public class test1 extends protectedmodifier3  {

//	public static void main(String[] args) {
//		protectedmodifier3 s1=new protectedmodifier3();
//		s1.display();   // not access directly in other package
//
//	}
	public static void main(String[] args) {
		test1 s1=new test1();
		s1.display();

	}

}
