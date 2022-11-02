import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1101Test {

    @Test
    void test1() {
        double inputSide1 = 1.0d;
        double inputSide2 = 1.5d;
        double inputSide3 = 1.0d;
        boolean inputFilled = true;
        String inputColor = "yellow";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 1.0 side2 = 1.5 side3 = 1.0";
        double solutionArea = 0.49607837082461076d;
        boolean solutionFilled = true;
        String solutionColor = "yellow";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test2() {
        double inputSide1 = 36.0670787435228d;
        double inputSide2 = 43.220504594497754d;
        double inputSide3 = 19.68338098694682d;
        boolean inputFilled = false;
        String inputColor = "Orange";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 36.0670787435228 side2 = 43.220504594497754 side3 = 19.68338098694682";
        double solutionArea = 352.10527218547696d;
        boolean solutionFilled = false;
        String solutionColor = "Orange";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test3() {
        double inputSide1 = 30.59450447493469d;
        double inputSide2 = 73.40883318905288d;
        double inputSide3 = 79.25385413848393d;
        boolean inputFilled = false;
        String inputColor = "Green";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 30.59450447493469 side2 = 73.40883318905288 side3 = 79.25385413848393";
        double solutionArea = 1122.9002756049379d;
        boolean solutionFilled = false;
        String solutionColor = "Green";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test4() {
        double inputSide1 = 98.53429463596774d;
        double inputSide2 = 47.00523281258344d;
        double inputSide3 = 91.45722280275938d;
        boolean inputFilled = false;
        String inputColor = "Blue";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 98.53429463596774 side2 = 47.00523281258344 side3 = 91.45722280275938";
        double solutionArea = 2138.5807038310963d;
        boolean solutionFilled = false;
        String solutionColor = "Blue";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test5() {
        double inputSide1 = 55.439356069910396d;
        double inputSide2 = 43.641954393920756d;
        double inputSide3 = 15.915513919737933d;
        boolean inputFilled = true;
        String inputColor = "Indigo";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 55.439356069910396 side2 = 43.641954393920756 side3 = 15.915513919737933";
        double solutionArea = 261.1833617721963d;
        boolean solutionFilled = true;
        String solutionColor = "Indigo";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test6() {
        double inputSide1 = 90.90711883607841d;
        double inputSide2 = 78.02787319686911d;
        double inputSide3 = 27.31401665518447d;
        boolean inputFilled = true;
        String inputColor = "Purple";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 90.90711883607841 side2 = 78.02787319686911 side3 = 27.31401665518447";
        double solutionArea = 1003.8968999967553d;
        boolean solutionFilled = true;
        String solutionColor = "Purple";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test7() {
        double inputSide1 = 68.26763087535403d;
        double inputSide2 = 62.018952128938544d;
        double inputSide3 = 39.24791405588225d;
        boolean inputFilled = false;
        String inputColor = "Black";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 68.26763087535403 side2 = 62.018952128938544 side3 = 39.24791405588225";
        double solutionArea = 1203.4370406089347d;
        boolean solutionFilled = false;
        String solutionColor = "Black";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test8() {
        double inputSide1 = 80.18018343270131d;
        double inputSide2 = 10.997202314218468d;
        double inputSide3 = 78.46520503649758d;
        boolean inputFilled = true;
        String inputColor = "Gray";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 80.18018343270131 side2 = 10.997202314218468 side3 = 78.46520503649758";
        double solutionArea = 429.79124478885853d;
        boolean solutionFilled = true;
        String solutionColor = "Gray";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test9() {
        double inputSide1 = 77.86164279828888d;
        double inputSide2 = 27.44042235509101d;
        double inputSide3 = 56.42689298117507d;
        boolean inputFilled = true;
        String inputColor = "White";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 77.86164279828888 side2 = 27.44042235509101 side3 = 56.42689298117507";
        double solutionArea = 563.04396342902d;
        boolean solutionFilled = true;
        String solutionColor = "White";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }


    @Test
    void test10() {
        double inputSide1 = 45.283140036747604d;
        double inputSide2 = 55.216487117325684d;
        double inputSide3 = 74.83795581736885d;
        boolean inputFilled = true;
        String inputColor = "Cyan";

        String solutionGODate = new Date().toString().split(":")[0];
        String solutionTri = "Triangle: side1 = 45.283140036747604 side2 = 55.216487117325684 side3 = 74.83795581736885";
        double solutionArea = 1243.8905911555826d;
        boolean solutionFilled = true;
        String solutionColor = "Cyan";
        test(inputSide1, inputSide2, inputSide3, inputFilled, inputColor, solutionGODate, solutionTri, solutionArea, solutionFilled, solutionColor);
    }

    private void test(double inputSide1, double inputSide2, double inputSide3, boolean inputFilled, String inputColor, String solutionGODate, String solutionTri, double solutionArea, boolean solutionFilled, String solutionColor) {
        Triangle tester = Exercise11_01.constructTester();

        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Triangle tester2 = Exercise11_01.constructTester();
            tester2.setSide1(inputSide1);
            tester2.setSide2(inputSide2);
            tester2.setSide3(inputSide3);
            tester2.setColor(inputColor);
            tester2.setFilled(inputFilled);

            tester2.getArea();
        });

        tester.setSide1(inputSide1);
        tester.setSide2(inputSide2);
        tester.setSide3(inputSide3);
        tester.setColor(inputColor);
        tester.setFilled(inputFilled);
        if(solutionFilled){
            assertTrue(tester.isFilled());
        }else{
            assertFalse(tester.isFilled());
        }

        assertEquals(solutionGODate,tester.getDateCreated().toString().split(":")[0]);

        assertEquals(solutionTri, tester.toString());
        assertEquals(solutionArea, tester.getArea());
        assertEquals(solutionColor, tester.getColor());



        tester = Exercise11_01.constructTester(inputSide1,inputSide2,inputSide3);
        tester.setColor(inputColor);
        tester.setFilled(inputFilled);
        if(solutionFilled){
            assertTrue(tester.isFilled());
        }else{
            assertFalse(tester.isFilled());
        }
        assertEquals(solutionTri, tester.toString());
        assertEquals(solutionArea, tester.getArea());
        assertEquals(solutionColor, tester.getColor());
    }
}