package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>(List.of(
                new Box(13, 21, 44, 100),
                new Box(10, 20, 45, 140),
                new Box(13, 20, 46, 110),
                new Box(16, 25, 44, 120),
                new Box(16, 25, 43, 110),
                new Box(18, 23, 41, 140),
                new Box(12, 29, 42, 150)
        ));
        float avg = 0f;

        for (Box box : boxes) {
            avg += box.mass()/ (float) boxes.size();
        }

        System.out.println(avg);

        for (Box box : boxes) {
            if (box.mass()>avg) {
                System.out.println(box + "!!!");
            }
        }

        Collections.sort(boxes, Collections.reverseOrder());
        boxes.forEach(System.out::println);
    }

}
