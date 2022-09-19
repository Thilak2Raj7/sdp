//$Id$
package stack;

import java.util.Scanner;
import java.util.Stack;

public class RunStack {

	static Scanner scan = new Scanner(System.in);
	static StackLogic logic = new StackLogic();

	public Stack<Object> push() throws Exception {
		System.out.println("Enter the number of elements to push into stack");

		int num = scan.nextInt();

		scan.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the value");
			String value = scan.nextLine();
			logic.push(value);
		}

		return logic.stack;

	}

	public Object pop() throws UserException {

		return logic.pop();

	}

	public Object peek() throws UserException {

		return logic.pop();

	}

	public Object search() throws UserException {
		scan.nextLine();
		System.out.println("Enter the value");
		String element = scan.nextLine();

		return logic.search(element);

	}

	public boolean checkEmpty() {
		return logic.checkEmpty();
	}

	public static void main(String[] args) {
		int option = 0;

		RunStack run = new RunStack();

		boolean value = true;
		System.out.println("1.Push element into stack\n" + "2.Pop element from stack\n" + "3.Peek element from stack\n" + "4.Search element in a stack\n" + "5.Check stack is empty");
		while (value) {

			System.out.println("Enter the option to perform");
			try {
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Enter the valid option");

			}
			switch (option) {
			case 1:
				try {
					System.out.println(run.push());
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					scan.nextLine();
				}
				break;
			case 2:
				try {
					System.out.println("The element is removed " + run.pop());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Retrieved element from stack " + run.peek());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 4:
				try {
					System.out.println("Search element : " + run.search());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Check empty: " + run.checkEmpty());
				break;
			default:
				value = false;
				System.out.println("Invalid entry");
			}
		}
	}

}
