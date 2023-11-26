package com.dsa;

import java.util.Scanner;

public class LCMof_TwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 1st number = ");
		int a = scan.nextInt();
		System.out.print("Enter a 2nd number = ");
		int b = scan.nextInt();

		// Method calling
		System.out.println("LCM of " + a + " and " + b + " is : " +lcm(a, b));
		scan.close();
	}
	
       /*
       a x b = LCM(a, b) X GCD(a,b)
            or
       LCM(a, b) =  (a x b) / GCD(a,b)
        */
	
	// Method declaration
		public static int gcd(int a, int b) {
			if (a == 0) {
				return b;
			}
			return gcd(b % a, a);
		}

		public static int lcm(int a, int b) 
		{	
			return ((a  * b)/ gcd(a,b));
		}
}
