package AirCondition4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AirCondition4Test {
    Aircodition4 aircodition;

    @BeforeEach
    void setUp(){
        aircodition = new Aircodition4();
    }

    @Test
    @DisplayName (" To test that Ac can be turned on")
    void testThatAcCanBeOn(){
        // when I put it on
        aircodition.isOn(true);
        assertTrue(aircodition.getState());
    }
}