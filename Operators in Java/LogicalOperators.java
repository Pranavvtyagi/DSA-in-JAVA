public class LogicalOperators {
    public static void main(String[] args) {
        int p = 10; int q = 25; int r = 30;

        // AND (&&) operator 
        System.out.println((p>q) && (p>r) && (p<q)); // False if any one conditon is false
        System.out.println((p<r) && (p<q) && (p!=r)); // True if all conditons are True

        // OR (||) operator
        System.out.println((p<r) || (p>q) || (p==r)); // True if any one condition is True
        System.out.println((p>r) || (p>q) || (q>r)); // False only if all conditons are False

        // NOT (!) operator
        System.out.println(!(p>r)); // Reverse the Conditon (if True~False  if False~True)
        System.out.println(!(q>r));
    }
}
