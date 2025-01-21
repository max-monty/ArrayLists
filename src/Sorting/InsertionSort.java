package Sorting;
import java.util.ArrayList;

public class InsertionSort {

    public static void sort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
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