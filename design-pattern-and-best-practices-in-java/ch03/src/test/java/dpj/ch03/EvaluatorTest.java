package dpj.ch03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dpj.ch03.interpreter.Evaluator;

/**
 * 解释器模式 实现 表达式计算
 */
class EvaluatorTest {

    @Test
    void testEvaluate() {
        Evaluator evaluator = new Evaluator();

        Assertions.assertEquals(2, evaluator.evaluate("1 3 + 2 -"));

        Assertions.assertEquals(3, evaluator.evaluate("3 1 - 1 +"));
    }

}
