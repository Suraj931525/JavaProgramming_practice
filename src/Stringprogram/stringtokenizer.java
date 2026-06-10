package Stringprogram;

import java.util.StringTokenizer;

public class stringtokenizer {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("hello world java programming");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}

	}

}
