package com.dtxmaker;

public class FizzBuzz3 extends AbstractFizzBuzz {

    public FizzBuzz3(int to) {
        super(to);
    }

    public FizzBuzz3(int from, int to) {
        super(from, to);
    }

    @Override
    protected String fizzBuzz(int number) {
        String text = "";
        text += (number % FIZZ == 0) ? FIZZ_TEXT : "";
        text += (number % BUZZ == 0) ? BUZZ_TEXT : "";
        text = text.isEmpty() ? String.valueOf(number) : text;
        return text;
    }
}
