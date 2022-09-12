import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        boolean first, second, third, fourth;
        first = second = third = fourth = true;
        for(int x = -100; x<100; x++){
            for(int y = -100; y<100; y++) {
                first = first && (((x > 0 || x < 10) == ((x > 0) || (x < 10)))) ? true : false;
                second = second && ((x > 0 || x < 10 && y < 0) == (x > 0 || (x < 10 && y < 0))) ? true : false;
                third = third && ((x > 0 && x < 10) == ((x > 0) && (x < 10))) ? true : false;
                fourth = fourth && ((x > 0 || x < 10 && y < 0) == ((x > 0 || x < 10) && y < 0)) ? true : false;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

    public void testingmethod(){

    }
}
