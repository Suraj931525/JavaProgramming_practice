package multithreading;

class MyThread extends Thread {

    public void run() {
        System.out.println("Child Thread Executing...");
    }
}


public class threadclassdemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();

        t.start();

        System.out.println("Main Thread Executing...");

	}

}
