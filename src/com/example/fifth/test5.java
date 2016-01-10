package com.example.fifth;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Iryna Borysenko
 * Date: 1/10/16
 */
public class test5 {
    public static int MAX = 100;
    public static int MIN = 1;

    public static void main(String[] args) {
        try {
            System.out.println("Choose way");
            final Scanner choose = new Scanner(System.in);
            final int j = choose.nextInt();
            switch(j) {
                case 1:
                    userGuess();
                    break;
                case 2:
                    computerGuess();
                    break;
                case 3:
                    computerGuessSeven();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed to parse int." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }
    }

    private static void userGuess() {
        try {
            Random rand = new Random();
            final int computerNumber = rand.nextInt((MAX - MIN) + 1) + MIN;
            System.out.println("Guess the number");
            int i = 0, userNumber = 0;
            while (userNumber!= computerNumber) {
                final Scanner in = new Scanner(System.in);
                userNumber = in.nextInt();
                if (userNumber < 1 || userNumber > 100)
                    throw new IllegalArgumentException("Number is out of bounds.");
                else if (userNumber == computerNumber)
                    System.out.println("Congratulations!");
                else if (userNumber < computerNumber)
                    System.out.println("too low");
                else if (userNumber > computerNumber)
                    System.out.println("too high");
                i++;
            }
            System.out.printf("You spent %d times guessing", i);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed to parse int." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }
    }

    private static void computerGuess() {
        try {
            System.out.println("Enter your number(1..100)");
            final Scanner in = new Scanner(System.in);
            final int userNumber = in.nextInt();
            int computerNumber=0;
            Random rand = new Random();
            int i=0;
            while(userNumber !=computerNumber) {
                computerNumber = rand.nextInt((MAX - MIN) + 1) + MIN;
                if(userNumber==computerNumber)
                    System.out.println("Congratulations!");
                else if(userNumber<computerNumber)
                {
                    System.out.printf("%d too high\n",computerNumber);
                    MAX=computerNumber-1;
                }
                else if(userNumber>computerNumber)
                {
                    System.out.printf("%d too low\n",computerNumber);
                    MIN = computerNumber+1;
                }
                i++;
            }
            System.out.printf("Computer spent %d times guessing", i);
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed to parse int." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }
    }

    private static void computerGuessSeven() {
        try {
            System.out.println("Enter your number(1..100)");
            final Scanner in = new Scanner(System.in);
            final int userNumber = in.nextInt();
            int computerNumber=0;
            int i=0;
            while(userNumber !=computerNumber) {
                computerNumber=(MAX + MIN) >> 1;
                if(userNumber==computerNumber)
                    System.out.println("Congratulations!");
                else if(userNumber<computerNumber)
                {
                    System.out.printf("%d too high\n",computerNumber);
                    MAX=computerNumber-1;
                }
                else if(userNumber>computerNumber)
                {
                    System.out.printf("%d too low\n",computerNumber);
                    MIN = computerNumber+1;
                }
                i++;
            }
            System.out.printf("Computer spent %d times guessing", i);
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed to parse int." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }
    }
}