package FillingStation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillingStationTest {

    @Test
    @DisplayName("To Test That Object Exist")
    void testThatObjectExist(){
        FillingStation oando = new FillingStation("Sabo");
        assertNotNull(oando);
    }

    @Test
    @DisplayName("To Test That we can buy 4L of Fuel and get Discount")
    void toTestThatWeCanBuyFuel(){
        FillingStation oando = new FillingStation("Yaba");
        oando.buyFuel(4);
        assertEquals(784 , oando.getAmount());
    }

    @Test
    @DisplayName("to test that we can buy 3l of fuel and get discount")
    public void TestThatWeCanBuyFuel(){
        FillingStation oando = new FillingStation("Badore");
        oando.buyFuel(7);
        assertEquals(1372, oando.getAmount());


    }

}
