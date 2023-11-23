package com.rk.arrays;

import java.util.Scanner;

public class Array1D {

	public class Solution {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();
			int[] myArray = new int[n];

			for (int i = 0; i < n; i++) {
				myArray[i] = scanner.nextInt();
				System.out.println(myArray[i]);
			}
			scanner.close();
		}
	}

}
