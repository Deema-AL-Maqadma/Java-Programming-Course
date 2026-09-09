package TransformAndConqer;

import java.util.Arrays;

public class PresortingSearch {

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 2, 9, 3, 5};
        Arrays.sort(arr); // O(n log n) - ترتيب المصفوفة

        int key = 7;
        int index = Arrays.binarySearch(arr, key); // O(log n) - بحث ثنائي

        if (index >= 0) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found");
        }
    }
}
