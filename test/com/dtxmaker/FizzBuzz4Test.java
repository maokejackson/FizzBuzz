package com.dtxmaker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz4Test {

    @Test
    public void testPositive() throws Exception {
        assertEquals("FizzBuzz", new FizzBuzz4(0).getString());
        assertEquals("FizzBuzz, 1", new FizzBuzz4(1).getString());
        assertEquals("FizzBuzz, 1, 2", new FizzBuzz4(2).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz", new FizzBuzz4(3).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4", new FizzBuzz4(4).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz", new FizzBuzz4(5).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz", new FizzBuzz4(6).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7", new FizzBuzz4(7).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8", new FizzBuzz4(8).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz", new FizzBuzz4(9).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", new FizzBuzz4(10).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11", new FizzBuzz4(11).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz", new FizzBuzz4(12).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13", new FizzBuzz4(13).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14", new FizzBuzz4(14).getString());
        assertEquals("FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", new FizzBuzz4(15).getString());
    }

    @Test
    public void testNegative() throws Exception {
        assertEquals("FizzBuzz", new FizzBuzz4(0, 0).getString());
        assertEquals("-1, FizzBuzz", new FizzBuzz4(-1, 0).getString());
        assertEquals("-2, -1, FizzBuzz", new FizzBuzz4(-2, 0).getString());
        assertEquals("Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-3, 0).getString());
        assertEquals("-4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-4, 0).getString());
        assertEquals("Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-5, 0).getString());
        assertEquals("Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-6, 0).getString());
        assertEquals("-7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-7, 0).getString());
        assertEquals("-8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-8, 0).getString());
        assertEquals("Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-9, 0).getString());
        assertEquals("Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-10, 0).getString());
        assertEquals("-11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-11, 0).getString());
        assertEquals("Fizz, -11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-12, 0).getString());
        assertEquals("-13, Fizz, -11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-13, 0).getString());
        assertEquals("-14, -13, Fizz, -11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-14, 0).getString());
        assertEquals("FizzBuzz, -14, -13, Fizz, -11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1, FizzBuzz", new FizzBuzz4(-15, 0).getString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() throws Exception {
        new FizzBuzz4(10, 9);
    }

    @Test
    public void testPrint() throws Exception {
        new FizzBuzz4(15, 15).print();
    }
}
