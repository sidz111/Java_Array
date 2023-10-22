// import java.util.*;

// public class BinarySearch {

//     public static int LinSearch(int numbers[] , int key) {
//         int start = 0, end = numbers.length-1;

//         while (start <= end) {
//             int mid = (start + end)/2;
//             //Comparisons

//             if (numbers[mid] == key) { //found
//                 return mid;
//             }

//             if (numbers[mid] < key) { //right
//                 start = mid + 1;
//             }
//             else {                //left
//                 end = mid -1 ;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to find the Index in Array : ");
//         int key = sc.nextInt();
//         int numbers[] = {1,2,3,4,5,6,6,5};
//         System.out.println("Index for key is : "+ LinSearch(numbers, key));
//     }
// }

import java.util.*;

public class BinarySearch {

    public static int BinSearch(int numbers[], int key) {
        int start = 0, end =numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;
                if (numbers[mid] == key) {
                    return mid;
                }
                if (numbers[mid] < key) {
                    start = mid +1;
                }
                else {
                    end = mid - 1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,6,87,9,5};
        int key = 3;
        System.out.println("Index is : "+ BinSearch(numbers, key));
    }
}