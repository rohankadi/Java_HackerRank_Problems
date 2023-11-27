package com.kn.dsa;

public class DecimalToBinary1 {
	public static void main(String[] args) {
	 int N = 45;
	 
	 toBinary(N);
	}

	public static void toBinary(int N) {
		StringBuilder sb = new StringBuilder();

		while (N > 0) {
			int rem = N % 2;
			sb.append(rem);
			N = N / 2;
		}
		System.out.print(sb.reverse());
	}
}
