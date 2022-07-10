package Assignment.Aircondition1;

import Assignment.Bike.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    public void testThatBikeCanBeOn(){
        //given that I have a bike
        Bike kelechiBike = new Bike();
        //when I put it on
        kelechiBike.isOn(true);
        //check that it is on
        assertTrue(kelechiBike.getOnValue());
    }

    @Test
    public void testThatBikeCanBeOff(){
        //given that I have a bike
        Bike kelechiBike = new Bike();
        //my bike is on
        kelechiBike.isOn(true);
        //when I put it off
        kelechiBike.isOn(false);
        //check that my bike is off
        assertTrue(kelechiBike.getOnValue());
    }
}
