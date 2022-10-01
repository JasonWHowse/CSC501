import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class Exercise0631Test {

    @Test
    void test1() {
        long input = 4388576018402626L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test2() {
        long input = 4388576018410707L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test3() {
        long input = 4246345689049834L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test4() {
        long input = 374245455400126L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test5() {
        long input = 378282246310005L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test7() {
        long input = 3566000020000410L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test8() {
        long input = 3530111333300000L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test9() {
        long input = 5425233430109900L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test10() {
        long input = 2222420000001110L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test11() {
        long input = 2223000048410010L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test12() {
        long input = 5895626746595650L;
        boolean solution = true;
        test(input, solution);
    }

    @Test
    void test13() {//test negative correct length
        long input = -520053398955711L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test14() {//test negative wrong length
        long input = -546L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test15() {//test short
        long input = 546L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test16() {//test long
        long input = 603488326561989000L;
        boolean solution = false;
        test(input, solution);
    }

    @Test
    void test17() {//testing 0
        long input = 0L;
        boolean solution = false;
        test(input, solution);
    }

    private void test(long input, boolean solution) {
        if (solution) {
            Assertions.assertTimeout(Duration.ofSeconds(3), () -> assertTrue(Exercise06_31.isValidCreditCard(input)));
        } else {
            Assertions.assertTimeout(Duration.ofSeconds(3), () -> assertFalse(Exercise06_31.isValidCreditCard(input)));
        }
    }
}