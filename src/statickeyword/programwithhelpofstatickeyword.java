package statickeyword;

	


	class student{
		int sid;
		String sname;
		static String cname="pvpit";
		public void get(int x,String y) {
			sid=x;
			sname=y;
			
		}
		void display() {
			System.out.println("id of student is: "+  sid);
			System.out.println("name of student is: "+ sname);
			System.out.println("name of student college  is: "+ cname);
			
			
		}
		
	}
	

       public class programwithhelpofstatickeyword {

		public static void main(String[] args) {
			student s1=new student();
			s1.get(101,"suraj");
			s1.display();
			
			
			student s2=new student();
			s2.get(102,"Ritesh");
			s2.display();
			
			
			student s3=new student();
			s3.get(103,"Prathmesh");
			s3.display();
			
			
			
			student s4=new student();
			s4.get(104,"Aniket");
			s4.display();

		}

	}



