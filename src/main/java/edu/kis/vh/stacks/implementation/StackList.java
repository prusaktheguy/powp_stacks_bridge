package edu.kis.vh.stacks.implementation;

public class StackList implements StackInterface{

	private Node last;




	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}



	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
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
