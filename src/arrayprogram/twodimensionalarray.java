package arrayprogram;

public class twodimensionalarray {

	public static void main(String[] args) {
		// without declaring size of array
		
//		char arr [][]= {
//				{'a','b'},
//				{'s','d'}
//		};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[i]   [j]);
//		}
//			System.out.println("  ");
//
//	}
		
		
		// with declaring size of size
		
		
		char arr [][]= new char[2][2];
				arr[0][0]= 'a';
				arr[0][1]='b';
				arr[1][0]='c';
				arr[1][1]='d';
				
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i]   [j]);
		}
			System.out.println("  ");

	}

}
}
