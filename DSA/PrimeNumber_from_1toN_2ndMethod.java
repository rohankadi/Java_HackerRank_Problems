package com.dsa;

import java.util.Scanner;

public class PrimeNumber_from_1toN_2ndMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a range = ");
		int n = scan.nextInt();

		primeCheck(n);

	scan.close();
	}

	public static void primeCheck(int n) {
		
		for (int i = 1; i <= n; i++) {
			int flag = 0;
			// print 0 & 1 as it is
			if (i == 0 || i == 1) {
				continue;
			}
			else {
				for(int j=2; j<i; j++) {
					if(i % j == 0) {
						flag = 1;
						break;
					}
				}
			}
			
			//Conditional Check
			if(flag == 0) {
				System.out.println(i);
			}
		}
	}

}
