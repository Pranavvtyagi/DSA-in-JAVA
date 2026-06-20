import java.util.*;

class object{
    public static int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of 2 numbers is: ");
        Sum(a, b);
    }
}