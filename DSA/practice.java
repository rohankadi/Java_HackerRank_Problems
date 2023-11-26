package com.dsa;

public class practice {
	public static void main(String[] args) {
		int num = 0;
   
		primeCheck(num);
		
	}

	public static void primeCheck(int num) {
		int flag = 0;
		if(num == 0 || num == 1) {
			System.out.println("Not a Prime Number");
			flag = 1;
		}
		else {
			for(int i=2; i*i<=num; i++) {
				if(num % i == 0) {
					System.out.println("Not a Prime Number");
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Prime Number");
		}
	}
}
