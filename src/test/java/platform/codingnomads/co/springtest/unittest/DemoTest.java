package platform.codingnomads.co.springtest.unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void multiply() {
        Demo demo = new Demo();
        assertEquals(4, demo.multiply(2,2));
        assertNotEquals(6, demo.multiply(3,3));
    }
}