package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

    //Enacapsulate Fields ustawiło zmienną na prywatną oraz dodało gettery i settery do niej jak również odpowiednie użycia (intellij)
    private Stack temp = new Stack();

    @Override
    public int pop() {
        while (!isEmpty())

            getTemp().push(super.pop());

        int ret = getTemp().pop();

        while (!getTemp().isEmpty())

            push(getTemp().pop());

        return ret;
    }

    public Stack getTemp() {
        return temp;
    }

    public void setTemp(Stack temp) {
        this.temp = temp;
    }
}
