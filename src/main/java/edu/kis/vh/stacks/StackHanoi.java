package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackInterface;

public class StackHanoi extends Stack {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public StackHanoi(StackInterface stackInterface) {
        super(stackInterface);
    }
    public StackHanoi() {
        super();
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            totalRejected++;
        else
            super.push(in);
    }
}
