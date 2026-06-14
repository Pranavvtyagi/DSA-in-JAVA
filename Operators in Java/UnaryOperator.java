public class UnaryOperator {
    public static void main(String[] args) {
        int n = 12;
        int m = 28;

        // Pre-Incremenet Operator
        System.out.println(++n); // output 13
        System.out.println(n);
        // Post-Increment Operator
        System.out.println(m++); // output 28
        System.out.println(m);

        int x = n++; // 12
        System.out.println(n); //13
        System.out.println(x);


    }
    
}
