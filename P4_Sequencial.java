/*Write a program to search given element from an array using sequential search and binary 
search. Analyze the time complexity for best, average and worst case.  */

public class SequentialSearch {

    /**
     * Searches for an element in the array using sequential search.
     *
     * @param array the array to search in
     * @param target the element to search for
     * @return the index of the element if found, -1 otherwise
     */
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // element found, return index
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 18, 23, 38, 56, 72, 91};
        int target = 18;

        int result = sequentialSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }

        // Time Complexity Analysis
        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(n)");
        System.out.println("Worst Case: O(n)");
    }
}


// public class SequentialBinarySearch {

//     /**
//      * Searches for an element in the sorted array using sequential binary search.
//      *
//      * @param array the sorted array to search in
//      * @param target the element to search for
//      * @return the index of the element if found, -1 otherwise
//      */
//     public static int sequentialBinarySearch(int[] array, int target) {
//         int left = 0;
//         int right = array.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (array[mid] == target) {
//                 return mid; // element found, return index
//             } else if (array[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return -1; // element not found
//     }

//     public static void main(String[] args) {
//         int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
//         int target = 23;

//         int result = sequentialBinarySearch(array, target);

//         if (result!= -1) {
//             System.out.println("Element found at index " + result);
//         } else {
//             System.out.println("Element not found in the array");
//         }

//         // Time Complexity Analysis
//         System.out.println("\nTime Complexity Analysis:");
//         System.out.println("Best Case: O(1)");
//         System.out.println("Average Case: O(log n)");
//         System.out.println("Worst Case: O(log n)");
//     }
// }
