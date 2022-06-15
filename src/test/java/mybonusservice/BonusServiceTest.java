package mybonusservice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.testng.annotations.Test;

public class BonusServiceTest {


    @ParameterizedTest
    @CsvSource

    public void test (int amaunt, boolean isRegistred, int expected ) {

        BonusService service = new BonusService();

        int actual = (int) service.calculate(amaunt, isRegistred);


        //        int expected = 30;

        
//        Assertions    ( expected, actual);




    }

//    private void Assertions(int expected, int actual) {
//    }

//    @Test
//    public void shouldCalculateBonusIfBigAmountAndRegistered() {
//
//        BonusService service = new BonusService();
//
//        int actual = (int) service.calculate(2_000_000, true);
//        int expected = 500;
//
//    }
//
//    @Test
//    public void YouShouldCalculateTheBonusIfTheAmountIsSmallAndNotRegistered() {
//
//        BonusService service = new BonusService();
//
//        int actual = (int) service.calculate(1_500, false);
//        int expected = 15;
//
//
//
//    }
//
//    @Test
//    public void youShouldCalculateTheBonusIfTheAmountIsBigAndNotRegistered() {
//
//        BonusService service = new BonusService();
//
//        int actual = (int) service.calculate(55_000, false);
//        int expected = 500;
//
//
//    }


}




