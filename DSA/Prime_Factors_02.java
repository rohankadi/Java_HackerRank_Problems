package com.dsa;

public class Prime_Factors_02 {
	public static void main(String[] args) {
		int n = 60;
		primeFactors(n);
	}

	public static void primeFactors(int n) {
		int i = 2;
		while (n > 1) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
			i++;
		}
	}
}
