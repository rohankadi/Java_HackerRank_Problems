//Using Brute-Force
//The time complexity of the below solution is O(n2) 
//and doesn’t require any extra space, where n is the size of the input.

package com.dsa;

public class PairOf_SumOfArray {

	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		 pairOfSumOfAnArray(nums, target);

//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					System.out.println(nums[i] + "," + nums[j]);
//				}
//			}
//		}
	}

	public static void pairOfSumOfAnArray(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
					return;
				}
			}
		}

		System.out.println("Pair Not Found");
	}

}
