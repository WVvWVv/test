package com.example.fourth;

/**
 * Created by aurora on 12/5/15.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test4 {

  public static void main(String[] args) {

    try {

      /**
       * everything that can be final, must be final
       */
      final Map/*HashMap*/<Integer, Integer> pancakes = new HashMap<>();//new HashMap<Integer, Integer>(); // you're able to use diamond syntax and write <>
      final Scanner in = new Scanner(System.in);

      //for (int i = 1; i < 11; i++) {
      for (int i = 0; i < 10; i++) {
        //System.out.printf("Enter j " + (i + 1) + ": ");
        System.out.printf("Enter j %d: ", (i + 1)); // since it's printF
        final int j = in.nextInt(); // 1) final 2) non-secure input
        pancakes.put(i, j);
      }


      for (Integer pan : pancakes.keySet()) {
        System.out.println(pan + "," + pancakes.get(pan));
      }


      //Map/*HashMap*/<Integer, Integer> pancakesSorted;     //pancakes_sorted;//new HashMap<Integer, Integer>(); // unused object, since you're creating new
      //pancakesSorted = sortByValues(pancakes);             // here

      // can be simplified to:
      final Map<Integer, Integer> pancakesSorted = sortByValues(pancakes);

      System.out.println("\nSorted");
      for (Integer panS/*pan_s*/ : pancakesSorted.keySet()) {
        System.out.println(panS + "," + pancakesSorted.get(panS));
      }

      System.out.println("Minimum");
      final Integer min = Collections.min(pancakes.values());
      //System.out.println(min + "," + pancakes.get(min)); // !!! logic mistake, you found min value, but it's value, not a key !!!

      System.out.println("you have to find key :)" + "," + min);

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage()); // try to do more in catch blocks
    } catch (InputMismatchException e) {
      System.out.println(
          "Failed." +
              (e.getMessage() != null ? " " + e.getMessage() : ""));
    }

  }

  //private static HashMap sortByValues(HashMap map) {
  private static Map<Integer, Integer> sortByValues(Map<Integer, Integer> map) { // interfaces with generics, be sure, which type is inside Map<>
    //List list = new LinkedList(map.entrySet()); // use generics
    final List<Map.Entry<Integer, Integer>> list = new ArrayList/*LinkedList*/<>(map.entrySet()); // prefer ArrayList over LinkedList

    /**
     * ha-ha, comment :)
     */
    // Defined Custom Comparator here

    // your comparator:
    /*Collections.sort(list, new Comparator() {
      public int compare(Object o1, Object o2) {
        return ((Comparable) ((Map.Entry) (o1)).getValue())
            .compareTo(((Map.Entry) (o2)).getValue());
      }
    });*/

    // this version is much beautiful:
    /*Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    });*/

    // but lambda-version is even much beautiful
    Collections.sort(list, (first, second) -> first.getValue().compareTo(second.getValue()));

    final Map<Integer, Integer>/*HashMap*/ sortedHashMap = new LinkedHashMap<>(); // nice decision
    //for (Iterator it = list.iterator(); it.hasNext(); ) {
    for (Map.Entry<Integer, Integer> entry : list) { // use foreach if you can
      //Map.Entry entry = (Map.Entry) entry;
      sortedHashMap.put(entry.getKey(), entry.getValue());
    }
    return sortedHashMap;
  }
}
