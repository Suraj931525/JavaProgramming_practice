package accessmodifier;

class student{
	private void studentname() {
		System.out.println("my name suraj");
	}
	 void name1 () {
		student s1=new student();
		s1.studentname();  //private access inside the class
		
	}
}

public class privatemodifier2 {

	public static void main(String[] args) {
		student s1=new student();
		s1.name1();
		

	}

}
