package thiskeyword;

public class thisconstructor {
	
	thisconstructor(){
		this(10);
		System.out.println("this is default constructor");
		
	
	}
	thisconstructor(int x){
		
		System.out.println("this is parameterized constructor"+x);
	}
	public static void main(String [] args) {
		new thisconstructor();
		
	}


}