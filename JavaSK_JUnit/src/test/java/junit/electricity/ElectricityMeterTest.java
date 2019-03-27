package junit.electricity;

import org.junit.*;

import static org.junit.Assert.*;

public class ElectricityMeterTest {

    private static ElectricityMeter electricityMeter;

    @BeforeClass
    public static void init() {
        ElectricityMeterTest.electricityMeter = new ElectricityMeter();
    }

    @Before
    public void setUp() {
        //assure to start deterministic environment
        electricityMeter.reset();
    }

    @Test
    public void addKwh_newMeter_properAddition() {
        //given = setUp()
        //when
        electricityMeter.addKwh(1);
        //then
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void forNewMeterAddingFewKwhShouldReturnProperValue() {
        //given = setUp()
        //when
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(5);
        electricityMeter.addKwh(2);
        //then
        Assert.assertTrue(electricityMeter.getKwh() == 8);
    }

    @Test(expected = ArithmeticException.class)
    public void givenNoTariffPriceShouldReturnArithmeticExceptionForGettingHowMoreExpensiveNormalIs() {
        //given = setUp()
        electricityMeter.setCentsForKwh(90);
        //when
        electricityMeter.getHowMoreExpensiveNormalIs();
        //then -> expected exception
    }

    @AfterClass
    public static void release(){
        //release connections...
    }
}