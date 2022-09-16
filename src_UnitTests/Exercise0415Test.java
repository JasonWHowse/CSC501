import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise0415Test {
    Exercise04_15 keypads = new Exercise04_15();

    @Test
    public void testLowerCase(){
        String[] num = {"2", "2", "2", "3", "3", "3", "4", "4", "4", "5", "5", "5", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "9", "9", "9", "9"};
        int index = 0;
        for(char i = 'a'; i<='z';i++){
            assertEquals(num[index++],keypads.conversion(""+i));
        }
    }

    @Test
    public void testLowerCaseTimeTest(){
        String[] num = {"2", "2", "2", "3", "3", "3", "4", "4", "4", "5", "5", "5", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "9", "9", "9", "9"};
        for(char i = 'a'; i<='z';i++){
            final char j = i;
            Assertions.assertTimeout(Duration.ofSeconds(3),()->{
                Exercise04_15 keypads = new Exercise04_15();
                keypads.conversion(""+j);
            });
        }
    }

    @Test
    public void testUpperCase(){
        String[] num = {"2", "2", "2", "3", "3", "3", "4", "4", "4", "5", "5", "5", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "9", "9", "9", "9"};
        int index = 0;
        for(char i = 'A'; i<='Z';i++){
            assertEquals(num[index++],keypads.conversion(""+i));
        }
    }

    @Test
    public void testUpperCaseTimeTest(){
        String[] num = {"2", "2", "2", "3", "3", "3", "4", "4", "4", "5", "5", "5", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "9", "9", "9", "9"};
        for(char i = 'A'; i<='Z';i++){
            final char j = i;
            Assertions.assertTimeout(Duration.ofSeconds(3),()->{
                Exercise04_15 keypads = new Exercise04_15();
                keypads.conversion(""+j);
            });
        }
    }

    @Test
    public void test1(){
        String testValue = "JasonHowse";
        String solution = "5276646973";
        this.test(testValue, solution);
    }

    @Test
    public void testTime1(){
        String testValue = "JasonHowse";
        this.testTime(testValue);
    }

    @Test
    public void test2(){
        String testValue = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        String solution =  "2222223333334444445555556666667777777788888899999999";
        this.test(testValue, solution);
    }

    @Test
    public void testTime2(){
        String testValue = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        this.testTime(testValue);
    }


    private void test(String input, String solution){
        assertEquals(solution,keypads.conversion(input));
    }

    private void testTime(String input){
        Assertions.assertTimeout(Duration.ofSeconds(3),()->{
            Exercise04_15 keypads = new Exercise04_15();
            keypads.conversion(input);
        });
    }
}