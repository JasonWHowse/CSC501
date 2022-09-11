import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TaxesTest {

    @Test
    public void testTime1(){
        int status = 0;
        int amount = 100000;
        timeTest(status,amount);
    }

    @Test
    public void test1(){
        int status = 0;
        int amount = 100000;
        double solution = 21720.0d;
        test(status,amount,  solution);
    }

    @Test
    public void testTime2(){
        int status = 1;
        int amount = 300339;
        timeTest(status,amount);
    }

    @Test
    public void test2(){
        int status = 1;
        int amount = 300339;
        double solution = 76932.87d;
        test(status,amount,  solution);
    }

    @Test
    public void testTime3(){
        int status = 2;
        int amount = 123500;
        timeTest(status,amount);
    }

    @Test
    public void test3(){
        int status = 2;
        int amount = 123500;
        double solution = 29665.5;
        test(status,amount,  solution);
    }

    @Test
    public void testTime4(){
        int status = 3;
        int amount = 4545402;
        timeTest(status,amount);
    }

    @Test
    public void test4(){
        int status = 3;
        int amount = 4545402;
        double solution = 1565250.7;
        test(status,amount,  solution);
    }

    private void timeTest(int status, int amount){
        Assertions.assertTimeout(Duration.ofSeconds(3),()->{
            Taxes taxes = new Taxes((new TaxDataInfo().taxData));
            taxes.setStatus(status);
            taxes.setTaxableIncome(amount);
            taxes.calculateTaxes();
        });
    }

    private void test(int status, int amount, double solution){
        Taxes taxes = new Taxes((new TaxDataInfo().taxData));
        taxes.setStatus(status);
        taxes.setTaxableIncome(amount);
        assertEquals(solution,taxes.calculateTaxes());
    }
}