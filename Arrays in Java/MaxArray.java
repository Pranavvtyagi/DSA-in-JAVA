public class MaxArray{
    void maxElementOfArray(){
        int [] arr = { 2 , 6 , 8 , 10 , 1 , 18 };
        int max = 0;
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = max + arr[i];
            }
        }
        System.out.println("Max element from the Array is: " + max);
    }
public static void main(String[] args) {
    MaxArray obj = new MaxArray();
    obj.maxElementOfArray();
}
}