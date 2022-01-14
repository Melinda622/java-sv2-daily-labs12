package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private List<String> schedules = new ArrayList<>();


    public List<String> read(Path path) {

        // path = Paths.get("src/test/resources/schedule.txt");

        try {
            schedules=Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file");
        }
        return schedules;
    }


    public int returnScheduleOfOneTeacher(String name) {

        int sum=0;

        for (int i = 0; i <schedules.size(); i++) {

            if(schedules.get(i).equals(name)){
                sum+=Integer.parseInt(schedules.get(i+3));
            }

        }
        return sum;
    }
}
