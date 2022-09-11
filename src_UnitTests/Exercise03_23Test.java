import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Exercise03_23Test {
    @Test
    public void test1(){
        double width = 0.0d;
        double height = 0.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 0.0d;
        double y1 = 0.0d;
        boolean solution = true;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest1(){
        double width = 0.0d;
        double height = 0.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 0.0d;
        double y1 = 0.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test2(){
        double width = 10.0d;
        double height = 5.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 2.0d;
        double y1 = 2.0d;
        boolean solution = true;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest2(){
        double width = 10.0d;
        double height = 5.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 2.0d;
        double y1 = 2.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test3(){
        double width = 10.0d;
        double height = 5.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 6.0d;
        double y1 = 4.0d;
        boolean solution = false;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest3(){
        double width = 10.0d;
        double height = 5.0d;
        double x = 0.0d;
        double y = 0.0d;
        double x1 = 6.0d;
        double y1 = 4.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test4(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 3.0d;
        double y1 = 6.0d;
        boolean solution = true;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest4(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 3.0d;
        double y1 = 6.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test5(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 3.0d;
        double y1 = 7.0d;
        boolean solution = false;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest5(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 3.0d;
        double y1 = 7.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test6(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 4.0d;
        double y1 = 6.0d;
        boolean solution = false;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void timeTest6(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 4.0d;
        double y1 = 6.0d;
        timeTest(width,height,x,y,x1,y1);
    }

    @Test
    public void test7(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = 3.0d;
        double y1 = -7.0d;
        boolean solution = false;
        test(width,height,x,y,x1,y1, solution);
    }

    @Test
    public void test8(){
        double width = 2.0d;
        double height = 4.0d;
        double x = 2.0d;
        double y = 4.0d;
        double x1 = -3.0d;
        double y1 = 6.0d;
        boolean solution = false;
        test(width,height,x,y,x1,y1, solution);
    }

    private void timeTest(double width, double height, double x, double y, double x1, double y1) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Exercise03_23 pir = new Exercise03_23(width, height, x, y);
            pir.isWithinRectangle(x1, y1);
        });
    }

    private void test(double width, double height, double x, double y, double x1, double y1, boolean solution) {
        Exercise03_23 pir = new Exercise03_23(width, height, x, y);
        if (solution) {
            assertTrue(pir.isWithinRectangle(x1, y1));
        } else {
            assertFalse(pir.isWithinRectangle(x1, y1));
        }
    }
}