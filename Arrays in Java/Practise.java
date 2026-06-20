public class Practise{
    void Length(){
        int [] ages = {2 , 4 , 6 , 8 , 10 , 12 , 14};
        float [] Weight = {56.5f, 60.8f , 65.0f};
        String [] Names = {"Pranav" , "Anshika" , "Tyagi" , "Sharma"};

        System.out.println(ages.length);
        System.out.println(Weight.length);
        System.out.println(Names.length);

    }
    public static void main(String[] args) {
        Practise obj1 = new Practise();
        obj1.Length();
    }
}