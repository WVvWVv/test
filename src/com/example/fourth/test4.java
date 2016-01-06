package com.example.fourth;

/**
 * Created by aurora on 12/5/15.
 */
import java.util.*;

public class test4 {

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        HashMap sortedHashMap = new LinkedHashMap();
        for(Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }


    public static void main(String[] args) {
        try {
            HashMap<Integer, Integer> pancakes = new HashMap<Integer, Integer>();
            final Scanner in = new Scanner(System.in);
            for (int i=1; i<11;i++) {
                System.out.printf("Enter j "+i+": ");
                int j = in.nextInt();
                pancakes.put(i, j);
            }
            for (Integer pan: pancakes.keySet()) {

                System.out.println(pan + "," + pancakes.get(pan));

            }

            HashMap<Integer, Integer> pancakes_sorted = new HashMap<Integer, Integer>();
            pancakes_sorted  = sortByValues(pancakes);
            System.out.println("\nSorted");
            for (Integer pan_s: pancakes_sorted.keySet()) {

                System.out.println(pan_s + "," + pancakes_sorted.get(pan_s));

            }

            System.out.println("Minimum");
            Integer min = Collections.min(pancakes.values());
            System.out.println(min+","+pancakes.get(min));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(
                    "Failed." +
                            (e.getMessage() != null ? " " + e.getMessage() : ""));
        }

    }

}
