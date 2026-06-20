import java.util.*;
public class lastOccurr{

    //Printing Array
    static void printArray(int [] arr){
        for ( int i = 0 ; i < arr.length; i++ ){
        System.out.print(arr[i] + " ");
        }
    }

    //Taking element to check last Occurrence
    static int lastOccElement(int [] arr , Scanner sc){
        System.out.println("Enter the element to check it's last Occcurrence :  ");
        int x = sc.nextInt();
        return x;
    }

    //Checking last Occurrence
    static int checkLastOcc(int [] arr , int x){
         int lastIndex = -1;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println("The Element " + x + "was last occurred at index " + lastIndex);
        return lastIndex;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Input class
        //Taking size of Array from user
        System.out.print("Enter the size of Array :  ");
        int n = sc.nextInt();
        int [] arr = new int[n]; //Declarimg Array

        //Taking elements of Array from user
        System.out.println("Enter Array Elements: ");
        for ( int i = 0 ; i < arr.length ; i++){
            arr [i] = sc.nextInt();
        }

        printArray(arr);

        int x = lastOccElement(arr, sc);
    
        checkLastOcc(arr, x);

        sc.close();
    }
}