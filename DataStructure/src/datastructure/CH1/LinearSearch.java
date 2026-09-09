package datastructure.CH1;

public class LinearSearch {

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearSearch(num, 22);
    }

    public static void linearSearch(int[] arr, int target) {
        boolean isFaound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isFaound = true;
                break;
            }

        }
        if (isFaound) {
            System.out.println("Target : " + target + "is Faound");
        } else {
            System.out.println("Target : " + target + "is NOT Faound");
        }

    }
}

