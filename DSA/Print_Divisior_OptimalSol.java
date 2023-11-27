//Time Complexity ==> O(root n)
package com.dsa;

import java.util.Scanner;

public class Print_Divisior_OptimalSol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = scan.nextInt();

		findingDivisior(num);
		scan.close();
	}

	public static void findingDivisior(int num) {
		int i = 0;
		//Printing 1st divisors
		for (i = 1; i * i <= num; i++) {
			//for (i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		//Making 2nd divisors in Ascending order then Printing 
		for( ; i >= 1; i--) {
			if(num % i == 0 && i < num/i) {
				System.out.println(num/i);
			}
		}
	}
}
