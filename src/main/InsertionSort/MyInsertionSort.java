package InsertionSort;

public class MyInsertionSort {

    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {12, 11, 13, 5, 6};
        int[] array2 = {3,7,1,0,15,8,2,17,4,7};

        MyInsertionSort myInsertionSort = new MyInsertionSort();
        myInsertionSort.sort(array1);
        myInsertionSort.sort(array2);

        System.out.println("The sorted array1:");
        printArray(array1);
        System.out.println("\nThe sorted array1:");
        printArray(array2);
    }
};
