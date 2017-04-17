package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackInterface;
import edu.kis.vh.stacks.implementation.StackList;

public class StackFIFO extends Stack {

    //Enacapsulate Fields ustawiło zmienną na prywatną oraz dodało gettery i settery do niej jak również odpowiednie użycia (intellij)
    //StackArray jest wydajniejszy a rozmiar nie jest problemem w tym wypadku
    private Stack temp = new Stack( new StackArray());

    public StackFIFO() {
        super();
    }

    public StackFIFO(StackInterface stackInterface) {
        super(stackInterface);

    }

    @Override
    public int pop() {
        while (!isEmpty())

            getTemp().push(super.pop());

        int ret = getTemp().pop();

        while (!getTemp().isEmpty())

            push(getTemp().pop());

        return ret;
    }

    private Stack getTemp() {
        return temp;
    }

    public void setTemp(Stack temp) {
        this.temp = temp;
    }
}
