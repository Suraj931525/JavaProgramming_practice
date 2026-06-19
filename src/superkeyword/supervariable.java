package superkeyword;


	class Animal {
	    String color = "White";
	}

	class Dog extends Animal {
	    String color = "Black";

	    void display() {
	        System.out.println(color);       // Child variable
	        System.out.println(super.color); // Parent variable
	    }
	}

	public class supervariable {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.display();
	    }
	}

