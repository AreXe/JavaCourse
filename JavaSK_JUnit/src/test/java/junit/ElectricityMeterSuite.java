package junit;

import junit.electricity.ElectricityMeterTest;
import junit.electricity.TwoElectricityMetersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElectricityMeterSuite {
}
