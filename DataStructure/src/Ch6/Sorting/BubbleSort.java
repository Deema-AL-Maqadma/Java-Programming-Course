package Ch6.Sorting;
// Deema Mohammed AL-Maqadma
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        bubbleSort(arr);
        System.out.println("Sorted Data ...");
        printArr(arr);

    }

}
