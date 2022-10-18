import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int[][] values = {{3,4,5,1}, {33,6,1,2}};

        int v = values[0][0];
        for(int[] list : values)
            for(int element: list)
                if(v>element)
                    v=element;
        System.out.println(v);
        char[][][] charArray = new char[2][2][];
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

    public static int recursionMethod(int a){
        if(a==-1){
            return -1;
        }
        System.out.print(a+ ", ");
        return recursionMethod(a-1);
    }
}