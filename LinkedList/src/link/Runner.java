//$Id$
package link;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

	static Scanner scan = new Scanner(System.in);
	static LinkedListMethods method = new LinkedListMethods();
	int index = 0;
	String value = "";

	public LinkedList<Object> addElement() {
		System.out.println("Enter the number of elements to add in the linkedlist");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {

			value = getValue();
			method.add(value);
		}
		return method.list;

	}

	public int getIndex() throws UserException {
		System.out.println("Enter the index");
		try {
			return scan.nextInt();
		} catch (Exception e) {
			throw new UserException("Input mismatch found");
		}
	}

	public String getValue() {
		scan.nextLine();
		System.out.println("Enter the value ");

		return scan.nextLine();

	}

	public LinkedList<Object> addElementUsingIndex() throws UserException {

		value = getValue();

		index = getIndex();
		method.addUsingIndex(index, value);
		return method.list;
	}

	public LinkedList<Object> addAllElement() {
		return method.addAllElements();
	}

	public LinkedList<Object> addAllUsingIndex() throws UserException {

		try {
			index = getIndex();
			try {
				return method.addAllElements(index);
			} catch (UserException e) {
				throw new UserException("");
			}
		} catch (InputMismatchException e) {
			throw new UserException("Input mismatch found!");
		}

	}

	public LinkedList<Object> addFirst() throws UserException {

		value = getValue();
		method.addFirst(value);
		return method.list;
	}

	public LinkedList<Object> addLast() throws UserException {
		value = getValue();
		method.addLast(value);
		return method.list;
	}

	public LinkedList<Object> getFirst() {

		method.getFirst();
		return method.list;
	}

	public LinkedList<Object> getLast() {

		method.getLast();
		return method.list;
	}

	public int getSize() {

		return method.size();
	}

	public LinkedList<Object> setElement() throws UserException {
		value = getValue();
		index = getIndex();
		method.setElement(index, value);
		return method.list;
	}

	public int indexOf() throws UserException {
		value = getValue();
		return method.indexOf(value);

	}

	public int lastIndexOf() throws UserException {
		value = getValue();
		return method.lastIndexOf(value);

	}

	public LinkedList<Object> remove() {
		method.remove();
		return method.list;
	}

	public LinkedList<Object> removeIndexElement() throws UserException {

		index = getIndex();
		method.remove(index);
		return method.list;
	}

	public LinkedList<Object> removeValue() throws UserException {

		value = getValue();
		method.remove(value);
		return method.list;
	}

	public LinkedList<Object> removeFirst() {
		method.removeFirst();
		return method.list;
	}

	public LinkedList<Object> clear() {
		method.clearList();
		return method.list;
	}

	public LinkedList<Object> offer() throws UserException {
		value = getValue();
		method.offer(value);
		return method.list;
	}

	public LinkedList<Object> offerFirst() throws UserException {
		value = getValue();
		method.offerFirst(value);
		return method.list;
	}

	public LinkedList<Object> offerLast() throws UserException {
		value = getValue();
		method.offerLast(value);
		return method.list;
	}

	public Object peek() {
		return method.peek();

	}

	public Object peekFirst() {
		return method.peekFirst();

	}

	public Object peekLast() {
		return method.peekLast();

	}

	public Object poll() {
		return method.pollElement();

	}

	public Object pollFirst() {
		return method.pollFirst();

	}

	public Object pollLast() {
		return method.pollLast();

	}

	public Object removeFirstOccurence() throws UserException {
		value = getValue();

		return method.removeFirstOccurence(value);
	}

	public Object removeLastOccurence() throws UserException {
		value = getValue();
		return method.removeLastOccurence(value);
	}

	public Object removeLast() throws UserException {
		value = getValue();
		return method.removeLast();
	}

	public static void main(String[] args) {
		int option = 0;

		Runner run = new Runner();

		boolean value = true;
		System.out.println("1.Add element in linked list \n" + "2.Get size of linked list \n" + "3.Get index of element\n" + "4.Get Last index of element \n" + "5.Add element using index \n" + "6.Add First elements  \n" + "7.Add  lastelement to the begining \n" + "8.Add element in index position \n" + "9.Remove first element \n" + "10.Remove the  element in list\n" + "11.Remove element using index\n" + "12.Remove first\n" + "13.Add element using offer \n" + "14.Add first element using offer first \n" + "15.Add last element using offer last \n" + "16.Get first element using peek\n" + "17.Get first element using peek first\n" + "18.Get last element using peek last\n" + "19.Remove element using poll \n" + "20.Remove  first element using poll\n " + "21.Remove  last element using poll\n" + "22.Remove first occurence of element\n" + "23.Remove last occurence of element\n" + "24.Remove last element\n" + "25.Clear linkedlist");
		while (value) {

			System.out.println("Enter the option to perform");
			try {
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Enter the valid option");

			}
			switch (option) {
			case 1:
				System.out.println(run.addElement());
				break;
			case 2:
				System.out.println(run.getSize());
				break;
			case 3:
				try {
					System.out.println(run.indexOf());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println(run.lastIndexOf());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.println(run.addAllUsingIndex());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					System.out.println(run.addFirst());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					System.out.println(run.addLast());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 8:
				try {
					System.out.println(run.addElementUsingIndex());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 9:
				System.out.println(run.remove());
				break;
			case 10:
				try {
					System.out.println(run.removeIndexElement());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 11:
				try {
					System.out.println(run.removeValue());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 12:
				System.out.println(run.removeFirst());
				break;
			case 13:
				try {
					run.offer();
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 14:
				try {
					System.out.println(run.offerFirst());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;

			case 15:
				try {
					System.out.println(run.offerLast());
				} catch (UserException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 16:
				System.out.println(run.peek());
				break;
			case 17:
				System.out.println(run.peekFirst());
				break;
			case 18:
				System.out.println(run.peekLast());
				break;
			case 19:
				System.out.println(run.poll());
				break;
			case 20:
				System.out.println(run.pollFirst());
				break;
			case 21:
				System.out.println(run.pollLast());
				break;
			case 22:
				try {
					System.out.println(run.removeFirstOccurence());
					System.out.println(method.list);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 23:
				try {
					System.out.println(run.removeLastOccurence());
					System.out.println(method.list);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 24:
				try {
					System.out.println(run.removeLast());
					System.out.println(method.list);
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 25:
				System.out.println(run.clear());
				break;

			default:
				value = false;
				System.out.println("Invalid entry");
			}
		}
	}
}
