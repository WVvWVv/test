package com.example.com.example.com.example;

/**
 * Created by aurora on 12/1/15.
 */
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        int i;
        int j=0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.printf("Enter i exсept %d:  ",j);
            i = in.nextInt();
            j++;
        }
        while(i!=(j-1));
    }
}
