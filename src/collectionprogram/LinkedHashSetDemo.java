package collectionprogram;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
      LinkedHashSet a1=new LinkedHashSet();
		
		a1.add("suraj");
		a1.add(23);
		a1.add(null);
		a1.add(true);
		a1.add(null);  // only one null is allowed
		
		
		Iterator s= a1.iterator();
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
