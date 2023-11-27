package com.kn.dsa;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Decimal Number : ");
		int n = scan.nextInt();
		
		System.out.println("Binary value of '" + n + "' is = " + decimalToBinary(n));
		scan.close();
	}

	public static String decimalToBinary(int n) {
		String b = ""; //store the reminder in traverse(bottom to up)
		
		while(n >= 1) {
		int x = n % 2 ; //temp reminder storage
		    n = n / 2;
		 b = x + b;  //not b + x;
		}
		return b;
	}
	
	
	
	
}
