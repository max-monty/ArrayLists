package Sorting;
import java.util.ArrayList;

public class SelectionSort {
    
    public static void sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(4); 
        arr.add(6);
        arr.add(1);
        arr.add(3);
        sort(arr);
        System.out.println(arr);
    }
}