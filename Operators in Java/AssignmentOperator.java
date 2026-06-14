public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 5;
        int b;

        b = a;

        // += 
        a += b; // a+=b ........... a = a+b
        System.out.println(a); // a = 5 + 5 = 10

        //-=
        a-=b; // a-=b ........... a = a-b
        System.out.println(a); // a = 10 - 5 = 5

        // *=
        a *= b; // a = a*b
        System.out.println(a); // a = 5 * 5 = 25

        // /=
        a /= b; // a = a/b
        System.out.println(a); // a = 25 / 5 = 5

    }
}
