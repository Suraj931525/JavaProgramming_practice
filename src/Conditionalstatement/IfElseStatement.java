package Conditionalstatement;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		System.out.println("do you have ticket:");
		Scanner sc=new Scanner(System.in);
		boolean isticket=sc.nextBoolean();
		if(isticket==true) {
			System.out.println("welcome metro");
		}
		else {
			System.out.println("tata by by");
		}
	}

}
