import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        try {
            System.out.printf("%10.2e");
        } catch (Exception err){
            System.out.println("%10.2e");
            System.out.println(err);
        }
        try {
            System.out.printf("%8.2d");
        } catch (Exception err){
            System.out.println("%8.2d");
            System.out.println(err);
        }
        try {
            System.out.printf("%10b");
        } catch (Exception err){
            System.out.println("%10b");
            System.out.println(err);
        }
        try {
            System.out.printf("%4c");
        } catch (Exception err){
            System.out.println("%4c");
            System.out.println(err);
        }
        try {
            System.out.printf("%6d");
        } catch (Exception err){
            System.out.println("%6d");
            System.out.println(err);
        }


    }
    public void testingmethod(){

    }
}
