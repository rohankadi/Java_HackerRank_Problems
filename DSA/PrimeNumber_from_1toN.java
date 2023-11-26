//Finding Prime Numbers - Sieve Of Eratosthenes Program In Java 
//Time Complexity O(√n)
package com.dsa;

import java.util.Scanner;

public class PrimeNumber_from_1toN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a range = ");
		int n = scan.nextInt();
		
		//method calling
		sievePrintPrime(n);
		
	scan.close();
	}

	// method declaration
	public static void sievePrintPrime(int n) {
		//create an boolean array
		boolean[] prime = new boolean[n+1];
		
		//outer-loop
		 for(int i=2; i<=Math.sqrt(n); i++) {
			
			if(prime[i] == false) { //if array is not marked or filled then returns false.
			
			//inner-loop
			/*Taking  j = multiplication of i(unmarked multiple), 
				that selects all the multiplications of an i.*/
			for(int j = i*i; j<=n; j = j + i) { 
				prime[j] = true;
			}
		}
	  }
		 //Array traversing
		for(int i = 2;i<=n;i++){
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
	}
}


/*
 * Complexity Analysis: Time complexity:
 * 
 * The outer loop runs from 2 to the square root of N, so it runs in O(√(N))
 * time. The inner loop runs from i*i to N, and for each prime number i, it
 * eliminates the multiples of i up to N. Therefore, the inner loop runs at most
 * N/i times for each prime number i, so it has a time complexity of O(N/2 + N/3
 * + N/5 + …), which is approximately O(N log(log(N))). This is because the sum
 * of the reciprocals of the prime numbers up to N is asymptotically bounded by
 * log(log(N)). The final loop runs from 2 to N, so it has a time complexity of
 * O(N). Therefore, the overall time complexity of the algorithm is O(N
 * log(log(N))).
 *
 *  Space complexity:
 * The algorithm uses an array of size N+1 to store the boolean values of
 * whether each number is prime or not. Therefore, the space complexity is O(N).
 */
