package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {
//używam intellij
    //Stack.java 11 linia, usuniecie wciec 14-32 linia
    //stackfifo.java dodane wciecia 11 i 17 linia
    //stackhanoi.java 5 oraz 12 i 13 linia dodane wciecia

    //alt strzałka powoduje przeskakiwanie po aktualnie wyswietlonych plikach (intellij))
    public static void main(String[] args) {

        DefaultStacksFactory factory = new DefaultStacksFactory();
        ListStacksFactory listfactory = new ListStacksFactory();
        ArrayStacksFactory arrayfactory = new ArrayStacksFactory();
        testStacks(factory);
        testStacks(listfactory);
        testStacks(arrayfactory);

    }

    private static void testStacks(IStacksFactory factory) {

        //12 linia usuniecie spacji
        Stack[] stacks = {factory.getStandardStack(), factory.getFalseStack(),
                factory.getFIFOStack(), factory.getHanoiStack()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            System.out.println();
        }
//19-27 poprawa wciecia
        System.out.println("total rejected is "
                + ((StackHanoi) stacks[3]).reportRejected());
    }


}