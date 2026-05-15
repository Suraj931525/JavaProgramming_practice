package LoopingStatement;

import java.util.Scanner;

public class oddnumberseriesusingdowhileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number when odd number series want to start");
		int num=sc.nextInt();

		
		do {
			if(num%2==1) {
				System.out.println(num);
			}
			
			num++;
		}
		while( num<100);
	}

}
