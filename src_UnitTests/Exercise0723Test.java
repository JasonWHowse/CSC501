import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class Exercise0723Test {
    @Test
    void test1() {
        int studentInput = 1;
        int lockerInput = 1;
        boolean[] solution = {true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test2() {
        int studentInput = 0;
        int lockerInput = 1;
        boolean[] solution = {false};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test3() {
        int studentInput = 2;
        int lockerInput = 10;
        boolean[] solution = {true, false, true, false, true, false, true, false, true, false};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test4() {
        int studentInput = 3;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, false, true, true, true, false, false, false};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test5() {
        int studentInput = 4;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, true, true, true, true, false, false};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test6() {
        int studentInput = 5;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, true, true, true, false, true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test7() {
        int studentInput = 6;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, true, true, false, true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test8() {
        int studentInput = 7;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, false, true, false, true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test9() {
        int studentInput = 8;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, false, false, false, true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test10() {
        int studentInput = 9;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, false, false, true, true};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test11() {
        int studentInput = 10;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, false, false, true, false};
        test(lockerInput, studentInput, solution);
    }

    @Test
    void test12() {
        int studentInput = 11;
        int lockerInput = 10;
        boolean[] solution = {true, false, false, true, false, false, false, false, true, false};
        test(lockerInput, studentInput, solution);
    }

    private void test(int input1, int input2, boolean[] solution) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> Exercise07_23.setLockers(input1, input2));

        assertEquals(solution.length,Exercise07_23.getLockers().length);
        for(int c = 0; c<solution.length; c++){
            assertEquals(solution[c],Exercise07_23.getLockers()[c]);
        }
    }
}