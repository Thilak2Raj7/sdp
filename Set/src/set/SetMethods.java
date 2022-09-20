//$Id$
package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {

	Set<Object> set = new HashSet<Object>();
	Set<Object> list = new HashSet<Object>();

	public Set<Object> addElement(int value) {
		set.add(value);
		return set;
	}

	public Set<Object> addAllElements() {
		addCollection();
		set.addAll(list);
		return set;

	}

	public Set<Object> addCollection() {
		list.add(1);
		list.add(10);
		list.add(100);
		return list;
	}

	public boolean contains(int value) {
		return set.contains(value);
	}

	public boolean containsAllElement() {
		return set.containsAll(list);
	}

	public Object removeElement(int value) {
		return set.remove(value);
	}

	public int getSize() {
		return set.size();
	}

	public Iterator<Object> iterateElement() {
		Iterator<Object> iterate = set.iterator();
		return iterate;

	}

	public Set<Object> clear() {
		set.clear();
		return set;
	}

	public boolean checkEmpty() {
		return set.isEmpty();
	}

	public Set<Object> removeAllElements() {

		addCollection();
		set.removeAll(list);
		return set;
	}

	public Set<Object> retainAllElements() {
		addCollection();
		set.retainAll(list);
		return set;
	}

}
