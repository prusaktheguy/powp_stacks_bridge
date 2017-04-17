package edu.kis.vh.stacks.implementation;

/**
 * Created by Prusak on 2017-04-17.
 */
public interface StackInterface {
//zmiana zmiennej jest dokonywana tylko raz dzieki przeniesieniu jej do interfejsu
    int EMPTY_STACK_INDICATOR = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
