import java.util.*;

public class LargestNumArray {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -Infinity.

        int smallest = Integer.MAX_VALUE; // +Infinity.
        for (int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+ smallest);
        return largest;
    }


    public static void main(String[] args) {
        int numbers[] = {1,2,4,-2,3,6,8,4};
        System.out.println("Largest value in Array is "+ largest(numbers));

    }
}