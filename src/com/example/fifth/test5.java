package com.example.fifth;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Iryna Borysenko Date: 1/10/16
 */

/**
 * to be honest, I didn't write a lot of console apps
 * but maybe it's possible to reuse Scanner object, since
 * it accepts same System.in InputStream
 *
 * *****
 *
 * much better, but divide code to blocks for better readability
 */
public class test5 {
  public static /*final*/ int MAX = 100; // const must be final and also private (except global constants)
  public static /*final*/ int MIN = 1;

  public static void main(String[] args) {
    try {
      System.out.println("Choose way");
      final Scanner choose = new Scanner(System.in);

      // why "j"? Unreadable name
      final int j = choose.nextInt();
      switch (j) {
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

      // add some new lines. Do not make wall of the code
      // divide code to logical blocks
      // I leave this untouched
      final Random rand = new Random(); // final
      final int computerNumber = rand.nextInt((MAX - MIN) + 1) + MIN;
      System.out.println("Guess the number");
      int i = 0, userNumber = 0;
      while (userNumber != computerNumber) {
        final Scanner in = new Scanner(System.in);
        userNumber = in.nextInt();
        if (userNumber < 1 || userNumber > 100) // here you have to use constants instead of 1 and 100
          throw new IllegalArgumentException("Number is out of bounds."); // good
        else if (userNumber == computerNumber)
          System.out.println("Congratulations!");
        else if (userNumber < computerNumber)
          System.out.println("too low");
        else if (userNumber > computerNumber)
          System.out.println("too high");
        i++; // this cycle can be written this way:
        // for(int i = 0; userNumber != computerNumber; i++)
        // maybe it's more beautiful
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
      System.out.println("Enter your number(1..100)"); // here you can use format and constants kinda:
      // System.out.printf("Enter your number(%d..%d)", MIN, MAX); // and if you change bounds, your condition changes too
      final Scanner in = new Scanner(System.in);
      final int userNumber = in.nextInt();
      int computerNumber = 0;
      final Random rand = new Random(); // final, also group variables, swap this line with top one
      int i = 0; // combine this with "computerNumber"
      while (userNumber != computerNumber) {
        computerNumber = rand.nextInt((MAX - MIN) + 1) + MIN;
        if (userNumber == computerNumber)
          System.out.println("Congratulations!");
        else if (userNumber < computerNumber) {
          System.out.printf("%d too high\n", computerNumber);
          MAX /* :( */ = computerNumber - 1; // huh, the worst sin I've ever seen. CAPS_LOCK_VARIABLES must be CAPS_LOCK_CONSTANTS
        } else if (userNumber > computerNumber) {
          System.out.printf("%d too low\n", computerNumber);
          MIN = computerNumber + 1; // never do this again
          // it makes code unreadable
          // everyone, who sees CAPS_LOCK expects const
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
      int computerNumber = 0;
      int i = 0;
      // could be:
      // int computerNumber = 0, i = 0;
      while (userNumber != computerNumber) {
        computerNumber = (MAX + MIN) >> 1;
        if (userNumber == computerNumber)
          System.out.println("Congratulations!");
        else if (userNumber < computerNumber) {
          System.out.printf("%d too high\n", computerNumber);
          MAX = computerNumber - 1; // :(
        } else if (userNumber > computerNumber) {
          System.out.printf("%d too low\n", computerNumber);
          MIN = computerNumber + 1; // :(
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