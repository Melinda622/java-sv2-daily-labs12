package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    MathAlgorithms math= new MathAlgorithms();

    @Test
    void testMutual(){
        assertEquals(3,math.greatestCommonDivisor(6,9));
    }

    @Test
    void testMutual2(){
        assertEquals(3,math.greatestCommonDivisor(12,9));
    }

    @Test
    void testMutual3(){
        assertEquals(2,math.greatestCommonDivisor(12,46));
    }

    @Test
    void testMutual4(){
        assertEquals(5,math.greatestCommonDivisor(15,10));
    }


    @Test
    void testMutual5(){
        assertEquals(6,math.greatestCommonDivisor(6,12));
    }

    @Test
    void testMutual6(){
        assertEquals(1,math.greatestCommonDivisor(13,11));
    }
}