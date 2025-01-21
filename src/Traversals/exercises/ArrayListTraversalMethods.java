package Traversals.exercises;

import java.util.ArrayList;

public class ArrayListTraversalMethods {
    public static void main(String[] args) {
        // Test all exercise methods
        testExercises();
    }

    public static void testExercises() {
        // Test 1: Remove all even-length strings
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("cat");
        test1.add("dog");
        test1.add("mouse");
        test1.add("bird");
        System.out.println("Exercise 1 - Remove even-length strings");
        System.out.println("Before: " + test1);
        removeEvenLengthStrings(test1);
        System.out.println("After: " + test1);
        System.out.println();

        // Test 2: Double all strings containing 'a'
        ArrayList<String> test2 = new ArrayList<>();
        test2.add("cat");
        test2.add("dog");
        test2.add("rabbit");
        test2.add("bird");
        System.out.println("Exercise 2 - Double strings containing 'a'");
        System.out.println("Before: " + test2);
        doubleStringsWithA(test2);
        System.out.println("After: " + test2);
        System.out.println();

        // Test 3: Remove duplicates
        ArrayList<String> test3 = new ArrayList<>();
        test3.add("cat");
        test3.add("dog");
        test3.add("cat");
        test3.add("bird");
        test3.add("dog");
        System.out.println("Exercise 3 - Remove duplicates");
        System.out.println("Before: " + test3);
        removeDuplicates(test3);
        System.out.println("After: " + test3);
    }

    /**
     * Exercise 1: Remove all strings of even length from the ArrayList
     * For example: ["cat", "dog", "mouse", "bird"] → ["cat", "mouse"]
     */
    public static void removeEvenLengthStrings(ArrayList<String> list) {
        // TODO: Implement this method
        // Remember to use safe traversal when removing elements!
    }

    /**
     * Exercise 2: For each string containing the letter 'a',
     * add another copy right after it
     * For example: ["cat", "dog", "rabbit"] → ["cat", "cat", "dog", "rabbit", "rabbit"]
     */
    public static void doubleStringsWithA(ArrayList<String> list) {
        // TODO: Implement this method
        // Be careful about modifying the list while traversing!
    }

    /**
     * Exercise 3: Remove all duplicate strings from the ArrayList
     * Keep only the first occurrence of each string
     * For example: ["cat", "dog", "cat", "bird", "dog"] → ["cat", "dog", "bird"]
     */
    public static void removeDuplicates(ArrayList<String> list) {
        // TODO: Implement this method
        // Think about how to keep track of strings you've already seen
    }
} 