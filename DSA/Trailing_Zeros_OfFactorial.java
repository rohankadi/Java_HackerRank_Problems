package com.dsa;

import java.util.Scanner;

public class Trailing_Zeros_OfFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a factorial number = ");
		int n = scan.nextInt();
		
		/*
		 n! = n/5 + n/25 + n/125 + n/625 + n/1325 +......+ infinity
		 */
		
		//method calling
		System.out.println(trailingZeros(n));
		scan.close();
	}

	//method declaration
	public static int trailingZeros(int n) {
		int res = 0;
		int powerOf5 = 5;
		
		while(n >= powerOf5) {
			res = res + (n / powerOf5);
			powerOf5 = powerOf5 * 5;
		}
		
		return res;
	}

}
