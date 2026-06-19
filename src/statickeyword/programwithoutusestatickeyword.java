package statickeyword;


class Student{
	int sid;
	String sname;
	String cname;
	public void get(int x,String y,String z) {
		sid=x;
		sname=y;
		cname=z;
	}
	void display() {
		System.out.println("id of student is: "+  sid);
		System.out.println("name of student is: "+ sname);
		System.out.println("college name of student is: "+ cname);
		
	}
	
}
public class programwithoutusestatickeyword {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.get(101,"suraj","pvpit");
		s1.display();
		
		
		Student s2=new Student();
		s2.get(102,"Ritesh","pvpit");
		s2.display();
		
		
		Student s3=new Student();
		s3.get(103,"Prathmesh","pvpit");
		s3.display();
		
		
		
		Student s4=new Student();
		s4.get(104,"Aniket","pvpit");
		s4.display();

	}

}
