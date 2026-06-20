public class CopyArray{
    
        
    
    static void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

        public static void main(String[] args) {

        int [] arr_1 = new int[5];
        arr_1[0] = 20;
        arr_1[1] = 30;
        arr_1[2] = 40;
        arr_1[3] = 50;
        arr_1[4] = 60;

        int [] arr_2 = arr_1;

        arr_2[0] = 18;
        arr_2[1] = 9;
        //Original Array
        printArray(arr_1);

        //Duplicate Array
        System.out.println();
        printArray(arr_2);

    }
}
