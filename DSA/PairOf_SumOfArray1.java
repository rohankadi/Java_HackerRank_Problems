package com.dsa;

import java.util.Arrays;

public class PairOf_SumOfArray1 {

	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		findPair(nums, target);
	}

	// Function to find a pair in an array with a given sum using sorting
	public static void findPair(int[] nums, int target) {
		// sort the array in ascending order
		Arrays.sort(nums);

		// maintain two indices pointing to endpoints of the array
		int low = 0;
		int high = nums.length - 1;

		// reduce the search space `nums[low…high]` at each iteration of the loop

		// loop till the search space is exhausted
		while (low < high) {
			// sum found
			if (nums[low] + nums[high] == target) {
				System.out.println("Pair found ("+ nums[low] + " , " + nums[high] + ")");
				return;
			}

			// increment `low` index if the total is less than the desired sum;
			// decrement `high` index if the total is more than the desired sum
			if (nums[low] + nums[high] < target) {
				low++;
			} else {
				high--;
			}
		}

		// we reach here if the pair is not found
		System.out.println("Pair not found");
	}

}
