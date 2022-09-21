//$Id$
package exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Enter the index value for an array");
		int num = scan.nextInt();
		try {
			System.out.println("Print the " + num + "th element :" + arr[num]);
			try {

				System.out.println(arr[0] / 0);
			} catch (ArithmeticException e) {
				System.out.println("Number should not  divided by zero!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound exception occured");
		}

	}
}
