package com.rk.String;

public class Removing_VowelsFromString {

	public static void main(String[] args) {
		String str = "WelcomE to ScAler";
		String srr = str.toLowerCase();

		removeVowels(srr);	
	}

	public static void removeVowels(String srr) {
		for (int i = 0; i < srr.length(); i++) {
			char arr = srr.charAt(i);

			if (arr == 'a' || arr == 'e' || arr == 'i' || arr == 'o' || arr == 'u') {
				continue;
			}
			System.out.print(arr + " ");
		}
	}
}
