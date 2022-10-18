import java.util.Scanner;
public class Exercise08 {
    public static int[] locateLargest(double[][] a){
        int[] e ={};
        double f = -Double.MAX_VALUE;
        for(int c = 0; c<a.length;c++){
            for(int d = 0; d<a[c].length;d++){
                if(a[c][d]>f){
                    f=a[c][d];
                    e=new int[]{c,d};
                }
            }
        }
        return e;
    }
}

class TestingExercise08{
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns of the array: ");
        boolean flag = true;
        String value = new Scanner(System.in).nextLine();
        double[][] array = {{}};
        while (flag) {
            if (value.matches("^\\d+\\s\\d+$") && Integer.parseInt(value.split(" ")[0]) != 0 && Integer.parseInt(value.split(" ")[1]) != 0) {
                flag = false;
                array = new double[Integer.parseInt(value.split(" ")[0])][Integer.parseInt(value.split(" ")[1])];
            }else{
                System.out.println("Please enter two positive integers delimited by a single space.");
                value = new Scanner(System.in).nextLine();
            }
        }
        System.out.println("Enter the array:");
        String deci = "-?\\d+[.]?\\d*";
        String space = "\\s";
        for(int x = 0; x<array.length;x++){
            StringBuilder reg = new StringBuilder("^");
            for(int y = 0; y<array[x].length;y++){
                reg.append(deci);
                if(y+1<array[x].length){
                    reg.append(space);
                }
            }
            reg.append("$");
            flag=true;
            while(flag){
                value = new Scanner(System.in).nextLine();
                if(value.matches(reg.toString())){
                    flag = false;
                    String[] values = value.split(" ");
                    for(int y = 0; y < values.length; y++){
                        array[x][y] = Double.parseDouble(values[y]);
                    }
                }else{
                    System.out.println("Please enter " + array[x].length + " decimal numbers.");
                }
            }
        }

        int[] answer = Exercise08.locateLargest(array);
        System.out.println("The location of the largest element is at (" + answer[0] + ", " + answer[1] + ")");
    }
}