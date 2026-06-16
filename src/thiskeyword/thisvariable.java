package thiskeyword;


class student{
	int sid;
	String sname;
	
//	void get(int x,String y) {
//		sid=x;
//		sname=y; // this keyword not use because instance variable name and method parameter name is different
//		
//	}
	
	void get(int sid,String sname) {
		this.sid=sid;                      // proble occur when instance variable name and paramter name is same use this keyword to access instance variable
		this.sname=sname;
	}
}
public class thisvariable {

	public static void main(String[] args) {
	student s1=	new student();
	s1.get(101, "suraj");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		
	}

}
