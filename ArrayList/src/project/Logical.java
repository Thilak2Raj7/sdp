//$Id$
package project;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Logical {
	List<Object> arr1 = new ArrayList<Object>();

	public void checkIndex(int index) throws Exception {
		int size = getSize();
		if (index > size || index < 0) {
			throw new Exception("Index should not greater than size of list and  not less than 0");
		}

	}

	public List<Object> add(Object value) {

		arr1.add(value);
		return arr1;
	}

	public Object getValue(int index) throws Exception {
		checkIndex(index);
		return arr1.get(index);
	}

	public boolean containsValue(Object value) {
		return arr1.contains(value);
	}

	public int indexOf(Object value) {

		return arr1.indexOf(value);
	}

	public int lastIndexOf(Object value) {
		return arr1.lastIndexOf(value);
	}

	public List<Object> remove(int index) throws Exception {
		checkIndex(index);
		arr1.remove(index);
		return arr1;
	}

	public List<Object> replace(int index, Object value) throws Exception {
		checkIndex(index);
		arr1.set(index, value);
		return arr1;
	}

	public List<Object> subList(int index, int lastIndex) throws Exception {
		checkIndex(index);
		return arr1.subList(index, lastIndex);
	}

	public int getSize() {
		return arr1.size();
	}

	public List<Object> clear() {
		arr1.clear();
		return arr1;
	}

	public boolean empty() {
		return arr1.isEmpty();
	}

	public List<Object> removeValue(Object value) {
		arr1.remove(value);
		return arr1;
	}

	public ListIterator<Object> iterate() {
		ListIterator<Object> iterate = arr1.listIterator();
		return iterate;
	}

	public List<Object> removeAll() throws InterruptedException {

		List<Object> newList = new ArrayList<Object>();
		newList.add("1");
		newList.add("2");
		newList.add("3");

		arr1.removeAll(newList);

		return arr1;
	}

}
