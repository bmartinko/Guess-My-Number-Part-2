package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a Number between 1-100. I will be able to guess it!");
        int upper = 100;
        int lower = 0;
        String Response;
        boolean correctguess = false;
        while (!correctguess) {
            System.out.println("Is your number " + (upper + lower) / 2 + "? If it is not, is it higher or lower");
            Response = sc.nextLine();
            if (Response.contains("yes")) {
                correctguess = true;
                System.out.println("HaHa! I have guessed your number!");
            } else if (Response.toLowerCase().contains("high")) {
                upper = (upper + lower) / 2;
            } else if (Response.toLowerCase().contains("low")) {
                lower = (upper + lower) / 2 ;
            }

        }
    }
}