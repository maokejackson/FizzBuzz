package com.dtxmaker;

public class FizzBuzz1 extends AbstractFizzBuzz {

    public FizzBuzz1(int to) {
        super(to);
    }

    public FizzBuzz1(int from, int to) {
        super(from, to);
    }

    @Override
    protected String fizzBuzz(int number) {
        if (number % FIZZ_BUZZ == 0) {
            return FIZZ_BUZZ_TEXT;
        } else if (number % FIZZ == 0) {
            return FIZZ_TEXT;
        } else if (number % BUZZ == 0) {
            return BUZZ_TEXT;
        } else {
            return String.valueOf(number);
        }
    }
}
