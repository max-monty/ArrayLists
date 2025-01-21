package Traversals;

import java.util.ArrayList;

public class ArrayListTraversalDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original list:");
        printListForEach(list);
        
        System.out.println("\nRemoving elements containing 'e'...");
        removeElementsSafelyBackwards(list);
        // removeElementsSafelyForwards(list);
        // removeElementsSafelyWhile(list);
        
        System.out.println("\nList after removal:");
        printListForEach(list);
    }

    public static void printListForEach(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void printListFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void removeElementsSafelyBackwards(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("e")) {
                System.out.println("Removing: " + list.get(i));
                list.remove(i);
            }
        }
    }

    public static void removeElementsSafelyForwards(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("e")) {
                System.out.println("Removing: " + list.get(i));
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeElementsSafelyWhile(ArrayList<String> list) {
        int index = 0;
        while (index < list.size()) {
            if (list.get(index).contains("e")) {
                System.out.println("Removing: " + list.get(index));
                list.remove(index);
            } else {
                index++;
            }
        }
    }
}
