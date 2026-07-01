package collectionprogram;
import java.util.*;

public class iteratordemo {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		
		a.add(12);
		a.add("suraj");
		a.add(true);
		
		Iterator i=a.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}

}
