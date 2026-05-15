package LoopingStatement;

import java.util.Scanner;

public class forloopprintreversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number ");
		int j=sc.nextInt();
		System.out.println("enter end number");
		int num=sc.nextInt();
		
		for( int i=j; i>=num;i--) {
			System.out.println(i);
			
		}
	}

}
