package junit.electricity;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

class ElectricityMeterTestJU5 {

    static ElectricityMeter electricityMeter;
    static TariffProvider tp;

    @BeforeAll
    public static void setUp() {
        tp = Mockito.mock(TariffProvider.class);
        electricityMeter = new ElectricityMeter(tp);
        electricityMeter.setTariffOn(true);
    }

    @Test
    public void givenTariffOnWhenAdditionThenKwhIncreased() {
        //given
        Mockito.when(tp.isTariffNow()).thenReturn(true);
        //when
        electricityMeter.addKwh(30);
        //then
        Assumptions.assumeTrue(tp.isTariffNow()); //dynamic ignore
        Assertions.assertEquals(30, electricityMeter.getKwhTariff());
    }

    @Test
    public void givenNoTariffPriceShouldReturnArithmeticExceptionForGettingHowMoreExpensiveNormalIs() {
        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            //given = setUp()
            electricityMeter.setCentsForKwh(90);
            //when
            electricityMeter.getHowMoreExpensiveNormalIs();
            //then -> expected exception
        });

        Assertions.assertEquals(exception.getMessage(), "/ by zero");
    }

    @Disabled("For test use")
    @Test
    public void throwArithmeticException() {
        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException("Error!");
        });

        Assertions.assertEquals(exception.getMessage(), "Error!");
    }

    @RepeatedTest(value = 100, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Test repeated for 100 times")
    public void givenMuchAdditionsWhenAdditionThenNoTariffChange(RepetitionInfo repetitionInfo) {
        //given
        Mockito.when(tp.isTariffNow()).thenReturn(false);
        //when
        electricityMeter.addKwh(30);
        //then
        Assertions.assertEquals(repetitionInfo.getCurrentRepetition() * 30, electricityMeter.getKwh());
        Assertions.assertAll("Testing tariff",
                () -> Assertions.assertEquals(electricityMeter.getKwhTariff(), 0),
                () -> Assertions.assertTrue(electricityMeter.getKwh() % 30 == 0)
                );
    }
}