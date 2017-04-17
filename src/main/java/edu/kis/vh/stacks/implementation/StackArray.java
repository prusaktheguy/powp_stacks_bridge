package edu.kis.vh.stacks.implementation;

/**
 * Created by Prusak on 2017-04-17.
 */
public class StackArray implements StackInterface {

    private static final int STACK_SIZE = 12;
    private static final int FULL_STACK_INDICATOR = STACK_SIZE -1;
    private int[] items = new int[STACK_SIZE];


    private int total = EMPTY_STACK_INDICATOR;

    public int getTotal() {
        return total;
    }


    @Override
    public void push(int i) {
        if (!isFull())
            items[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return total == FULL_STACK_INDICATOR;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return items[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return items[total--];
    }



}
