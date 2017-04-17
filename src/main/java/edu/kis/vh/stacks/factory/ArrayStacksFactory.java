package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;

/**
 * Created by Prusak on 2017-04-17.
 */
public class ArrayStacksFactory implements IStacksFactory {
    @Override
    public Stack getStandardStack() {
        return new Stack(new StackArray());
    }

    @Override
    public Stack getFalseStack() {
        return new Stack(new StackList());
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(new StackArray());
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(new StackArray());
    }
}
