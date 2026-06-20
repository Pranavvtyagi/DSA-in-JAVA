public class PrintingArray {
    void WaysToPrintArray(){
        int [] arr = {1 , 2 , 3 , 4 , 5};

        //For Loop
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

        //For Each Loop
        for(int x : arr){
            System.out.println(x); //Limitation : All Elements of the Array will be printed
        }

        //While Loop
        int i = 0;
        while(i < 5){
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        PrintingArray obj = new PrintingArray();
        obj.WaysToPrintArray();
        
    }
}
