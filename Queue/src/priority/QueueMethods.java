//$Id$
package priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

	Queue<Object> queue = new PriorityQueue<Object>();

	public void add(int value) {
		queue.add(value);

	}

	public int getSize() {
		return queue.size();

	}

	public boolean contains(int element) {
		return queue.contains(element);
	}

	public Object peek() {
		return queue.peek();

	}

	public Object pollElement() {
		return queue.poll();
	}

	public Queue<Object> offerElement(int element) {
		queue.offer(element);
		return queue;
	}

	public Object removeElement(int element) {
		return queue.remove(element);
	}

	public void clearQueue() {
		queue.clear();
	}

	public boolean emptyQueue() {
		return queue.isEmpty();
	}

	public void checkEmpty() throws Exception {
		if (emptyQueue()) {
			throw new Exception("Queue is empty");
		}
	}

	public Object remove() throws Exception {
		checkEmpty();
		return queue.remove();
	}

	public Object retreiveElement() throws Exception {
		checkEmpty();
		return queue.element();
	}
}
