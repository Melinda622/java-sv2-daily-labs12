package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running = new Running();
    Path path = Paths.get("src/test/resources/running.csv");

    @Test
    void testCalculateDistance(){
        running.fileReader(path);
        assertEquals(41.2,running.calculateDistance(2021,12));
    }

}