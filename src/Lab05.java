import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = input.nextInt();

//        while(number!=0){
//            System.out.print(number%10);
//            number/=10;
//        }
        Lab05.ReverseInteger(number);
    }

    public static void ReverseInteger(int number){
        while(number!=0){
            System.out.print(number%10);
            number/=10;
        }
    }
}
