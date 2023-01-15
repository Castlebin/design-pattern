package dpj.ch05.se01;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class FuncTest {

    @Test
    void testFunction() {
        /*
         * 普通函数
         */
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(1, 2));
    }


    @Test
    void testKeli() {
        /*
         * 5.1.7 柯里化 是将 n 元函数转换为一系列一元函数的过程
         */
        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
        System.out.println(add.apply(1).apply(2));
    }

}
