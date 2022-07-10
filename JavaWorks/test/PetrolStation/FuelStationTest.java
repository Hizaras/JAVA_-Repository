package PetrolStation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelStationTest {
    @Test //("Test that we can buy fuel")
    public void ToTestThatFuelCanBePurchased(){
        FuelStation mobil = new FuelStation();
        mobil.purchase(3);
        assertEquals(570, mobil.getBalance());

    }



}