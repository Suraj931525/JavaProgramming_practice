package arrayprogram;

public class singledimensionalarray {

	public static void main(String[] args) {
		// without declaring size of array
//		int arr []= {11,22,33,44,55,66};
//
//		int i=0;
//		while(i<5) {
//		System.out.println(arr[i]);
//		i++;
//		}
		
		
		// with declaring size
		float arr[]=new float[4];
		arr[0]=12;
		arr[1]=12.2f;
		arr[2]=15.8f;
		arr[3]=12;
		
		
		
		for(int i=0;i<4;i++ ) {
		
				System.out.println(arr[i]);
			}
		}
		}



