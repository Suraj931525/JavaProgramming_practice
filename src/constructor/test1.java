package constructor;

public class test1 {
	int cid;
	String cname;
	
	test1() {
	System.out.println("i am default constructor");
	}
	
	test1(int a,String b){
		 cid=a;
		 cname=b;
	}
	
	public static void main(String[] args) {
		
        new test1();

        test1 t = new test1(23, "Suraj");

        System.out.println("The id is " + t.cid);
        System.out.println("The name is " + t.cname);

	}

}
