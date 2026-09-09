package Ch6.Sorting;

public class MergeSort {
// Deema Mohammed AL-maqadma
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        if (n <= 1) {
            return;
        }
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);

    }

    public static void merge(int[] arr, int[] right, int[] left) {
        int i = 0; //left
        int j = 0; //right
        int k = 0;//arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[j];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }

        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
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
        mergeSort(arr);
        System.out.println("Sorted Data ...");
        printArr(arr);

    }

}
