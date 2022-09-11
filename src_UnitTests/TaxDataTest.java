import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxDataTest {
    @Test
    public void test(){
        TaxData td = new TaxDataInfo().taxData;
        int[][] value = {{10,8350,16700,8350,11950},{15,33950,67900,33950,45500},{25,82250,137050,68525,117450},{28,171550,208850,104425,190200},{33,372950,372950,186475,372950},{35,-1,-1,-1,-1}};
        for(int i = 0; i<6; i++){
            assertEquals(value[i][0],td.getRate());
            assertEquals(value[i][1],td.getSingleMaxAmt());
            assertEquals(value[i][1],td.getMaxAmt(Exercise03_13.filingStatus.SINGLE));
            assertEquals(value[i][2],td.getMarriedJointlyMaxAmt());
            assertEquals(value[i][2],td.getMaxAmt(Exercise03_13.filingStatus.MARRIED_FILING_JOINTLY));
            assertEquals(value[i][3],td.getMarriedSepMaxAmt());
            assertEquals(value[i][3],td.getMaxAmt(Exercise03_13.filingStatus.MARRIED_FILING_SEPARATE));
            assertEquals(value[i][4],td.getHeadMaxAmt());
            assertEquals(value[i][4],td.getMaxAmt(Exercise03_13.filingStatus.HEAD_OF_HOUSEHOLD));
            td = td.getNextRate();
        }
    }
}
