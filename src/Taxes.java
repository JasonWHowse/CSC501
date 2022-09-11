import java.util.Scanner;
public class Taxes {
    public enum filingStatus{
        SINGLE,
        MARRIED_FILING_JOINTLY,
        MARRIED_FILING_SEPARATE,
        HEAD_OF_HOUSEHOLD
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

    private filingStatus status;
    private TaxData taxData;
    private double taxableIncome;

    public Taxes(TaxData taxData) {
        this.taxData = taxData;
        this.taxableIncome = 0.0d;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTaxes(){
        double currentTaxes = 0.0d;
        double lastMax = 0.0d;
        boolean flag = true;
        while(flag){
            flag = this.taxData.hasNext();
            double currentMax = this.taxData.getMaxAmt(status);
            if(!flag || currentMax>this.taxableIncome){
                currentTaxes += (this.taxableIncome-lastMax)*(this.taxData.getRate()/100d);
                flag = false;
            }else{
                currentTaxes += (currentMax-lastMax)*(this.taxData.getRate()/100d);
                lastMax = currentMax;
            }
            this.taxData = this.taxData.getNextRate();
        }
        return currentTaxes;
    }
}

class TestingTaxes {
    public static void main(String[] args) {
        TaxData taxData = new TaxData(10, 8350, 16700, 8350, 11950);
        TaxData nextTaxData = new TaxData(15, 33950, 67900, 33950, 45500);
        TaxData head = nextTaxData;
        taxData.setNextRate(nextTaxData);
        nextTaxData = new TaxData(25, 82250, 137050, 68525, 117450);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(28, 171550, 208850, 104425, 190200);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(33, 372950, 372950, 186475, 372950);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(35);
        head.setNextRate(nextTaxData);

        Taxes taxes = new Taxes(taxData);
        System.out.println("Owed Taxes: " + taxes.calculateTaxes());
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
    }
}