public class TaxDataInfo{
    public final TaxData taxData = new TaxData(10, 8350, 16700, 8350, 11950);
    public TaxDataInfo(){
        TaxData nextTaxData = new TaxData(15, 33950, 67900, 33950, 45500);
        TaxData head = nextTaxData;
        taxData.setNextRate(nextTaxData);
        nextTaxData = new TaxData(25, 82250, 137050,68525,117450);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(28, 171550,208850,104425,190200);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(33, 372950, 372950, 186475, 372950);
        head.setNextRate(nextTaxData);
        head = nextTaxData;
        nextTaxData = new TaxData(35);
        head.setNextRate(nextTaxData);
    }
}