package LoopingStatement;

import java.util.Scanner;

public class countdigitwithwhileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to count the digit");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
			
		}
		System.out.println("the count of digit is:"+count);
	}

}
