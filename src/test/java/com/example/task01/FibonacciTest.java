package com.example.task01;

import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-07-10.
 */
public class FibonacciTest {

    Fibonacci fibtest = new Fibonacci();

    @Test
    public void zeroAsInput(){
        assertEquals(0,fibtest.fibonacci(0));
    }

    @Test
    public void oneAsInput(){
        assertEquals(1, fibtest.fibonacci(1));
    }

    @Test
    public void getFibResult(){
        assertEquals(2, fibtest.fibonacci(3));
    }

    @Test
    public void negativeNumber(){
        assertEquals(0, fibtest.fibonacci(0));
    }

}