//$Id$
package link;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListMethods {
	LinkedList<Object> list = new LinkedList<Object>();

	public void checkIndex(int index) throws UserException {
		int size = size();
		if (index >= size || index < 0) {
			throw new UserException("Index should not greater than size of list and  not less than 0");
		}

	}

	public void checkString(String value) throws UserException {
		if (value.isEmpty() || value == null) {
			throw new UserException("Value should be null or empty");
		}

	}

	public void firstAndLastIndex(int index, int lastIndex) throws UserException {
		if (index > lastIndex) {
			throw new UserException("Index should not greater than last index");
		}
	}

	public void add(String value) {
		list.add(value);

	}

	public LinkedList<Object> newList() {
		return new LinkedList<Object>();
	}

	public void addUsingIndex(int index, String value) throws UserException {
		checkIndex(index);
		checkString(value);
		list.add(index, value);
	}

	public void addFirst(String value) throws UserException {
		checkString(value);
		list.addFirst(value);
	}

	public void addLast(String value) throws UserException {
		checkString(value);
		list.addLast(value);
	}

	public Object getFirst() {
		return list.getFirst();
	}

	public Object getLast() {
		return list.getLast();
	}

	public int size() {
		return list.size();

	}

	public void setElement(int index, String value) throws UserException {
		checkString(value);
		list.set(index, value);
	}

	public int indexOf(String value) throws UserException {
		checkString(value);
		return list.indexOf(value);
	}

	public int lastIndexOf(String value) throws UserException {
		checkString(value);
		return list.lastIndexOf(value);
	}

	public void remove() {
		list.remove();
	}

	public void remove(int index) throws UserException {
		checkIndex(index);
		list.remove(index);
	}

	public void remove(String value) throws UserException {
		checkString(value);
		list.remove(value);

	}

	public Object removeFirst() {
		return list.removeFirst();
	}

	public LinkedList<Object> addAllElements() {
		LinkedList<Object> list1 = newList();
		list.addAll(list1);
		return list1;
	}

	public LinkedList<Object> addAllElements(int index) throws UserException {
		checkIndex(index);
		Collection<String> collection = new ArrayList<String>();
		collection.add("1");
		collection.add("2");
		collection.add("3");

		list.addAll(index, collection);
		return list;
	}

	public void clearList() {
		list.clear();
	}

	public Object peek() {
		return list.peek();

	}

	public Object peekFirst() {
		return list.peekFirst();
	}

	public Object peekLast() {
		return list.peekLast();
	}

	public Object pollElement() {
		return list.poll();
	}

	public Object pollFirst() {
		return list.pollFirst();
	}

	public Object pollLast() {
		return list.pollLast();
	}

	public Object removeLast() {
		return list.removeLast();
	}

	public Object removeFirstOccurence(String value) throws UserException {
		checkString(value);
		return list.removeFirstOccurrence(value);
	}

	public Object removeLastOccurence(String value) throws UserException {
		checkString(value);
		return list.removeLastOccurrence(value);
	}

	public void offer(String value) throws UserException {
		checkString(value);
		list.offer(value);
	}

	public void offerFirst(String value) throws UserException {
		checkString(value);
		list.offer(value);
	}

	public void offerLast(String value) throws UserException {
		checkString(value);
		list.offer(value);
	}
}
