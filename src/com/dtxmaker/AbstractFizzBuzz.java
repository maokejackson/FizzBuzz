package com.dtxmaker;

import java.util.Vector;

public abstract class AbstractFizzBuzz {
    protected static final int FIZZ = 3;
    protected static final int BUZZ = 5;
    protected static final int FIZZ_BUZZ = FIZZ * BUZZ;
    protected static final String FIZZ_TEXT = "Fizz";
    protected static final String BUZZ_TEXT = "Buzz";
    protected static final String FIZZ_BUZZ_TEXT = FIZZ_TEXT + BUZZ_TEXT;

    protected final int from;
    protected final int to;

    public AbstractFizzBuzz(int to) {
        this(0, to);
    }

    public AbstractFizzBuzz(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");    // ensure to >= from
        }
        this.from = from;
        this.to = to;
    }

    public void print() {
        System.out.println(getString());
    }

    public String getString() {
        StringBuilder builder = new StringBuilder();
        Vector<String> list = getList();

        // add the first element
        if (!list.isEmpty()) {
            builder.append(list.firstElement());
        }

        // add the rest elements
        for (int index = 1, size = list.size(); index < size; index++) {
            String num = list.get(index);
            builder.append(", ");
            builder.append(num);
        }

        return builder.toString();
    }

    public Vector<String> getList() {
        Vector<String> list = new Vector<String>(to - from + 1);    // create a vector to store result

        for (int i = from; i <= to; i++) {
            list.add(fizzBuzz(i));
        }

        return list;
    }

    protected abstract String fizzBuzz(int number);
}
