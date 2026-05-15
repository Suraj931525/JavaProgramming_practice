package LoopingStatement;

import java.util.Scanner;

public class DowhileloopStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		int i=1;
		do {
			System.out.println(i+ name);
			i++;
		}
		while(i<=20);

	}

}
