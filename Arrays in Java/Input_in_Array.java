import java.util.*;

public class Input_in_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of Array size
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        
        //Taking input of n elements
        int arr [] = new int[n];
        System.out.println("Enter" + " " + n + " " + "Elements:" );
        for (int i =0 ; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Print Array of n Size
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}