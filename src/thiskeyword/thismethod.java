package thiskeyword;



class emp{
	void display() {
		this.get(100);
		System.out.println("this is display method");
	}
	void get(int x) {
		System.out.println("this is get method"+ x);
	}
	
}
public class thismethod {

	public static void main(String[] args) {
		emp s1=new emp();
		s1.display();

	}

}
