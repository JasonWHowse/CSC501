import java.util.Scanner;
public class Exercise05_41 {
    private int[] numberArray;
    private int maxInt;
    private int maxIntOccurrence;

    public Exercise05_41(){
        this.numberArray = new int[]{};
        this.maxInt = 0;
        this.maxIntOccurrence = 0;
    }

    public Exercise05_41(String input){
        this(Exercise05_41.convertString(input));
    }

    public Exercise05_41(int[] numberArray) {
        this.setNumberArray(numberArray);
    }

    public int getMaxInt() {
        return maxInt;
    }

    public int getMaxIntOccurrence() {
        return maxIntOccurrence;
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = numberArray;
        this.calculateValues();
    }

    public void calculateValues(){
        this.maxInt = (numberArray.length == 0)? 0 : Integer.MIN_VALUE;
        this.maxIntOccurrence = 0;
        for (int num: this.numberArray) {
            if(num>this.maxInt){
                this.maxInt=num;
                this.maxIntOccurrence=1;
            }else if(num==this.maxInt){
                this.maxIntOccurrence++;
            }
        }
    }

    public static int[] convertString(String input){
        if(input.trim().length() == 0){
            return new int[]{};
        }
        String[] inputArray = input.trim().split("[\\s]+");
        int[] outputArray = new int[inputArray.length];
        for(int c = 0; c<inputArray.length;c++){
            outputArray[c] = Integer.parseInt(inputArray[c]);
        }
        return outputArray;
    }

    @Override
    public String toString() {
        return "The largest number is " + this.maxInt + "\r\nThe occurrence count of the largest number is " + this.maxIntOccurrence;
    }
}

class TestingExercise05_41{
    public static void main(String[] args) {
        StringBuilder concatVal = new StringBuilder();
        System.out.print("Enter numbers: ");
        int[] valIntArr = {};
        while(valIntArr.length==0 || valIntArr[valIntArr.length-1] != 0){
            String value = new Scanner(System.in).nextLine();
            if(value.matches("^(-?[\\d\\s])*$") && !value.matches("^(\\d+-?[\\d\\s])*$")){
                concatVal.append(" ").append(value);
            }else{
                System.out.println("Invalid Entry please enter only integers\r\nEnter numbers: ");
            }
            valIntArr = Exercise05_41.convertString(concatVal.toString());
        }
        System.out.println(new Exercise05_41(valIntArr));
    }
}