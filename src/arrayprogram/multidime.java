package arrayprogram;

public class multidime {

	public static void main(String[] args) {
		int number[][][]= {
				{{1,2},{2,3}},
				{{4,5},{6,7}}
				
		};
		for(int m=0;m<2;m++) {
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(number[m][i][j]+" ");
				}
				System.out.println(" ");
			}
			System.out.println("--------------");
			
		}
	}

}
