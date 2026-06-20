package abstractmethod;

interface sbi{
	void payment();

}
interface HDFC {
	void payment();
}
interface ICICI {
	void payment();
}

class bank implements sbi,HDFC,ICICI{
	public void payment () {
		System.out.println("payment done");
	}
}


public class interfacemulipleinheritanceexample {

	public static void main(String[] args) {
		
		
		sbi s1=new bank();
		s1.payment();
		
		HDFC s2=new bank();
		s2.payment();
		
		ICICI s3=new bank();
		s3.payment();

	}

}
