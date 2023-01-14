package com.heller.interpreter;

import org.junit.Test;

public class EvaluatorTest {

    @Test
    public void test() {
        Evaluator eval = new Evaluator();
        float result = eval.evaluator("5 2 + 3 -");
        System.out.println(result);
    }

}
