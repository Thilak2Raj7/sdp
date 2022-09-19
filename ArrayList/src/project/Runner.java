//$Id$
package project;

import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

public class Runner {
	Logical obj = new Logical();
	static Scanner scan = new Scanner(System.in);

	public void addValue() throws Exception {
		int num = 0;
		System.out.println("Enter the number of values added in the arrayList");
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			throw new Exception("Input should be an integer");
		}
		scan.nextLine();
		System.out.println("Enter the values");

		for (int i = 0; i < num; i++) {

			String value = scan.nextLine();
			obj.add(value);

		}

		System.out.println(obj.arr1);
	}

	public void getSize() {
		System.out.println(obj.getSize());

	}

	public void getValue() throws Exception {
		System.out.println("Enter the index");
		try {
			int index = scan.nextInt();
			System.out.println(obj.getValue(index));
		} catch (InputMismatchException e) {
			throw new Exception("Input should be an integer");
		}

	}

	public void clear() {
		System.out.println(obj.clear());
	}

	public void containsValue() {
		scan.nextLine();
		System.out.println("Enter the value");
		String value = scan.nextLine();
		System.out.println(obj.containsValue(value));

	}

	public void indexOf() {
		System.out.println("Enter the value");
		String value = scan.nextLine();
		System.out.println(obj.indexOf(value));

	}

	public void lastIndex() {
		System.out.println("Enter the value");
		String value = scan.nextLine();
		System.out.println(obj.lastIndexOf(value));

	}

	public void remove() throws Exception {
		System.out.println("Enter the index");

		try {
			int index = scan.nextInt();
			System.out.println(obj.remove(index));
		} catch (InputMismatchException e) {
			throw new Exception("Input should be an integer");
		}

	}

	public void removeValue() {
		scan.nextLine();
		System.out.println("Enter the value");
		Object value = scan.nextLine();
		System.out.println(obj.removeValue(value));

	}

	public void replace() throws Exception {
		System.out.println("Enter the index");
		try {
			int index = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the value");
			String value = scan.nextLine();

			System.out.println(obj.replace(index, value));

		} catch (InputMismatchException e) {
			throw new Exception("Input should be an integer");
		}

	}

	public void subList() throws Exception {
		System.out.println("Enter the index");
		try {
			int index = scan.nextInt();
			System.out.println("Enter the last index");
			int lastIndex = scan.nextInt();

			try {
				System.out.println(obj.subList(index, lastIndex));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new Exception(e);
			}
		} catch (InputMismatchException e1) {
			throw new Exception("Input should be an integer");
		}

	}

	public void checkEmpty() {
		System.out.println(obj.empty());
	}

	public void iterator() {
		ListIterator iterate = obj.iterate();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

	public void removeAll() throws InterruptedException {
		// System.out.println(obj.arr1);

		System.out.println("Remove" + obj.removeAll());
	}

	public static void main(String[] args) {
		int option = 0;

		Runner run = new Runner();
		// Scanner scan = new Scanner(System.in);
		boolean value = true;
		while (value) {
			System.out.println("1.Add value to the list\n" + "2.Get size of the list \n" + "3.Get value by using index\n" + "4.Check value present in the list\n" + "5.Index of \n" + "6.Last Index of \n" + "7.Replace\n" + "8.Remove value using index \n" + "9.Remove element specifying element \n" + "10.Sublist(Create new list using index)\n" + "11.Iterate the list\n" + "12.Clear the list \n" + "13 Remove all elements");
			System.out.println("Enter the option to perform");
			try {
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Enter the valid option");

			}
			switch (option) {

			case 1:
				try {
					run.addValue();
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;
			case 2:
				run.getSize();
				break;
			case 3:
				try {
					run.getValue();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 4:
				run.containsValue();
				break;
			case 5:
				run.indexOf();
				break;
			case 6:
				run.lastIndex();
				break;
			case 7:
				try {
					run.replace();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 8:
				try {
					run.remove();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 9:
				run.removeValue();
				break;
			case 10:
				try {
					run.subList();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 11:

				run.iterator();
				break;
			case 12:
				run.clear();
				break;
			case 13:
				try {
					run.removeAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				value = false;
				System.out.println("The value is invalid");

			}
		}
	}
}
