package org.example.arrays;

public class AddingMultidimentionalArrya {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] array2 = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
int [][] result  = new int [3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j]+array2[i][j];
            }
        }
        System.out.println("Addition of array is ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


}
