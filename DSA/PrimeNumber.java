package com.dsa;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = scan.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is prime number");
		}
		else {
			System.out.println(n + " is not prime number");
		}
		
		scan.close();
	}

	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}else {
			for(int i=2; i<=Math.sqrt(n); i++) {    //Time Complexity O(√n)
				//for(int i=2; i<=n/2; i++) {      //Time Complexity O(n)
			if(n%i==0) {
				return false;
			}
		}
	  }
		return true;
	}

}
