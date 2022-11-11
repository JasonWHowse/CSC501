import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class Exercise1011Test {

    @Test
    void defaultTest(){
        Circle2D testItemPass = new Circle2D(0.25d, 0.25d, 0.25d);
        Circle2D testItemFail = new Circle2D(3d,3d, 1d);
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Circle2D testCircle2d = new Circle2D();
            testCircle2d.getPerimeter();
            testCircle2d.getArea();
            testCircle2d.contains(testItemPass.getX(), testItemPass.getY());
            testCircle2d.contains(testItemPass);
            testCircle2d.overlaps(testItemPass);
            testCircle2d.contains(testItemFail.getX(), testItemFail.getY());
            testCircle2d.contains(testItemFail);
            testCircle2d.overlaps(testItemFail);
        });

        Circle2D testCircle2d = new Circle2D();
        assertEquals(Math.PI*2d, testCircle2d.getPerimeter());
        assertEquals(Math.PI, testCircle2d.getArea());
        assertTrue(testCircle2d.contains(testItemPass.getX(), testItemPass.getY()));
        assertFalse(testCircle2d.contains(testItemFail.getX(), testItemFail.getY()));

        assertTrue(testCircle2d.contains(testItemPass));
        assertFalse(testCircle2d.contains(testItemFail));

        assertTrue(testCircle2d.overlaps(testItemPass));
        assertFalse(testCircle2d.overlaps(testItemFail));
    }

    @Test
    void test1() {
        double inputX = 2.0d;
        double inputY = 2.0d;
        double inputRadius = 5.5d;
        Circle2D inputCircle2D = new Circle2D(4.0d, 5.0d, 10.5d);

        double solutionGetArea = 95.03317777109123d;
        double solutionGetPerimeter = 34.55751918948772d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test2() {
        double inputX = 2.0d;
        double inputY = 2.0d;
        double inputRadius = 5.5d;
        Circle2D inputCircle2D = new Circle2D(3.0d, 3.0d, 0.0d);

        double solutionGetArea = 95.03317777109123d;
        double solutionGetPerimeter = 34.55751918948772d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = true;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test3() {
        double inputX = 2.0d;
        double inputY = 2.0d;
        double inputRadius = 5.5d;
        Circle2D inputCircle2D = new Circle2D(3.0d, 5.0d, 2.3d);

        double solutionGetArea = 95.03317777109123d;
        double solutionGetPerimeter = 34.55751918948772d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = true;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test4() {
        double inputX = 0.3137322117915957d;
        double inputY = 2.329800175473899d;
        double inputRadius = 11.626374881582517d;
        Circle2D inputCircle2D = new Circle2D(-8.322450290642124d, -9.539123005792252d, 8.536177734138208d);

        double solutionGetArea = 424.6572247807749d;
        double solutionGetPerimeter = 73.05066783172107d;
        boolean solutionContains = false;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test5() {
        double inputX = 7.157883585883958d;
        double inputY = -9.260735931232764d;
        double inputRadius = 14.88502881676907d;
        Circle2D inputCircle2D = new Circle2D(5.935668132736218d, 1.0939438378239164d, 4.380024346487861d);

        double solutionGetArea = 696.064095062745d;
        double solutionGetPerimeter = 93.52539435846816d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = true;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test6() {
        double inputX = 5.253463602935799d;
        double inputY = 7.6892017932695715d;
        double inputRadius = 3.9954314210650543d;
        Circle2D inputCircle2D = new Circle2D(-8.929266551420596d, -1.4531065640763163d, 15.482610206687948d);

        double solutionGetArea = 50.150727116331794d;
        double solutionGetPerimeter = 25.104036000679603d;
        boolean solutionContains = false;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test7() {
        double inputX = -8.643499186565112d;
        double inputY = 0.21715044531371852d;
        double inputRadius = 19.689138368322105d;
        Circle2D inputCircle2D = new Circle2D(-4.101369454438551d, -7.8850169557484495d, 16.587192455838057d);

        double solutionGetArea = 1217.8766243631505d;
        double solutionGetPerimeter = 123.7105049068673d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test8() {
        double inputX = -6.990237749271668d;
        double inputY = -3.8792957885802792d;
        double inputRadius = 16.218894040259165d;
        Circle2D inputCircle2D = new Circle2D(2.227504382558596d, 3.0396273667620743d, 6.875512187448796d);

        double solutionGetArea = 826.4038765584206d;
        double solutionGetPerimeter = 101.90631673245895d;
        boolean solutionContains = true;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test9() {
        double inputX = -3.7796147598732084d;
        double inputY = -6.025260157257264d;
        double inputRadius = 4.064388571910362d;
        Circle2D inputCircle2D = new Circle2D(1.2332574789570838d, 3.786699195718306d, 1.988211877193664d);

        double solutionGetArea = 51.89676846523519d;
        double solutionGetPerimeter = 25.537306557695807d;
        boolean solutionContains = false;
        boolean solutionOverlaps = false;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }

    @Test
    void test10() {
        double inputX = -0.6699157298532157d;
        double inputY = 4.127706731743963d;
        double inputRadius = 0.5013284556508557d;
        Circle2D inputCircle2D = new Circle2D(2.839273579406985d, 2.3423685291493523d, 4.201079920992788d);

        double solutionGetArea = 0.7895771741759697d;
        double solutionGetPerimeter = 3.1499395866164894d;
        boolean solutionContains = false;
        boolean solutionOverlaps = true;
        boolean solutionObjectContains = false;
        test(inputX, inputY, inputRadius, inputCircle2D, solutionGetArea, solutionGetPerimeter, solutionContains, solutionOverlaps, solutionObjectContains);
    }


    private void test(double inputX, double inputY, double inputRadius, Circle2D inputCircle2D, double solutionGetArea, double solutionGetPerimeter, boolean solutionContains, boolean solutionOverlaps, boolean solutionObjectContains) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Circle2D testCircle2d = new Circle2D(inputX,inputY,inputRadius);
            testCircle2d.getPerimeter();
            testCircle2d.getArea();
            testCircle2d.contains(inputCircle2D.getX(), inputCircle2D.getY());
            testCircle2d.contains(inputCircle2D);
            testCircle2d.overlaps(inputCircle2D);
        });

        Circle2D testCircle2d = new Circle2D(inputX,inputY,inputRadius);
        assertEquals(solutionGetPerimeter, testCircle2d.getPerimeter());
        assertEquals(solutionGetArea, testCircle2d.getArea());

        if(solutionContains){
            assertTrue(testCircle2d.contains(inputCircle2D.getX(), inputCircle2D.getY()));
        }else{
            assertFalse(testCircle2d.contains(inputCircle2D.getX(), inputCircle2D.getY()));
        }
        if(solutionObjectContains){
            assertTrue(testCircle2d.contains(inputCircle2D));
        }else{
            assertFalse(testCircle2d.contains(inputCircle2D));
        }
        if(solutionOverlaps){
            assertTrue(testCircle2d.overlaps(inputCircle2D));
        }else {
            assertFalse(testCircle2d.overlaps(inputCircle2D));
        }
    }
}