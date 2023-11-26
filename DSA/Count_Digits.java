package com.dsa;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = scan.nextInt();

		/*
		 1. if digits exists (n>0) 
		 2. remove last digit (n=n/10)
		 3. Increase count by 1 (count++)
		 4. Repeat step 1 to 3 till digits remains
		 */
		
		// Method calling
		System.out.println(countDigits(num));
		scan.close();
	}
	
	//method declaration
	public static int countDigits(int num) {
		int count = 0;
		//for (int i = num; num > 0; i--) {
		while(num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
}


