package TransformAndConqer;

import java.util.Arrays;

public class ElementUniqueness {

    public static boolean hasDuplicates(int[] arr) {
        Arrays.sort(arr); // ترتيب المصفوفة لتجميع العناصر المتكررة
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true; // إذا وجد عنصرين متتاليين متساويين
            }
        }
        return false; // لا يوجد تكرار
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 2, 9, 3, 5, 3};
        System.out.println("Duplicates? " + hasDuplicates(arr));
    }
}
