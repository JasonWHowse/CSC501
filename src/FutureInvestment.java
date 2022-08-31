import java.text.DecimalFormat;
import java.util.Scanner;

public class FutureInvestment {

    private double investmentAmount;
    private double monthlyInterestRate;
    private int numberOfYears;

    private Double futureInvestmentValue = null;

    public FutureInvestment(){
        investmentAmount = 0d;
        monthlyInterestRate = 0d;
        numberOfYears = 0;
    }

    public FutureInvestment(double investmentAmount, double annualInterestRate, int numberOfYears) {
        this.setInvestmentAmount(investmentAmount);
        this.setAnnualInterestRate(annualInterestRate);
        this.setNumberOfYears(numberOfYears);
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.setMonthlyInterestRate(annualInterestRate/1200d);
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public String getFutureInvestmentValue()  {
        if(this.futureInvestmentValue == null){
            return "Value not calculated yet";
        }
        return new DecimalFormat("#.##").format(this.futureInvestmentValue);
    }

    public void calculateFutureInvestment()  {
        this.futureInvestmentValue=this.investmentAmount*Math.pow((1+this.monthlyInterestRate),(this.numberOfYears*12));
    }
}

class Testing  {
    public static void main(String[] args) {
        FutureInvestment FI = new FutureInvestment();
        boolean flag = true;
        while (flag) {
            System.out.print("Enter investment amount: ");
            String value  = new Scanner(System.in).next();
            if (value.matches("^\\$?\\d*(\\.\\d{0,2})?$")){
                flag=false;
                FI.setInvestmentAmount(Double.parseDouble(value.charAt(0)=='$'?value.substring(1):value));
            }else{
                System.out.println("Please enter a valid monetary value EG: $1000.25.");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Enter annual interest rate: ");
            String value  = new Scanner(System.in).next();
            if (value.matches("^\\d*(\\.\\d*)?%?$")){
                flag=false;
                FI.setAnnualInterestRate(Double.parseDouble(value.charAt(value.length()-1)=='%'?value.substring(0,value.length()-1):value));
            }else{
                System.out.println("Please enter a valid interest rate EG: 4.25%.");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Enter number of years: ");
            String value  = new Scanner(System.in).next();
            if (value.matches("^\\d*$")){
                flag=false;
                FI.setNumberOfYears(Integer.parseInt(value));
            }else{
                System.out.println("Please enter a valid number of years EG: 17.");
            }
        }
        FI.calculateFutureInvestment();
        System.out.println("Accumulated value is $" + FI.getFutureInvestmentValue());
    }
}
