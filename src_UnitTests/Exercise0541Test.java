import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise0541Test {

    @Test
    void test1() {
        String input = "3 5 2 5 5 5 0";
        int solutionMax = 5;
        int solutionMaxOcc = 4;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test2() {
        String input = "3 6 5 4 2 4 5 4 5 5 0";
        int solutionMax = 6;
        int solutionMaxOcc = 1;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test3() {
        String input = "0 -5 02 -5 -5 -5 0";
        int solutionMax = 2;
        int solutionMaxOcc = 1;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test4() {
        String input = "";
        int solutionMax = 0;
        int solutionMaxOcc = 0;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test6() {
        String input = "-3 -5 -2 -5 -5 -5 -2 -2";
        int solutionMax = -2;
        int solutionMaxOcc = 3;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test7() {
        String input = "-3 05 -2 -5 5 5";
        int solutionMax = 5;
        int solutionMaxOcc = 3;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void test8() {
        String input = "0 0 0 0 0 0 0";
        int solutionMax = 0;
        int solutionMaxOcc = 7;
        test(input, solutionMax, solutionMaxOcc);
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(0, new Exercise05_41().getMaxInt());
        assertEquals(0, new Exercise05_41().getMaxIntOccurrence());
        assertEquals("The largest number is 0\r\nThe occurrence count of the largest number is 0", new Exercise05_41().toString());
    }

    private void test(String input, int solutionMax, int solutionMaxOcc){
        Assertions.assertTimeout(Duration.ofSeconds(3),()->{
            new Exercise05_41(input);
        });
        Assertions.assertTimeout(Duration.ofSeconds(3),()->{
            Exercise05_41.convertString(input);
        });
        assertEquals(solutionMax, new Exercise05_41(input).getMaxInt());
        assertEquals(solutionMaxOcc, new Exercise05_41(input).getMaxIntOccurrence());
        assertEquals("The largest number is " + solutionMax + "\r\nThe occurrence count of the largest number is " + solutionMaxOcc, new Exercise05_41(input).toString());
    }
}