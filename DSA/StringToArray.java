package com.kn.dsa;

import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		//reading a string value
		System.out.println("User! please enter a sentence : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		//converting a String into an Array
		char[] ch = str.toCharArray();
		
		//printing an Array value
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");			
		}
		
		

	}
}
