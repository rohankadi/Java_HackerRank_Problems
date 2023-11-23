package co.rk.exceptionHandling;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x and y values : ");
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			System.out.println(x / y);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (InputMismatchException ime) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
