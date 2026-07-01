package multithreading;

public class sleepdemo1 {

	public static void main(String[] args)throws InterruptedException {
		int sec;
		int min=0;
		
		for(sec=1;sec<=60;sec++) {
			Thread.sleep(1000);
			System.out.println(sec);
			if(sec==60) {
				min ++;
				System.out.println(min);
			}
			
			
		}

	}

}
