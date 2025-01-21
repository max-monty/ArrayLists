package ArrayListTraversals;

import java.util.ArrayList;

public class ArrayListTraversalDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        printListForEach(list);
        System.out.println("--------------------------------");
        printListFor(list);
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
}
