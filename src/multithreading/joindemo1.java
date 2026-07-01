package multithreading;


class A extends Thread{
	public void run() {
		System.out.println("select product");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
			
		}
		System.out.println("product added");
	}
}
	
	
	
	
	
	class b extends Thread{
		public void run() {
			System.out.println("enter address");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
				
			}
			System.out.println("address entered successfully");
		}
	}
		
		
		
		

		class c extends Thread{
			public void run() {
				System.out.println("payment");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
					
				}
				System.out.println("payment  successfully done");
			}
		}
		
			
			
			
			
			
			
			

			class d extends Thread{
				public void run() {
					System.out.println("sending invoice");
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
						
					}
					System.out.println("send successfully invoice on email");
				}
			}
		
		
				

				class e extends Thread{
					public void run() {
						System.out.println("order placed");
						try {
							Thread.sleep(2000);
						}
						catch(InterruptedException e) {
							System.out.println(e);
							
						}
						System.out.println("order received");
					}
				}
	
	

public class joindemo1 {

	public static void main(String[] args) throws InterruptedException{
		A a1=new A();
		a1.start();
		a1.join();
	
	
	
		b b1=new b();
		b1.start();
		b1.join();
		
		
		
		
		
		c c1=new c();
		c1.start();
		c1.join();
		
		
		
		
		
		
		
		d d1=new d();
		d1.start();
		d1.join();
		
		
		
		
		
		
		e e1=new e();
		e1.start();
		e1.join();
	
	
	
	
	}

}
