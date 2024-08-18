package org.example.arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int [][] array = new int[3][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;
        array[2][0] = 70;
        array[2][1] = 80;
        array[2][2] = 90;

       // System.out.println("Length of the array is : "+ array.length);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }

        }
    }
}
