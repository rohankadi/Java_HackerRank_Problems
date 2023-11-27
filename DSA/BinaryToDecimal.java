package com.kn.dsa;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Binary value : ");
		String b = scan.next(); //b = "101101";
		
		System.out.println("Decimal value of '" + b+ "' is = " + binaryToDecimal(b));

		scan.close();

	}

	public static int binaryToDecimal(String b) {

		int result = 0;
		int powOf2 = 1; // 2'0 = 1

		for (int i = b.length() - 1; i >= 0; i--) {
			if (b.charAt(i) == '1') {
				result = result + powOf2;  
				System.out.println(result); //1,outOfIdCond,1+4=5, 5+8=13, outOfIfCond, 13+32=45;
			}

			powOf2 = powOf2 * 2;  //1*2=2, 2*2=4, 4*2=8, 8*2=16, 16*2=32, (32*2=64 no use)
		}
		return result;
	}

}
