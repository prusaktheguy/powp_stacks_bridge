package edu.kis.vh.stacks;

public class Stack {

    private static final int STACK_SIZE = 12;
    private static final int EMPTY_STACK_INDICATOR = -1;
    private static final int FULL_STACK_INDICATOR = STACK_SIZE -1;
    private int[] items = new int[STACK_SIZE];

    private int total = EMPTY_STACK_INDICATOR;

    public int getTotal() {
        return total;
    }


    public void push(int i) {
        if (!isFull())
            items[++total] = i;
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_STACK_INDICATOR;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return items[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return items[total--];
    }

}
