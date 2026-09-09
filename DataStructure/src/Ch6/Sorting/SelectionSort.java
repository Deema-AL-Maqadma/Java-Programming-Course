package Ch6.Sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1 ; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
        selectionSort(arr);
        System.out.println("Sorted Data ...");
        printArr(arr);

    }

}
