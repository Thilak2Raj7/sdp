//$Id$
package stack;

import java.util.Stack;

public class StackLogic {

	Stack<Object> stack = new Stack<Object>();

	public Object peek() throws UserException {
		checkStack();
		return stack.peek();

	}

	public void checkStack() throws UserException {
		if (checkEmpty()) {
			throw new UserException("Stack is Empty");
		}
	}

	public Object pop() throws UserException {
		checkStack();
		return stack.pop();
	}

	public Stack<Object> push(String element) {

		stack.push(element);
		return stack;
	}

	public Object search(String element) {

		return stack.search(element);
	}

	public boolean checkEmpty() {
		return stack.empty();
	}
}
