package com.dsa;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = scan.nextInt();
		
		primeOrNot(n);
		scan.close();
		
  }

	public static void primeOrNot(int n) {
		int flag = 0;
		if(n==0 || n==1) {
			System.out.println("Not a Prime Number");
			flag = 1;
		}
		else {
			for(int i=2; i<=Math.sqrt(n); i++) {
				//for(int i=2; i*i<=n; i++){
				if(n%i==0) {
					System.out.println("Not a Prime Number");
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0) {
			System.out.println("Prime Number");
		}
		
		
	}
}
