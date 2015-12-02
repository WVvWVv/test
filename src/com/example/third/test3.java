package com.example.third;

/**
 * Created by aurora on 12/1/15.
 */

import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {

    /**
     * it can be collapsed to:
     * int i, j = 0;
     */
    int i;
    int j = 0;
    do {
      final Scanner in = new Scanner(System.in);
      System.out.printf("Enter i except %d:  ", j);
      i = in.nextInt();
      j++;
    } while (i != (j - 1));
  }
}
