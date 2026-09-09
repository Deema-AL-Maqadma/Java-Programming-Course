package datastructure.CH1;
// Deema Mohammed AL-Maqadma
public class BinarySearch {
    public static void binarySearch(int[] arr, int target) {
        int left = 0; // ترتيب العنصر الأول
        int right = arr.length - 1; // ترتيب العنصر الأخير
        boolean isFaound = false;

        while (left <= right) {
            int mid = left + (right - left) / 2; //ترتبب العنصر الاوسط

            if (arr[mid] == target) {
                isFaound = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (isFaound) {
            System.out.println("Target : " + target + "is Faound");
        } else {
            System.out.println("Target : " + target + "is NOT Faound");
        }

    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch(num, 3);
    }

}
