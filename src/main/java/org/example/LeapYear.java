package org.example;

import java.util.Scanner;

public class LeapYear {
    int year;
    Scanner scanner;

    public void FindYear(){

        scanner = new Scanner(System.in);
        System.out.printf("Enter a year : ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.printf("the year is Leap", year);
    } else {
        System.out.printf("the year is not Leap", year);
    }
}
}
