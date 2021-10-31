package com.lks.scanner;

import java.util.Scanner;

/**
 * @author lks
 */
public class Average {

    /**
     *
     * @return average
     */
    public static double average() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0f;
        int count = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count += 1;
        }

        return (sum / count);
    }

    public static void main(String[] args) {
        System.out.println(average());
    }
}
