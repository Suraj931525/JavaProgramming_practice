package multithreading;



class racing1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("start racing");
			try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
		
	}
}

class score1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("score display");
			try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
		
	}
}


class finish1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("End racing");
			try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
		
	}
}



public class withthread  {

	public static void main(String[] args) {
		racing1 s1=new racing1();
		s1.start();
		
		score1 s2=new score1();
		s2.start();
		
		finish1 s3=new finish1();
		s3.start();
		
	}

}

