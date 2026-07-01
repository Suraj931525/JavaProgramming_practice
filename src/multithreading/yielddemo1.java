package multithreading;
class ab extends Thread{
	public void run() {
		Thread.yield();
	for(int i=0;i<=5;i++) {
		System.out.println("child method");
	}
	}
}

public class yielddemo1 {

	public static void main(String[] args) {
		
		ab s1=new ab();
		s1.start();
		for(int j=0;j<=5;j++) {
			System.out.println("main method");
		}
	}

}

