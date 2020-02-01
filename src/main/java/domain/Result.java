package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Result {
    private ArrayList<String> resultNumber = new ArrayList<>();

    public Result() {
        makeRandomNumber();
        // Test: Number Checking
        for (String each : resultNumber) {
            System.out.println(each);
        }
    }

    private void makeRandomNumber() {
        String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Collections.shuffle(Arrays.asList(numbers));
        for (int i = 0; i<3; i++) {
            resultNumber.add(numbers[i]);
        }
    }
}
