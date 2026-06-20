public class MultiArray{
    void Array_2D(){
        int [] [] Two_D_Array = new int [3] [3];
        // 0th Row 0,1,2 Column
        Two_D_Array[0][0] = 20;
        Two_D_Array[0][1] = 30;
        Two_D_Array[0][2] = 40;

        // 1st Row 0,1,2 Colum
        Two_D_Array[1][0] = 4;
        Two_D_Array[1][1] = 8;
        Two_D_Array[1][2] = 12;

        //2nd Row 0,1,2 Column
        Two_D_Array[2][0] = 81;
        Two_D_Array[2][1] = 9;
        Two_D_Array[2][2] = 18;

        for( int i = 0; i<3; i++){
            for(int j =0; j < 3; j++){
                System.out.println(Two_D_Array[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        MultiArray obj = new MultiArray();
        obj.Array_2D();
    }
}