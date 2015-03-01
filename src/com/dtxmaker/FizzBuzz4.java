package com.dtxmaker;

public class FizzBuzz4 extends AbstractFizzBuzz {
    private static final int FIZZ_BIT = 1;
    private static final int BUZZ_BIT = 2;

    public FizzBuzz4(int to) {
        super(to);
    }

    public FizzBuzz4(int from, int to) {
        super(from, to);
    }

    @Override
    protected String fizzBuzz(int number) {
        int bit = 0;
        bit = bit | (number % FIZZ == 0 ? FIZZ_BIT : 0);
        bit = bit | (number % BUZZ == 0 ? BUZZ_BIT : 0);

        switch (bit) {
            case FIZZ_BIT:
                return FIZZ_TEXT;
            case BUZZ_BIT:
                return BUZZ_TEXT;
            case FIZZ_BIT + BUZZ_BIT:
                return FIZZ_BUZZ_TEXT;
            default:
                return String.valueOf(number);
        }
    }
}
