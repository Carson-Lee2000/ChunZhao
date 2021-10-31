package com.lks.scanner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input something");
        if (scanner.hasNext()) {
            String string = new String(scanner.next());
            System.out.println(string);
        }

//        if (scanner.hasNextLine()) {
//            String string = scanner.nextLine();
//            System.out.println(string);
//        }
        scanner.close();
    }
}
