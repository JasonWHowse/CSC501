import java.util.Scanner;

public class Exercise06_31 {
    public static boolean isValidCreditCard(long creditCard){
        int digitCount = 0;
        int output = 0;
        while(creditCard > 0){
            if(++digitCount%2==0){
                output+=Exercise06_31.splitAdd(creditCard%10);
            }else{
                output+=creditCard%10;
            }
            creditCard/=10;
        }
        return  Exercise06_31.lengthCheck(digitCount) && output%10==0;
    }

    public static long splitAdd(long input){
        return ((input*2)%10)+((input*2)/10);
    }

    public static boolean lengthCheck(int length){
        return length <= 16 && length >= 13;
    }
}

class TestingExercise06_31{
    public static void main(String[] args) {
        System.out.print("Enter a credit card number as a long integer: ");
        String value = new Scanner(System.in).nextLine();
        if (value.matches("^\\d*$") && Exercise06_31.lengthCheck(value.length())) {
            System.out.println(value + (Exercise06_31.isValidCreditCard(Long.parseLong(value)) ? " is valid" : " is invalid"));
        } else {
            System.out.println(value + " is invalid");
        }
    }
}
