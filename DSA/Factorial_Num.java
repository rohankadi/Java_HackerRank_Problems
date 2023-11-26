package com.dsa;

import java.util.Scanner;

public class Factorial_Num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a factorial number = ");
		int num = scan.nextInt();
		
		int fact = 1;
	    for(int i=1; i<=num; i++) {
	    	fact = fact * i;
	    }
	    System.out.print("The Factorial of " + num + " is = " + fact);
	    scan.close();
	}
}
