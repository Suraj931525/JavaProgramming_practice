package superkeyword;
class a{
	
	a(){
		System.out.println("green");
	}
	
}
class b extends a{
	

	b(){
		super();
		System.out.println("red");
	}
}
public class superconstructor {

	public static void main(String[] args) {
		new b();
	}

}
