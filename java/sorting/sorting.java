// package sorting;

// public class sorting {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7, 8, 3, 1, 2};
//         // sorting in java 
//         // bubble sort
//         // time complexity: O(n^2)
//         // space complexity: O(1)
//         // int arr[] = {7, 8, 3, 1, 2};
//         // for (int i = 0; i < arr.length-1; i++) {
//         //     for (int j = 0; j < arr.length-i-1; j++) {
//         //         if (arr[j] > arr[j+1]) {
//         //             // swap
//         //             int temp = arr[j];
//         //             arr[j] = arr[j+1];
//         //             arr[j+1] = temp;
//         //         }
//         //     }
//         // }
//         // printArray(arr);
        
//         // selection sort
//         // time complexity: O(n^2)
//         // space complexity: O(1)
//         // int arr[] = {7, 8, 3, 1, 2};
//         // for (int i = 0; i < arr.length-1; i++) {
//         //     int smallest = i;
//         //     for (int j = i+1; j < arr.length; j++) {
//         //         if(arr[smallest] > arr[j]) {
//         //             smallest = j;
//         //         }
//         //     }
//         //     int temp = arr[smallest];
//         //     arr[smallest] = arr[i];
//         //     arr[i] = temp;
//         // } 
//         // printArray(arr);
        
//         // insertion sort
//         // time complexity: O(n^2)
//         // space complexity: O(1)
//         // for (int i = 1; i < arr.length; i++) {
//         //     int current = arr[i];
//         //     int j = i-1;
//         //     while (j >= 0 && arr[j] > current) {
//         //         arr[j+1] = arr[j];
//         //         j--;
//         //     }
//         //     // when the while loop ends, j is at the position where current should be inserted
//         //     // so we insert current at j+1
//         //     arr[j+1] = current;
//         // }
//         // printArray(arr);

//     }
// }
