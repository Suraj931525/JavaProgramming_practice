package Conditionalstatement;

import java.util.Scanner;

public class nestedifelsestatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("are you endrolled for fullstack course");
		boolean isenrolled=sc.nextBoolean();
		if(isenrolled==true) {
			System.out.println("welcome fct");
			System.out.println(" do you comple addmission process");
			boolean isdoneadd=sc.nextBoolean();
			if(isdoneadd=true) {
				System.out.println("now you can continue classes");
			}
			else {
				System.out.println("you need to complte addmission process");
			}
		}
		else {
			System.out.println("complete enrollment process");
		}

	}

}
