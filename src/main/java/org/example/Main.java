package org.example;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String [] arr = {"A", "B", "C", "D"};
//        Random random = new Random();
//
//        // randomly selects an index from the arr
//        int select = random.nextInt(arr.length);
//
//        // prints out the value at the randomly selected index
//        System.out.println("Random String selected: " + arr[select]);

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("hh:mm a");
        String timestamp = DateFor.format(date);

        SimpleDateFormat hhmm = new SimpleDateFormat("hh:mm");
        String hhhmm = hhmm.format(date);

        String[] result = hhhmm.split(":", 2);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(timestamp.substring(6));
    }
}