package collectionprogram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
LinkedList a=new LinkedList();
		
		a.add(12);
		a.add("suraj");
		a.add(true);
		
		ListIterator li =a.listIterator();

		while(li.hasNext()){
			System.out.println(li.next());

	}
		System.out.println("-------backward");

		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
}
