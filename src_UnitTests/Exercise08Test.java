import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class Exercise08Test {
    @Test
    void test1() {
        double[][] input = {
                { 23.5, 35,  2  , 10   },
                {  4.5,  3, 45  ,  3.5 },
                { 35  , 44,  5.5,  9.6 }
        };
        int[] solution = {1, 2};
        test(input, solution);
    }

    @Test
    void test2(){
        double[][] input = {
                {212,-460,-401,303,-148},
                {47,-427,-341,166,-412},
                {-496,206,428,-163,89},
                {-285,-445,-495,201,43},
                {-316,156,-8,-474,3},
                {-232,86,-207,-273,17},
                {-359,-447,-190,-343,-248},
                {-32,-4,363,219,334}
        };
        int[] solution = {2,2};
        test(input, solution);
    }

    @Test
    void test3(){
        double[][] input = {
                {-241,465,309,230,387,277,-212,-111},
                {89,46,28,-56,281,308,-96,460},
                {-150,-83,283,319,391,109,356,-474},
                {-252,67,-33,-458,-498,-311,497,-29}
        };
        int[] solution = {3, 6};
        test(input, solution);
    }

    @Test
    void test4(){
        double[][] input = new double[1][1];
        input[0][0] = -391.0d;
        int[] solution = {0, 0};
        test(input, solution);
    }

    @Test
    void test5(){
        double[][] input = {
                {-117,142,-411,172,410,-271},
                {396,-318,-343,-364,-221,113},
                {451,264,51,-387,-203,-451},
                {204,-343,188,-304,-401,289},
                {141,341,241,-352,145,140}
        };
        int[] solution = {2, 0};
        test(input, solution);
    }

    @Test
    void test6(){
        double[][] input = {
                {214,436,172,430,357}
        };
        int[] solution = {0, 1};
        test(input, solution);
    }

    @Test
    void test7(){
        double[][] input = {
                {122},
                {-381},
                {-320},
                {-478},
                {-110},
                {379},
                {276},
                {-344},
                {-268}
        };
        int[] solution = {5, 0};
        test(input, solution);
    }

    @Test
    void test8(){
        double[][] input = {
                {-899,-395,-302,-664},
                {-491,-592,-637,-383},
                {-482,-795,-373,-651},
                {-603,-665,-990,-55},
                {-836,-450,-407,-234}
        };
        int[] solution = {3, 3};
        test(input, solution);
    }

    @Test
    void test9(){
        double[][] input = {
                {-358,-98,-566,-867,-857,-564},
                {-626,-430,-372,-799,-863,-98},
                {-578,-423,-478,-719,-795,-115},
                {-811,-577,-244,-85,-117,-810},
                {-867,-586,-789,-646,-66,-311}
        };
        int[] solution = {4, 4};
        test(input, solution);
    }

    @Test
    void test10(){
        double[][] input = {
                {-462,-432,-336,36,-184},
                {366,-404,227,-52,-82},
                {320,-305,-149,194,230},
                {197,-149,269,-149,13},
                {-498,-286,-221,143,37},
                {-306,-240,51,31,152},
                {-426,-406,-42,268,479}
        };
        int[] solution = {6, 4};
        test(input, solution);
    }

    private void test(double[][] input, int[] solution) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> Exercise08.locateLargest(input));

        int[] actual = Exercise08.locateLargest(input);

        assertEquals(solution[0],actual[0]);
        assertEquals(solution[1],actual[1]);
    }
}