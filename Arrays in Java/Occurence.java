import java.util.*;
public class Occurence{

    static int countfrequency(int [] arr ,int n , int occ){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr [i] == occ ){
                count ++;
            }
        }
        System.out.println("The occurenece of " + occ + " is " + count + " times.");
        return count;
        
    }

    static void printArray(int [] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input size of Array from user
        System.out.println("Enter size od Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //Enter elements of array from user
        System.out.println("Enter " + n + " elements");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //Print Array
        printArray(arr);

        //Enter the element whose occuerence has to be count
        System.out.println("Enter elements whose occurenece is to be count: ");
        int occ = sc.nextInt();
         // Check occurenece
         countfrequency(arr, n, occ);
    }
}