package oppsprogram;



class animal{
	
	int age;
	String name;
	void eating() {
		System.out.println("this is animal is eating");
	}
	void sleeping() {
		System.out.println("this animal is sleeping");
	}
	void running() {
		System.out.println("animal running");
	}
}

public class classobject {

	public static void main(String[] args) {
		animal tiger=new animal();
		tiger.name="sheru";
		tiger.age=12;
		System.out.println(tiger.name);
		System.out.println(tiger.age);
	    tiger.eating();
	    tiger.sleeping();
	    tiger.running();
		
		
	}

}
