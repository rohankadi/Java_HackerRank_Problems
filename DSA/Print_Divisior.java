//Time Complexity ==> O(n)
package com.dsa;

import java.util.Scanner;

public class Print_Divisior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = scan.nextInt();
		
		findingDivisior(num);
		scan.close();
	}
	//Brute force Approach
	public static void findingDivisior(int num) {
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i +  " ");
			}
		}
	}

}
