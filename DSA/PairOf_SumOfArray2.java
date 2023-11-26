package com.dsa;

public class PairOf_SumOfArray2 {
	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		// 01
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
//					return;
//				}
//			}
//		}
		// System.out.println("Pair not found");
		
		 int[] result = pairOfSumOfAnArray(nums, target);
		 if (result.length == 2) {
	            System.out.println("Pair found (" + nums[result[0]] + "," + nums[result[1]] + ")");
	        } else {
	            System.out.println("Pair not found");
	        }

}
	// Method declaration
	// LeetCode Solution
	public static int[] pairOfSumOfAnArray(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
}
