package Stringprogram;

class object{}


public class stringbuffer  {

	public static void main(String[] args) {
		
		
//		StringBuffer b1=new StringBuffer("suraj");
//		System.out.println(b1.length()); //5
//		System.out.println(b1.capacity());   // 21
		
//		
//		StringBuffer b1=new StringBuffer();
//		b1.append("suraj");
//		System.out.println(b1.length());   //5
//		System.out.println(b1.capacity());   // 16
//		
		
// 		StringBuffer b1=new StringBuffer();
//		b1.append("surajpatilkarolimsurajpatilkarolim ");
//		System.out.println(b1.length());
//		System.out.println(b1.capacity());   
//		
//		
		
//		StringBuffer name1=new StringBuffer("Suraj");
//		StringBuffer name2=new StringBuffer("Suraj");
//		
//		System.out.println(name1.equals(name2));
		
		
		// find index in second char in string
		
		StringBuffer b1=new StringBuffer("surajpatil");
		
		int firstE=b1.indexOf("a");
		int secondE=b1.indexOf("a" ,firstE +1);
		System.out.println("Second e index = " + secondE);
		
		
		

	}

}
