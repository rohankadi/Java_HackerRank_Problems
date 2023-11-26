// Program to print all prime factors--> O(sqrt(n))
package com.dsa;

import java.lang.Math;

public class PrimeFactors {

	public static void main(String[] args) {
		int n = 40;
		primeFactors(n);
	}

	public static void primeFactors(int n) {
		// prime factors divide by 2
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n = n / 2;
		}

		// for this moment even numbers over, so check with odd numbers
		for (int i = 3; i < Math.sqrt(n); i = i + 2) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
		}
		if(n > 2) {
			System.out.println(n);
		}

	}
}
