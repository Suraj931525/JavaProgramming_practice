package multithreading;

public class sleepdemo {

	public static void main(String[] args)throws InterruptedException  {
		int i , n=2,  ans;
		for(i=0;i<=10;i++) {
			ans=n*i;
			Thread.sleep(2000);
			System.out.println(ans);
		}
		
	}

}
