package SelectionSort;

class MySelectionSort {
    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MySelectionSort mySelectionSort = new MySelectionSort();

        int[] array1 = {64, 25, 12, 22, 11};
        int[] array2 = {21, 2, 4, 6, 78, 4, 9, 12, 19};

        mySelectionSort.sort(array1);
        mySelectionSort.sort(array2);

        System.out.println("Sorted array1:");
        mySelectionSort.printArray(array1);
        System.out.println("\nSorted array2:");
        mySelectionSort.printArray(array2);
    }
}
