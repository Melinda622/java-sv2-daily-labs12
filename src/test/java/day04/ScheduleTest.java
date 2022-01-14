package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleTest {

    Schedule schedule=new Schedule();
    Path path = Paths.get("src/test/resources/schedule.txt");

    @Test
    void testReturnScheduleOfOneTeacher(){
        schedule.read(path);
        assertEquals(24,schedule.returnScheduleOfOneTeacher("Albatrosz Aladin"));
        assertEquals(22,schedule.returnScheduleOfOneTeacher("Csincsilla Csilla"));
    }

    @Test
    void testRead(){
        assertThrows(IllegalArgumentException.class,()->schedule.read(Paths.get("src/test/resources/schedul.txt")));
    }
}