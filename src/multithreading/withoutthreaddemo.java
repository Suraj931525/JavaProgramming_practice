package multithreading;

class racing {
	public void startruning() {
		for(int i=1;i<=5;i++) {
			System.out.println("start racing");
		}
		
	}
}

class score{
	public void display() {
		for(int i=1;i<=5;i++) {
			System.out.println("score display");
		}
		
	}
}


class finish{
	public void stoprunning() {
		for(int i=1;i<=5;i++) {
			System.out.println("End racing");
		}
		
	}
}



public class withoutthreaddemo {

	public static void main(String[] args) {
		racing s1=new racing();
		s1.startruning();
		
		score s2=new score();
		s2.display();
		
		finish s3=new finish();
		s3.stoprunning();
		
	}

}
