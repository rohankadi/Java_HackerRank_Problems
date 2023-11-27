package com.kn.dsa;

import java.util.Scanner;

public class StringToArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a sentence : ");
		String str = scan.nextLine();
		
		//creating an array of string length
		char[] arr = new char[str.length()];

		//copy character in to an array
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		//printing array
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
