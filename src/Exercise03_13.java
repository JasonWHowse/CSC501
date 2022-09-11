import java.util.Scanner;
public class Exercise03_13 {
    public enum filingStatus{
        SINGLE,
        MARRIED_FILING_JOINTLY,
        MARRIED_FILING_SEPARATE,
        HEAD_OF_HOUSEHOLD
    }

    private filingStatus status;
    private TaxData exercise0313;
    private double taxableIncome;

    public Exercise03_13(TaxData exercise0313) {
        this.exercise0313 = exercise0313;
        this.taxableIncome = 0.0d;
    }

    public void setStatus(filingStatus status) {
        this.status = status;
    }

    public void setStatus(int status) {
        switch (status){
            case 0:
                this.status = filingStatus.SINGLE;
                break;
            case 1:
                this.status = filingStatus.MARRIED_FILING_JOINTLY;
                break;
            case 2:
                this.status = filingStatus.MARRIED_FILING_SEPARATE;
                break;
            case 3:
                this.status = filingStatus.HEAD_OF_HOUSEHOLD;
                break;
            default:
                break;
        }
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTaxes(){
        double currentTaxes = 0.0d;
        double lastMax = 0.0d;
        boolean flag = true;
        while(flag){
            flag = this.exercise0313.hasNext();
            double currentMax = this.exercise0313.getMaxAmt(status);
            if(!flag || currentMax>this.taxableIncome){
                currentTaxes += (this.taxableIncome-lastMax)*(this.exercise0313.getRate()/100d);
                flag = false;
            }else{
                currentTaxes += (currentMax-lastMax)*(this.exercise0313.getRate()/100d);
                lastMax = currentMax;
            }
            this.exercise0313 = this.exercise0313.getNextRate();
        }
        return currentTaxes;
    }
}

class TestingTaxes {
    public static void main(String[] args) {
        TaxData exercise0313 = new TaxData(10, 8350, 16700, 8350, 11950);
        TaxData nextExercise0313 = new TaxData(15, 33950, 67900, 33950, 45500);
        TaxData head = nextExercise0313;
        exercise0313.setNextRate(nextExercise0313);
        nextExercise0313 = new TaxData(25, 82250, 137050, 68525, 117450);
        head.setNextRate(nextExercise0313);
        head = nextExercise0313;
        nextExercise0313 = new TaxData(28, 171550, 208850, 104425, 190200);
        head.setNextRate(nextExercise0313);
        head = nextExercise0313;
        nextExercise0313 = new TaxData(33, 372950, 372950, 186475, 372950);
        head.setNextRate(nextExercise0313);
        head = nextExercise0313;
        nextExercise0313 = new TaxData(35);
        head.setNextRate(nextExercise0313);

        Exercise03_13 taxes = new Exercise03_13(exercise0313);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the filing status: ");
            String value = new Scanner(System.in).next();
            if (value.matches("^[0-3]$")) {
                flag = false;
                taxes.setStatus(Integer.parseInt(value));
            } else {
                System.out.println("Please enter a valid status");
            }
        }
        flag = true;
        while (flag) {
            System.out.print("Enter the taxable income: ");
            String value = new Scanner(System.in).next();
            if (value.matches("^\\$?\\d*(\\.\\d{0,2})?$")){
                taxes.setTaxableIncome(Double.parseDouble(value.charAt(0)=='$'?value.substring(1):value));
                flag=false;
            } else {
                System.out.println("Please enter taxable income EG: $1000.25.");
            }
        }
        System.out.println("Tax is: " + taxes.calculateTaxes());
    }
}