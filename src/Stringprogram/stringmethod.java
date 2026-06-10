package Stringprogram;

public class stringmethod {

	public static void main(String[] args) {
		
		
		// == method
		
		String name1="suraj";
		String name2="suraj";
		String name3=new String("suraj");
		String name4=new String("suraj");
		
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		System.out.println(name1==name3);
		System.out.println(name2==name4);
		
		// Object.equals() method
		
				System.out.println("\nObject.equals() Method");
				
				Object obj1 = new Object();
				Object obj2 = new Object();
				Object obj3 = obj1;
				
				System.out.println(obj1.equals(obj2));
				System.out.println(obj1.equals(obj3));
				
				
				
				
				
				
				
				
				
				System.out.println("-------------------------");
				
				
				String name5="suraj";
				String name6="patil";
				String name7=new String("suraj");
				String name8=new String("patil");
				
				System.out.println(name5.equals(name6));
				System.out.println(name5.equals(name7));
				System.out.println(name5.equals(name8));
				System.out.println(name5.equals(name6));
				System.out.println(name7.equals(name8));
				System.out.println(name6.equals(name8));
				
		
	}

}
