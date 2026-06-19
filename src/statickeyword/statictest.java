package statickeyword;


class emp{
//	int count=0;
	static int count=0;
	emp(){
       count=count+1;
       System.out.println(count);
	}
	
}
public class statictest {

	public static void main(String[] args) {
		new emp();
		new emp();
		new emp();
		new emp();
	}

}
