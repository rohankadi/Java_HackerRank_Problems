package com.kn.dsa;

import java.util.Arrays;

public class ArrayToString1 {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a' };
		
		System.out.println(arrayToString(arr));
	}

	public static String arrayToString(char[] arr) {
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
			sb.append(c);
		}
		return sb.toString();
	}
}
