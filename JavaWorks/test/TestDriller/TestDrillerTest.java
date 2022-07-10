package TestDriller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    TestDriller testDriller;

    @BeforeEach
    void setUp() {
        testDriller = new TestDriller();
    }

    @Test
    @DisplayName("Test that user can buy 1-4 copies for 2000")
    public void testThatUserCanBuyCopies(){
        testDriller.setNoOfCopies(4);
        assertEquals(8000, testDriller.getAmount());
    }

    @Test
    @DisplayName("Test that user can buy more than 5 copies")
    void testThatUserCanBuyMoreThan5Copies() {
        testDriller.setNoOfCopies(5);
        assertEquals(9000, testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy more than 10 copies")
    public  void testThatUserCanBuyMoreThan10Copies(){
        testDriller.setNoOfCopies(12);
        assertEquals(19200,testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy more than 30 copies")
    public void testThatUserCanBuyMoreThan30Copies(){
        testDriller.setNoOfCopies(32);
        assertEquals(48000, testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy up to 55 copies")
    public void testThatCustomerCanBuyUpTo49copies(){
        testDriller.setNoOfCopies(55);
        assertEquals(71500, testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy up to 100 copies")
    public void testThatUserCanBuyUpTo100Copies(){
        testDriller.setNoOfCopies(110);
        assertEquals(132000,testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy up to 200 copies")
    public void testThatUserCanBuyUpTo200Copies(){
        testDriller.setNoOfCopies(210);
        assertEquals(231000, testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy up to 400 copies")
    public void testThatUserCanBuyUpTo500Copies(){
        testDriller.setNoOfCopies(400);
        assertEquals(440000, testDriller.getAmount());
    }
    @Test
    @DisplayName("Test that user can buy more than 500 copies")
    public void testThatUserCanBuyUpTo600Copies(){
        testDriller.setNoOfCopies(600);
        assertEquals(600000, testDriller.getAmount());
    }
}