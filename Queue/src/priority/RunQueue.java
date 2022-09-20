//$Id$
package priority;

import java.util.Queue;
import java.util.Scanner;

public class RunQueue {
	static Scanner scan = new Scanner(System.in);
	static QueueMethods call = new QueueMethods();
	int value = 0;

	public Queue<Object> addValue() throws Exception {

		System.out.println("Enter the number of values added in the arrayList");
		int num = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < num; i++) {

			call.add(getValue());
		}
		return call.queue;

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

	/*
	 * public boolean checkEmpty() { return call.checkEmpty(); }
	 */

	public Object offerValue() {
		return call.offerElement(getValue());

	}

	public Object pollElement() {
		return call.pollElement();

	}

	public Object peekElement() {
		return call.peek();

	}

	public Object retreiveElement() throws Exception {
		return call.retreiveElement();

	}

	public Object remove() throws Exception {
		return call.remove();
	}

	public Queue<Object> clear() {
		call.clearQueue();
		return call.queue;
	}

	public static void main(String[] args) {
		int option = 0;
		RunQueue run = new RunQueue();

		boolean value = true;
		System.out.println("1.Add elements in queue\n" + "2.Get size of queue\n" + "3.Value is present in queue\n" + "4.Remove value in queue\n" + "5.Add element using offer\n" + "6.Get first element \n" + "7.Remove first element \n" + "8.Remove the head element in this queue\n" + "9.Retrieve the first element in queue\n" + "10.Clear queue");
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
					System.out.println("Queue elements  :" + run.addValue());

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					System.out.println("Input must be an integer");
					scan.nextLine();

				}
				break;
			case 2:
				System.out.println("Size of queue :" + run.getSize());
				break;
			case 3:
				try {
					System.out.println("Value is present ? :" + run.containsValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 4:
				try {
					System.out.println("Element removed ? :" + run.removeValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 5:
				try {
					System.out.println("Element added  :" + run.offerValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 6:
				try {
					System.out.println("First element  of queue :" + run.peekElement());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 7:
				try {
					System.out.println("First element removed   :" + run.pollElement());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 8:
				try {
					System.out.println("Remove head element from this queue : " + run.remove());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 9:
				try {
					System.out.println("Retrieves the first element in the queue :" + run.retreiveElement());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 10:
				try {
					System.out.println("Clear queue :" + run.clear());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

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
