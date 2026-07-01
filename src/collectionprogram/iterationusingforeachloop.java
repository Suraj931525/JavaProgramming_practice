package collectionprogram;
import java.util.*;

public class iterationusingforeachloop {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Suraj");
		a.add("patil");
		a.add(45);
		
		for (Object obj : a) {
            System.out.println(obj);
        }
	}

}
