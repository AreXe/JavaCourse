package junit.electricity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityMeterTest {

    @Test
    public void addKwh_newMeter_properAddition() {
        //given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        //when
        electricityMeter.addKwh(1);
        //then
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void forNewMeterAddingFewKwhShouldReturnProperValue() {
        //given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        //when
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(5);
        electricityMeter.addKwh(2);
        //then
        Assert.assertTrue(electricityMeter.getKwh() == 8);
    }

    @Test(expected = ArithmeticException.class)
    public void givenNoTariffPriceShouldReturnArithmeticExceptionForGettingHowMoreExpensiveNormalIs() {
        //given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        //when
        electricityMeter.getHowMoreExpensiveNormalIs();
        //then -> expected exception
    }
}