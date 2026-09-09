package Ch6.Sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = Partion(arr, low, high);
            quickSort(arr, 0, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    public static int Partion(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];//pivot
        arr[high] = temp;
        return i + 1;

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
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Data ...");
        printArr(arr);

    }

}
