import java.awt.*;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        print("" + findCenter("60.0000  --  83.0000"));
    }

    public static void print(String input){
        System.out.println(input);
    }

    public static <E> E deepClone(E original) {
        E[] decon = (E[]) original;
        E[] copy = decon.clone();
        if (decon[0].getClass().isArray()) {
            for (int i = 0; i < decon.length; i++) {
                copy[i] = deepClone(decon[i]);
            }//for(int i=0;i<decon.length;i++){
        }//if(decon[0].getClass().isArray()){
        E recon = (E) copy;
        return recon;
    }//public static <E> E deepClone (E original){

    public static double findCenter(String input){
        String[] inputs = input.split("  --  ");
        double firstPoint = Double.parseDouble(inputs[0]);
        double secondPoint = Double.parseDouble(inputs[1]);

        return (firstPoint+secondPoint)/2;
    }
}