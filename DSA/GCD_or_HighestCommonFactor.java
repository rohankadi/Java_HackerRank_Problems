package com.dsa;

import java.util.Scanner;

public class GCD_or_HighestCommonFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 1st number = ");
		int a = scan.nextInt();
		System.out.print("Enter a 2nd number = ");
		int b = scan.nextInt();

		// Method calling
		System.out.println(gcdOrHcf(a, b));
		scan.close();
	}

	// Method declaration
	public static int gcdOrHcf(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcdOrHcf(b % a, a);
	}

}
