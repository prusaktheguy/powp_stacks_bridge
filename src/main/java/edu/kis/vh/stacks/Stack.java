package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackInterface;
import edu.kis.vh.stacks.implementation.StackList;

public class Stack {

    private StackInterface stackInterface;
    private StackList stackList;


    public Stack() {
        this.stackInterface= new StackArray();
    }


    public void push(int i) {
        stackInterface.push(i);
    }

    public boolean isEmpty() {
        return stackInterface.isEmpty();
    }

    public boolean isFull() {
        return stackInterface.isFull();
    }

    public int top() {
        return stackInterface.top();
    }

    public int pop() {
        return stackInterface.pop();
    }

    public Stack(StackInterface stackInterface) {

        this.stackInterface = stackInterface;
    }


}
