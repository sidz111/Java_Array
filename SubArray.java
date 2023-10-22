public class SubArray {

    public static void Subarr(int numbers[]) {
        for (int i=0; i<numbers.length; i++) {   // Loop for Starting point
            for (int j=i; j<numbers.length; j++) { // Loop for Ending point
                for (int k=i; k<=j; k++){ // Loop for print the Sub Arrays between them
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Subarr(arr);
    }
}