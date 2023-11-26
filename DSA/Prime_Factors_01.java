//O(sqrt(n)log n)
package com.dsa;

public class Prime_Factors_01 {

	public static void main(String[] args) {
		int n = 40;
		primeFactors(n);
	}

	public static void primeFactors(int n) {
		int i = 2;
		while (i*i <=  n) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
			i++;
		}
		if(n >1) {
			System.out.println(n);
		}
	}

}
