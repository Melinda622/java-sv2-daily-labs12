package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    StringStatistics stat=new StringStatistics();

    @Test
    void testCountLetters(){
        assertEquals(1,stat.countLetters("hello").get('h'));
        assertEquals(1,stat.countLetters("hello").get('e'));
        assertEquals(2,stat.countLetters("hello").get('l'));
        assertEquals(1,stat.countLetters("hello").get('o'));
    }
}