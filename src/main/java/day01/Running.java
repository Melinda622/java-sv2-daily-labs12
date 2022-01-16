package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {

    public List<String> fileReader(Path path) {
        List<String> output = new ArrayList<>();
        path = Paths.get("src/test/resources/running.csv");

        try {
            output = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }

    public double calculateDistance(int year, int month) {
        Path path = Paths.get("src/test/resources/running.csv");
        String[] a;

        LocalDate date = null;
        Double sum = 0.0;

        for (int i = 1; i < fileReader(path).size(); i++) {

            a = fileReader(path).get(i).split(";");

            date = LocalDate.parse(a[1]);

            if (date.getYear() == year && date.getMonth().getValue() == month) {

                sum += Double.parseDouble(a[0].substring(0, 4).trim());
            }

        }
        return sum;
    }
}
