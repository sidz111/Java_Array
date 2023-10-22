public class MaxofSumofSubArray {

    public static void Subarr(int numbers[]) {
        int CurrentSum = 0;
        int max_Sum = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                CurrentSum = 0;
                for (int k=i; k<=j; k++) {
                    //Sum of Sub Array 
                    CurrentSum += numbers[k];
                }
                System.out.println(CurrentSum);
                if (max_Sum < CurrentSum) {
                    max_Sum = CurrentSum;
                }
            }
                System.out.println("Maximum Sum : "+ max_Sum);
        }
    }


    public static void main(String[] args) {
        int Arr[] = {2,4,6,8,10};
        Subarr(Arr);
    }
}