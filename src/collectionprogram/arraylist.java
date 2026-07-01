package collectionprogram;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList b1=new ArrayList();
		b1.add(23);
		
		a1.add(0);
		a1.add("suraj");
		a1.add(null);
		a1.add(23);
		a1.add(2.3);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(2));
		System.out.println(a1.contains(0));
		System.out.println(a1.addAll(b1));
		System.out.println(a1);
		
		
		
		
		// iteration 
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
	}

}
