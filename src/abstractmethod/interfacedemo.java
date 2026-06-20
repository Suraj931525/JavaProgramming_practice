package abstractmethod;




interface teamleader{
	
	void login();
	void logout();
	void payment();
	void exit();
}

  class employee implements teamleader{
	public  void login() {
		 System.out.println("login form implem or code");
	 }
	public void logout(){
		System.out.println("log out impl or code");
		
	}
	public void payment() {
		System.out.println("payment form imple or code");
	}
	public void exit() {
		System.out.println("exit");
	}
	 
 }


public class interfacedemo {

	public static void main(String[] args) {
		
		teamleader s1=new employee();
		s1.login();
		s1.logout();
		s1.exit();
		

	}

}
