package com.kn.dsa;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = scan.nextInt(); // 8

		boolean flag = ispowerOf2(num);
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

		scan.close();
	}

	public static boolean ispowerOf2(int num) {
		while (num >= 1) {
			if (num == 1) {
				return true;
			} else if (num % 2 == 1 || num == 0) {
				return false;
			}
			num = num / 2;
		}
		return false;
	}
}


