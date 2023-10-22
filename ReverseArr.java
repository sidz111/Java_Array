import java.util.*;

public class ReverseArr {

    public static void Reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.print("Original Array is : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Reverse(arr);
            System.out.print("Reversed Array is : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}