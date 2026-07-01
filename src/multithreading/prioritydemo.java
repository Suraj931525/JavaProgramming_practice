package multithreading;


class a extends Thread{
	public void run() {
		
		System.out.println("a class");
		System.out.println("child thread  priority"+Thread.currentThread().getPriority());
	}
	
}

public class prioritydemo{

	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		
		System.out.println("main method priority"+Thread.currentThread().getPriority());
		
		a s1=new a();
		s1.start();
	}

}
