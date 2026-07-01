package multithreading;

	
	class MyRunnable implements Runnable {

	    public void run() {
	        System.out.println("Child Thread Executing...");
	    }
	}

	public class runnabledemo {
	    public static void main(String[] args) {

	        MyRunnable r = new MyRunnable();

	        Thread t = new Thread(r);

	        t.start();

	        System.out.println("Main Thread Executing...");
	    }
	}


