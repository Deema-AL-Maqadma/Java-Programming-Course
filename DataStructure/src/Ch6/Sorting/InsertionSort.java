package Ch6.Sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -");
        }
        System.out.println("\b\b ");
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 3};
        System.out.println("Original Data ...");
        printArr(arr);
        insertionSort(arr);
        System.out.println("Sorted Data ...");
        printArr(arr);

    }

}
