package com.example.first;

/**
 * Created by aurora on 12/1/15.
 */

import java.util.Scanner;

public class test1 {

  public static void main(String[] args) {

    /**
     * Everything that can be final -- must be final.
     */

    final Scanner in = new Scanner(System.in);
    System.out.printf("Enter i:  ");

    // incorrect input isn't handled
    final int i = in.nextInt();
    System.out.println(i);
    final String str;

    /**
     * if block processes sequentially, from top to bottom
     * after first true block it doesn't process anything else
     */
    if (i >= 0 && i < 60) {
      str = "F";
    } else if (i < 70) {
      str = "D";
    } else if (i < 80) {
      str = "C";
    } else if (i < 90) {
      str = "B";
    } else if (i <= 100) {
      str = "A";
    } else {
      str = "Estimate is not correct";
    }
    System.out.println(str);
  }
}
