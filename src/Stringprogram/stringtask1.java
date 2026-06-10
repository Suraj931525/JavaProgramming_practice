package Stringprogram;

import java.util.StringTokenizer;

public class stringtask1 {

	public static void main(String[] args) {
		
		//string Litreal
		String name="Suraj";
		System.out.println(name);
		name.concat("Patil");
		System.out.println(name);
		
		String fullname=name.concat("Patil");
		System.out.println(fullname);
		
		
		// string object
		
		String name2=new String("rohit");
		System.out.println(name2);
		name2.concat("Patil");
		System.out.println(name2);
		String fullname2=name2.concat("Patil");
		System.out.println(fullname2);
		
		
		// String buffer    is mutable change in original value in variable
		
		StringBuffer name3=new StringBuffer("Radha");
		
		System.out.println(name3);
		name3.append(" Patil");

		System.out.println(name3);
		
		
		
		//String builder is mutable change and store new value in variable
		
		

		StringBuilder name4=new StringBuilder("pooja");
		
		System.out.println(name4);
		name4.append(" Patil");

		System.out.println(name4);
		
		
		
		
		//String Tokenizer

		StringTokenizer name5=new StringTokenizer("Abhi");
		
		System.out.println(name5);
		name4.append(" Patil");

		System.out.println(name5);
		
		
		
		
		


	}

}
