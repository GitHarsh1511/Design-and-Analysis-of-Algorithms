/*Write a program to implement heap sort. */
public class 3_HeapSort {
    public void sort(int arr[]) {
        int N = arr.length;
        // Build Heap
        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }

        // Extract an element from Heap
        for (int i = N - 1; i > 0; i--) {

            // Moving current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // calling max element of heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not a root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }

    }

    static void printArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 36, 22, 39, 10, 18, 14 };
        int N = arr.length;

        3_HeapSort ob = new 3_HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is : ");
        printArray(arr);
    }

}
