package Assignment.Aircondition1.Airconditioner;

import Assignment.Airconditioner.Airconditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirconditionerTest {
    private Airconditioner airconditioner;
    @BeforeEach

    public void initiateTesting(){
         airconditioner = new Airconditioner();

    }

    @Test
     public void test_isOn() {
        airconditioner.IsOn("on");
         Assertions.assertNotNull(airconditioner.getIsOn());

    }
    @Test
    public void test_isOff() {
        airconditioner.isOff("off");
        Assertions.assertNotNull(airconditioner.getOff());

    }
    @Test
    public void test_increaseTemperature(){
       int result = airconditioner.increaseTemperature();
        Assertions.assertEquals(19, result);
    }
    @Test
    public void test_increaseTemperatureNotABove30(){
       int result = airconditioner.increaseTemperature();
        Assertions.assertEquals(19, result);
    }
    @Test
    public void test_decreaseTemperature(){
       int result = airconditioner.decreaseTemperature();
        Assertions.assertEquals(17,result);
    }
    @Test
    public void test_decreaseTemperatureNotBelow16(){
       int result = airconditioner.decreaseTemperature();
        Assertions.assertEquals(17,result);
    }

}
