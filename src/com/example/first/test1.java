package com.example.first;

/**
 * Created by aurora on 12/1/15.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {

  /**
   * you don't need this method to be public, private is enough
   *
   * And JavaDocs. They are also good (not for private methods, but there isn't another example).
   *
   * @param i mark to be converted to the letter
   * @return string representation of mark
   * @see <a href="https://answers.yahoo.com/question/index?qid=20080227174743AASIGmG"> more
   * info</a>
   */
  private /*public*/ static String estimateScore(int i) {
    final String str;
    if (i < 0 || i > 100) {
      /**
       * even if there is just a single line
       * it's a good practice to place curly brackets
       */

      /**
       * try to avoid empty exceptions
       * always provide enough info to understand, why exception was occurred
       */

      /**
       * try to use built-in exceptions
       * some of them describe situation better, than simple Runtime one
       * but, for sure, Runtime is common for almost every situation
       */
      throw new /*RuntimeException*/IllegalArgumentException(/*right here*/ "Number is out of bounds.");
    } else if (i < 60) {
      str = "F";
    } else if (i < 70) {
      str = "D";
    } else if (i < 80) {
      str = "C";
    } else if (i < 90) {
      str = "B";
    } else /*if (i <= 100) */ {
      str = "A";
    }
    return str;
  }

  public static void main(String[] args) {
    try {
      final Scanner in = new Scanner(System.in);
      System.out.printf("Enter i:  ");
      final int i = in.nextInt();
      final String s = estimateScore(i);
      System.out.print(s);
    } catch (/*Exception*/IllegalArgumentException e) {
      /**
       * try to catch only exception, expected to be thrown
       * you can miss something, if you use super class
       * also there can be a situation, when you have to change your flow
       * according to the exception was caught
       *
       * P.S. Here you could get exception of bad input (expected int, got String)
       */

      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      /**
       * here you can see another flow
       */

      /**
       * optionally provide more info in your message
       */
      System.out.println(
          "Failed to parse int." +
              (e.getMessage() != null ? " " + e.getMessage() : ""));
    }
  }
}