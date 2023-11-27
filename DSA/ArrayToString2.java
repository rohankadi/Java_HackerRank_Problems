package com.kn.dsa;

public class ArrayToString2 {
	public static void main(String[] args) {

		char[] arr = new char[] {'j', 'a', 'v', 'a'};
		
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i];
		}
		
		System.out.println(str);
	}
}
