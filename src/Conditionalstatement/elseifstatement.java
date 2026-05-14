package Conditionalstatement;

import java.util.Scanner;

public class elseifstatement {

	public static void main(String[] args) {
		System.out.println("Enter the Signal color");
		Scanner sc =new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='R') {
			System.out.println("stop");
		}
		else if(ch=='Y') {
			System.out.println("hurry up signal stop in 5 min");
		}
		else {
			System.err.println("go");
		}

	}

}
