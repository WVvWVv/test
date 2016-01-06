package com.example.second;

/**
 * Created by aurora on 12/1/15.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {

  public static void main(String[] args) {
    try {
      final Scanner in = new Scanner(System.in);
      System.out.printf("1.Soda\n2.Water\n3.Cola\n4.Tea\n5.Coffee\n");
      System.out.printf("Enter i:  ");
      final int i = in.nextInt();
      final String str;
      switch (i) {
        case 1:
          str = "Soda";
          break;
        case 2:
          str = "Water";
          break;
        case 3:
          str = "Cola";
          break;
        case 4:
          str = "Tea";
          break;
        case 5:
          str = "Coffee";
          break;
        default:
          str = "Error";
          break;
      }
      System.out.printf(str);
    } catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println(
              "Failed to parse int." +
                      (e.getMessage() != null ? " " + e.getMessage() : ""));
    }
  }
}
