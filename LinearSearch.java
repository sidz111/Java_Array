import java.util.*;

public class LinearSearch {

    public static int Search(int numbers[], int key) {
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the Index of that perticular number in Array : ");
        int key = sc.nextInt();
        int number[] = {2,3,5,3,6,8,9,12,45};
        int index = Search(number, key);
        if (index == -1) {
            System.out.println("Number is not valid");
        }
        else{
            System.out.println("The Index is " + index);
        }
    }
}