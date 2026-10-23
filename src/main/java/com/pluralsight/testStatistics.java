package com.pluralsight;

import java.util.Arrays;

public class testStatistics {
    public static void main(String[] args) {
        int score[] = {20, 60, 10, 40, 79, 67, 99, 84, 56, 80};
        int sum = 0;
        double average;
        int max = Arrays.stream(score).max().orElse(0);
        int min = Arrays.stream(score).min().orElse(0);

        for (int num : score){
            sum += num;
        }

        average = (double) sum / score.length;

        System.out.println("The numbers stored in the array is: " + Arrays.toString(score));
        System.out.println("Average is: " + average);
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

        Arrays.sort(score);
        System.out.println("Sorted: " + Arrays.toString(score));

        double L = score.length;

        /*
        if (L % 2 != 0){
            double median = L / 2;
            System.out.println(average + " Compared to the median " + median);
        }
        else {
           double twoMedians = (((L-1)/2) + (L/2)) / 2;
            System.out.println(average + " Compared to the median " + twoMedians);
        }

        System.out.println();
         */
    }
}
