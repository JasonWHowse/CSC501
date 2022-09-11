public class TaxData {
    private final int rate;
    private final int singleMaxAmt;
    private final int marriedJointlyMaxAmt;
    private final int marriedSepMaxAmt;
    private final int headMaxAmt;

    private TaxData nextRate = null;

    public TaxData(int rate, int singleMaxAmt, int marriedJointlyMaxAmt, int marriedSepMaxAmt, int headMaxAmt) {
        this.rate = rate;
        this.singleMaxAmt = singleMaxAmt;
        this.marriedJointlyMaxAmt = marriedJointlyMaxAmt;
        this.marriedSepMaxAmt = marriedSepMaxAmt;
        this.headMaxAmt = headMaxAmt;
    }

    public TaxData(double rate, int singleMaxAmt, int marriedJointlyMaxAmt, int marriedSepMaxAmt, int headMaxAmt) {
        this.rate = (int)(rate<=1?rate*100:rate);
        this.singleMaxAmt = singleMaxAmt;
        this.marriedJointlyMaxAmt = marriedJointlyMaxAmt;
        this.marriedSepMaxAmt = marriedSepMaxAmt;
        this.headMaxAmt = headMaxAmt;
    }

    public TaxData(int rate) {
        this.rate = rate;
        this.singleMaxAmt = -1;
        this.marriedJointlyMaxAmt = -1;
        this.marriedSepMaxAmt = -1;
        this.headMaxAmt = -1;
    }

    public TaxData(double rate) {
        this.rate = (int)(rate<=1?rate*100:rate);
        this.singleMaxAmt = -1;
        this.marriedJointlyMaxAmt = -1;
        this.marriedSepMaxAmt = -1;
        this.headMaxAmt = -1;
    }

    public TaxData getNextRate() {
        return nextRate;
    }

    public void setNextRate(TaxData nextRate) {
        this.nextRate = nextRate;
    }

    public boolean hasNext(){
        return nextRate!=null;
    }

    public int getRate() {
        return rate;
    }

    public int getSingleMaxAmt() {
        return this.singleMaxAmt;
    }

    public int getMarriedJointlyMaxAmt() {
        return this.marriedJointlyMaxAmt;
    }

    public int getMarriedSepMaxAmt() {
        return this.marriedSepMaxAmt;
    }

    public int getHeadMaxAmt() {
        return this.headMaxAmt;
    }

    public int getMaxAmt(Taxes.filingStatus FS){
        switch (FS){
            case SINGLE:
                return this.singleMaxAmt;
            case MARRIED_FILING_JOINTLY:
                return this.marriedJointlyMaxAmt;
            case MARRIED_FILING_SEPARATE:
                return this.marriedSepMaxAmt;
            case HEAD_OF_HOUSEHOLD:
                return this.headMaxAmt;
            default:
                return -1;
        }
    }
}
