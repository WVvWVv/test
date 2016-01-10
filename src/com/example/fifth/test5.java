package com.example.fifth;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Iryna Borysenko
 * Date: 1/10/16
 */
public class test5 {
    public static void main(String[] args) {
        try {

            Random rand = new Random();
            final int randomNum = rand.nextInt((100 - 1) + 1) + 1;
            System.out.println("Guess the number");
            int i=0,j=0; //как то уж очень криво
            while(j!=randomNum)
            {
                final Scanner in = new Scanner(System.in);
                j = in.nextInt();
                if (j < 1 || j > 100)
                    throw new IllegalArgumentException("Number is out of bounds.");
                else if(j==randomNum)
                    System.out.println("Congratulations!");
                else if (j<randomNum)
                    System.out.println("too low");
                else if (j>randomNum)
                    System.out.println("too high");
                i++;
            }
            System.out.printf("You spent %d times guessing",i);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed to parse int." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }

    }
}

