package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_INDICATOR = -1;
	private Node last;


	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
