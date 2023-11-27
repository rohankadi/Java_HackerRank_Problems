package com.dsa;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = scan.nextInt();
		
		
		if(isPrime(n)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	
		scan.close();
	}

	/*
		 01 02 03 04 05 06
		 07 08 09 10 11 12
		 13 14 15 16 17 18
		 19 20 21 22 23 24
		 25 26 27 28 29 30
	 */

	
	
	
	public static boolean isPrime(int n) {
		//a. 1 2 3
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		
       //b. 2 4 6 8 10 12 16 18 20 22 24 26 28 30
       //c. 3 6 9 12 15 18 21 24 27 30
		if(n % 2 == 0 || n % 3 ==0) {
			return false;
		}
		
		//for(int i=5; i<=Math.sqrt(n); i++) {
		for(int i=5; i*i<=n; i=i+6) {
			if(n%i==0 || n%(i+2)==0) {   //d. n%5==0 or n%(5+2)==0
				return false;
			}
		}
			
		return true;
	}

}
