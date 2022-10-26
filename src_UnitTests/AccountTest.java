import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {
    private static class SolutionObject{
        public int id;
        public String balance;
        public String monthlyInterest;

        public SolutionObject(int id, double balance, double monthlyInterest) {
            this.id = id;
            this.balance = Double.toString(balance);
            this.monthlyInterest = Double.toString(monthlyInterest);
        }
    }

    @Test
    void testDefault() {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Account tester = new Account();
            Account.setAnnualInterestRate(0.0d);
            tester.deposit(400.d);
            tester.withdraw(200.d);
            tester.getMonthlyInterest();
        });
        Account tester = new Account();
        assertEquals(0,tester.getID());
        assertEquals("0.0",tester.getBalance());
        assertEquals("0.0",tester.getMonthlyInterest());
        assertEquals(0.0d, Account.getMonthlyInterestRate());
        tester.deposit(400.0d);
        assertEquals(0,tester.getID());
        assertEquals("400.0",tester.getBalance());
        assertEquals("0.0",tester.getMonthlyInterest());
        tester.withdraw(200.0d);
        assertEquals(0,tester.getID());
        assertEquals("200.0",tester.getBalance());
        assertEquals(new Date().toString().split(":")[0], tester.getDateCreated().split(":")[0]);
        tester.setID(1122);
        assertEquals(1122,tester.getID());
    }

    @Test
    void test1() {
        int inputID = 1122;
        double inputBalance = 20000d;
        Account.setAnnualInterestRate(4.5);
        double[] inputAccountMod = {-2500.0d, 3000.0d};
        SolutionObject[] solution = {
                new SolutionObject(1122, 20000d, 75d),
                new SolutionObject(1122, 17500d, 65.625d),
                new SolutionObject(1122, 20500d, 76.875d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test2() {
        int inputID = 20207;
        double inputBalance = 57600.85d;
        Account.setAnnualInterestRate(1.66d);
        double[] inputAccountMod = {-33.14d,-18.3d,-27.65d,-15.81d,-66.29d,-75.24d,-76.2d,-61.17d,-40.06d,-24.08d};
        SolutionObject[] solution = {
                new SolutionObject(20207,57600.85d,79.681175833333d),
                new SolutionObject(20207,57567.71d,79.635332166667d),
                new SolutionObject(20207,57549.41d,79.610017166667d),
                new SolutionObject(20207,57521.76d,79.571768000000d),
                new SolutionObject(20207,57505.95d,79.549897500000d),
                new SolutionObject(20207,57439.66d,79.458196333333d),
                new SolutionObject(20207,57364.42d,79.354114333333d),
                new SolutionObject(20207,57288.22d,79.248704333333d),
                new SolutionObject(20207,57227.05d,79.164085833333d),
                new SolutionObject(20207,57186.99d,79.108669500000d),
                new SolutionObject(20207,57162.91d,79.075358833333d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test3() {
        int inputID = 58165;
        double inputBalance = 12307.62d;
        Account.setAnnualInterestRate(0.58d);
        double[] inputAccountMod = {-12.03d,-83.97d,-69.19d,-88.94d,-54.06d,-7.59d,-56.82d,-49.46d,-87.92d,-52.85d};
        SolutionObject[] solution = {
                new SolutionObject(58165,12307.62d,5.948683000000d),
                new SolutionObject(58165,12295.59d,5.942868500000d),
                new SolutionObject(58165,12211.62d,5.902283000000d),
                new SolutionObject(58165,12142.43d,5.868841166667d),
                new SolutionObject(58165,12053.49d,5.825853500000d),
                new SolutionObject(58165,11999.43d,5.799724500000d),
                new SolutionObject(58165,11991.84d,5.796056000000d),
                new SolutionObject(58165,11935.02d,5.768593000000d),
                new SolutionObject(58165,11885.56d,5.744687333333d),
                new SolutionObject(58165,11797.64d,5.702192666667d),
                new SolutionObject(58165,11744.79d,5.676648500000d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test4() {
        int inputID = 24600;
        double inputBalance = 57638.73d;
        Account.setAnnualInterestRate(3.18d);
        double[] inputAccountMod = {-5.53d,-52.94d,-28.15d,-51.39d,986.86d,352.01d,-3.92d,-58.16d,247.77d,-47.7d};
        SolutionObject[] solution = {
                new SolutionObject(24600,57638.73d,152.742634500000d),
                new SolutionObject(24600,57633.2d,152.727980000000d),
                new SolutionObject(24600,57580.26d,152.587689000000d),
                new SolutionObject(24600,57552.11d,152.513091500000d),
                new SolutionObject(24600,57500.72d,152.376908000000d),
                new SolutionObject(24600,58487.58d,154.992087000000d),
                new SolutionObject(24600,58839.59d,155.924913500000d),
                new SolutionObject(24600,58835.67d,155.914525500000d),
                new SolutionObject(24600,58777.51d,155.760401500000d),
                new SolutionObject(24600,59025.28d,156.416992000000d),
                new SolutionObject(24600,58977.58d,156.290587000000d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test5() {
        int inputID = 39827;
        double inputBalance = 98052.2d;
        Account.setAnnualInterestRate(7.92d);
        double[] inputAccountMod = {617.42d,293.87d,-14.25d,-53d,-66.6d,-84.16d,-11.73d,-9.05d,-15.11d,-15.19d};
        SolutionObject[] solution = {
                new SolutionObject(39827,98052.2d,647.144520000000d),
                new SolutionObject(39827,98669.62d,651.219492000000d),
                new SolutionObject(39827,98963.49d,653.159034000000d),
                new SolutionObject(39827,98949.24d,653.064984000000d),
                new SolutionObject(39827,98896.24d,652.715184000000d),
                new SolutionObject(39827,98829.64d,652.275624000000d),
                new SolutionObject(39827,98745.48d,651.720168000000d),
                new SolutionObject(39827,98733.75d,651.642750000000d),
                new SolutionObject(39827,98724.7d,651.583020000000d),
                new SolutionObject(39827,98709.59d,651.483294000000d),
                new SolutionObject(39827,98694.4d,651.383040000000d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test6() {
        int inputID = 62750;
        double inputBalance = 59118.91d;
        Account.setAnnualInterestRate(5.59d);
        double[] inputAccountMod = {-63.95d,543.45d,-58.24d,-48.72d,-31.49d,-12.37d,-31.57d,-87.55d,-63.96d,-54.09d};
        SolutionObject[] solution = {
                new SolutionObject(62750,59118.91d,275.395589083333d),
                new SolutionObject(62750,59054.96d,275.097688666667d),
                new SolutionObject(62750,59598.41d,277.629259916667d),
                new SolutionObject(62750,59540.17d,277.357958583333d),
                new SolutionObject(62750,59491.45d,277.131004583333d),
                new SolutionObject(62750,59459.96d,276.984313666667d),
                new SolutionObject(62750,59447.59d,276.926690083333d),
                new SolutionObject(62750,59416.02d,276.779626500000d),
                new SolutionObject(62750,59328.47d,276.371789416667d),
                new SolutionObject(62750,59264.51d,276.073842416667d),
                new SolutionObject(62750,59210.42d,275.821873166667d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test7() {
        int inputID = 19173;
        double inputBalance = 30398.29d;
        Account.setAnnualInterestRate(4.12d);
        double[] inputAccountMod = {-74.95d,-48.55d,-66.67d,-58.8d,-33.43d,-57.79d,-16.25d,-38.27d,-35.99d,-10.08d};
        SolutionObject[] solution = {
                new SolutionObject(19173,30398.29d,104.367462333333d),
                new SolutionObject(19173,30323.34d,104.110134000000d),
                new SolutionObject(19173,30274.79d,103.943445666667d),
                new SolutionObject(19173,30208.12d,103.714545333333d),
                new SolutionObject(19173,30149.32d,103.512665333333d),
                new SolutionObject(19173,30115.89d,103.397889000000d),
                new SolutionObject(19173,30058.1d,103.199476666667d),
                new SolutionObject(19173,30041.85d,103.143685000000d),
                new SolutionObject(19173,30003.58d,103.012291333333d),
                new SolutionObject(19173,29967.59d,102.888725666667d),
                new SolutionObject(19173,29957.51d,102.854117666667d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test8() {
        int inputID = 63781;
        double inputBalance = 35164.38d;
        Account.setAnnualInterestRate(7.74d);
        double[] inputAccountMod = {-8.31d,-71.19d,-43.15d,-47.97d,-42.44d,-58d,-89.24d,-70.09d,-28.48d,-58.69d};
        SolutionObject[] solution = {
                new SolutionObject(63781,35164.38d,226.810251000000d),
                new SolutionObject(63781,35156.07d,226.756651500000d),
                new SolutionObject(63781,35084.88d,226.297476000000d),
                new SolutionObject(63781,35041.73d,226.019158500000d),
                new SolutionObject(63781,34993.76d,225.709752000000d),
                new SolutionObject(63781,34951.32d,225.436014000000d),
                new SolutionObject(63781,34893.32d,225.061914000000d),
                new SolutionObject(63781,34804.08d,224.486316000000d),
                new SolutionObject(63781,34733.99d,224.034235500000d),
                new SolutionObject(63781,34705.51d,223.850539500000d),
                new SolutionObject(63781,34646.82d,223.471989000000d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test9() {
        int inputID = 78365;
        double inputBalance = 45905.45d;
        Account.setAnnualInterestRate(7.13d);
        double[] inputAccountMod = {731.7d,847.21d,-60.3d,-9.76d,-47.25d,-24.49d,-47.19d,-22.65d,450.46d,633.61d};
        SolutionObject[] solution = {
                new SolutionObject(78365,45905.45d,272.754882083333d),
                new SolutionObject(78365,46637.15d,277.102399583333d),
                new SolutionObject(78365,47484.36d,282.136239000000d),
                new SolutionObject(78365,47424.06d,281.777956500000d),
                new SolutionObject(78365,47414.3d,281.719965833333d),
                new SolutionObject(78365,47367.05d,281.439222083333d),
                new SolutionObject(78365,47342.56d,281.293710666667d),
                new SolutionObject(78365,47295.37d,281.013323416667d),
                new SolutionObject(78365,47272.72d,280.878744666667d),
                new SolutionObject(78365,47723.18d,283.555227833333d),
                new SolutionObject(78365,48356.79d,287.319927250000d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }

    @Test
    void test10() {
        int inputID = -45445;
        double inputBalance = 200d;
        Account.setAnnualInterestRate(9.5d);
        double[] inputAccountMod = {-47.1d,-63.11d,-44.98d,-84.54d,-72.33d,-64.12d,476.17d,-43.74d,930.75d,-18.82d};
        SolutionObject[] solution = {
                new SolutionObject(-45445,200d,1.583333333333d),
                new SolutionObject(-45445,152.9d,1.210458333333d),
                new SolutionObject(-45445,89.79d,0.710837500000d),
                new SolutionObject(-45445,44.81d,0.354745833333d),
                new SolutionObject(-45445,-39.73d,-0.314529166667d),
                new SolutionObject(-45445,-112.06d,-0.887141666667d),
                new SolutionObject(-45445,-176.18d,-1.394758333333d),
                new SolutionObject(-45445,299.99d,2.374920833333d),
                new SolutionObject(-45445,256.25d,2.028645833333d),
                new SolutionObject(-45445,1187d,9.397083333333d),
                new SolutionObject(-45445,1168.18d,9.248091666667d)
        };
        test(inputID, inputBalance, inputAccountMod, solution);
    }


    private void test(int inputID, double inputBalance, double[] inputAccountMod, SolutionObject[] solution) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Account tester = new Account(inputID, inputBalance);
            for (double mod: inputAccountMod) {
                if(mod>=0){
                    tester.deposit(mod);
                }else{
                    tester.withdraw(-mod);
                }
            }
            tester.getMonthlyInterest();
        });
        Account tester = new Account(inputID, inputBalance);
        DecimalFormat dfB = new DecimalFormat("#.##");
        DecimalFormat dfMI = new DecimalFormat("#.#######");
        dfMI.setRoundingMode(RoundingMode.HALF_UP);
        assertEquals(solution[0].id, tester.getID());
        assertEquals(dfB.format(Double.parseDouble(solution[0].balance)), dfB.format(Double.parseDouble(tester.getBalance())));
        assertEquals(dfMI.format(Double.parseDouble(solution[0].monthlyInterest)), dfMI.format(Double.parseDouble(tester.getMonthlyInterest())));
        for (int c = 0; c < inputAccountMod.length; c++) {
            if(inputAccountMod[c]>=0){
                tester.deposit(inputAccountMod[c]);
            }else{
                tester.withdraw(-inputAccountMod[c]);
            }
            assertEquals(dfB.format(Double.parseDouble(solution[c+1].balance)), dfB.format(Double.parseDouble(tester.getBalance())));
            assertEquals(dfMI.format(Double.parseDouble(solution[c+1].monthlyInterest)),  dfMI.format(Double.parseDouble(tester.getMonthlyInterest())));
        }
    }
}