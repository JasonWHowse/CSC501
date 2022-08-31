import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FutureInvestmentTest {

    private static class FITValues{
        public double testInvestmentAmount;
        public double testAnnualInterestRate;
        public int testNumberOfYears;
        public String solution;

        public FITValues(double testInvestmentAmount, double testAnnualInterestRate, int testNumberOfYears, String solution) {
            this.testInvestmentAmount = testInvestmentAmount;
            this.testAnnualInterestRate = testAnnualInterestRate;
            this.testNumberOfYears = testNumberOfYears;
            this.solution = solution;
        }
    }

    FITValues test1 = new FITValues(1000d, 3.25d, 1, "1032.99");

    FITValues test2 = new FITValues(1000d, 4.25d, 1, "1043.34");

    FITValues test3 = new FITValues(1500d, 3.25d, 1, "1549.48");

    FITValues test4 = new FITValues(299999d, 2.5d, 30, "634602.6");

    @Test
    public void test1TimeTrial() {
        testTimeTrial(test1.testInvestmentAmount, test1.testAnnualInterestRate, test1.testNumberOfYears);
    }

    @Test
    public void test1DC() {
        testDC(test1.testInvestmentAmount, test1.testAnnualInterestRate, test1.testNumberOfYears, test1.solution);
    }

    @Test
    public void test13I() {
        test3I(test1.testInvestmentAmount, test1.testAnnualInterestRate, test1.testNumberOfYears, test1.solution);
    }

    @Test
    public void test2TimeTrial() {
        testTimeTrial(test2.testInvestmentAmount, test2.testAnnualInterestRate, test2.testNumberOfYears);
    }

    @Test
    public void test2DC() {
        testDC(test2.testInvestmentAmount, test2.testAnnualInterestRate, test2.testNumberOfYears, test2.solution);
    }

    @Test
    public void test23I() {
        test3I(test2.testInvestmentAmount, test2.testAnnualInterestRate, test2.testNumberOfYears, test2.solution);
    }

    @Test
    public void test3TimeTrial() {
        testTimeTrial(test3.testInvestmentAmount, test3.testAnnualInterestRate, test3.testNumberOfYears);
    }

    @Test
    public void test3DC() {
        testDC(test3.testInvestmentAmount, test3.testAnnualInterestRate, test3.testNumberOfYears, test3.solution);
    }

    @Test
    public void test33I() {
        test3I(test3.testInvestmentAmount, test3.testAnnualInterestRate, test3.testNumberOfYears, test3.solution);
    }

    @Test
    public void test4TimeTrial() {
        testTimeTrial(test4.testInvestmentAmount, test4.testAnnualInterestRate, test4.testNumberOfYears);
    }

    @Test
    public void test4DC() {
        testDC(test4.testInvestmentAmount, test4.testAnnualInterestRate, test4.testNumberOfYears, test4.solution);
    }

    @Test
    public void test43I() {
        test3I(test4.testInvestmentAmount, test4.testAnnualInterestRate, test4.testNumberOfYears, test4.solution);
    }

    @Test
    public void test4Null(){
        assertEquals(new FutureInvestment().getFutureInvestmentValue(), "Value not calculated yet");
    }

    private void testTimeTrial(double testInvestmentAmount, double testMonthlyInterestRate, int testNumberOfYears) {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->new FutureInvestment(testInvestmentAmount, testMonthlyInterestRate, testNumberOfYears).getFutureInvestmentValue());
    }

    private void testDC(double testInvestmentAmount, double testMonthlyInterestRate, int testNumberOfYears, String solution) {
        FutureInvestment fit = new FutureInvestment();
        fit.setInvestmentAmount(testInvestmentAmount);
        fit.setAnnualInterestRate(testMonthlyInterestRate);
        fit.setNumberOfYears(testNumberOfYears);
        fit.calculateFutureInvestment();
        assertEquals(fit.getFutureInvestmentValue(),solution);
    }

    private void test3I(double testInvestmentAmount, double testMonthlyInterestRate, int testNumberOfYears, String solution) {
        FutureInvestment fit =  new FutureInvestment(testInvestmentAmount, testMonthlyInterestRate, testNumberOfYears);
        fit.calculateFutureInvestment();
        assertEquals(fit.getFutureInvestmentValue(),solution);
    }
}