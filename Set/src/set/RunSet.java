//$Id$
package set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RunSet {
	static Scanner scan = new Scanner(System.in);
	static SetMethods call = new SetMethods();
	int value = 0;

	public Set<Object> addValue() throws Exception {

		System.out.println("Enter the number of values added in the arrayList");
		int num = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < num; i++) {
			call.addElement(getValue());
		}
		return call.set;

	}

	public int getSize() {
		return call.getSize();

	}

	public int getValue() {
		scan.nextLine();
		System.out.println("Enter the value ");

		return scan.nextInt();

	}

	public boolean containsValue() {
		return call.contains(getValue());
	}

	public Object removeValue() {
		return call.removeElement(getValue());

	}

	public boolean checkEmpty() {
		return call.checkEmpty();
	}

	public Set<Object> addAll() {
		return call.addAllElements();

	}

	public Set<Object> clearSet() {
		return call.clear();
	}

	public Set<Object> removeAll() {
		return call.removeAllElements();
	}

	public Set<Object> retainAll() {
		return call.retainAllElements();
	}

	public static void main(String[] args) {
		int option = 0;
		RunSet run = new RunSet();

		boolean value = true;
		System.out.println("1.Add elements in set\n" + "2.Get size of set\n" + "3.Value is present in set\n" + "4.Remove value in set\n" + "5.Iterate element in set\n" + "6.Remove all elements in set\n" + "7.Retain all elements in set\n" + "8.Add all elements from collection\n" + "9.Clear ths set\n" + "10.Check Empty");
		while (value) {

			System.out.println("Enter the option to perform");
			try {
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Enter valid option!");

			}
			switch (option) {
			case 1:
				try {
					System.out.println("Set :" + run.addValue());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Size of set :" + run.getSize());
				break;
			case 3:
				try {
					System.out.println("Value is present ? :" + run.containsValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("Element removed ? :" + run.removeValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					Iterator<Object> iterate = call.iterateElement();
					System.out.println("The Number of Elements  present in set :" + run.getSize());
					while (iterate.hasNext()) {
						System.out.println(iterate.next());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					System.out.println("After removing element which is present in collection :" + run.removeAll());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					System.out.println("After retaining element which is present in collection  :" + run.retainAll());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 8:
				try {
					System.out.println("After adding elements from collection:" + run.addAll());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 9:
				try {
					System.out.println("Clear set :" + run.clearSet());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 10:
				try {
					System.out.println("Set is Empty? :" + run.checkEmpty());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			default:
				value = false;
				scan.nextLine();
				System.out.println("Choose option from 1 to 10");

			}
		}
	}
}
