package com.dtxmaker;

public class FizzBuzz2 extends AbstractFizzBuzz {

    public FizzBuzz2(int to) {
        super(to);
    }

    public FizzBuzz2(int from, int to) {
        super(from, to);
    }

    @Override
    protected String fizzBuzz(int number) {
        String fizz = (number % FIZZ == 0) ? FIZZ_TEXT : "";
        String buzz = (number % BUZZ == 0) ? BUZZ_TEXT : "";
        String num = (fizz.isEmpty() && buzz.isEmpty()) ? String.valueOf(number) : "";
        return num + fizz + buzz;
    }
}
