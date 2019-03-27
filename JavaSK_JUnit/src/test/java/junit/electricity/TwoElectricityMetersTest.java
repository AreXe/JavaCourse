package junit.electricity;

import org.junit.Assert;
import org.junit.Test;

public class TwoElectricityMetersTest {

    @Test
    public void forNewMeterAddingFewKwhShouldReturnProperValue() {
        //given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        //when
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(5);
        electricityMeter.addKwh(2);
        electricityMeter1.addKwh(4);
        //then
        Assert.assertTrue(electricityMeter.getKwh() == 8 && electricityMeter1.getKwh() == 4);
    }
}