package com.company;

public class Main {

    public static void main(String[] args) {

         int[][] field = {{1, 2, 3, 4, 5, 6},
                          {7, 8, 9, 10, 11, 12},
                          {13, 14, 15, 16, 17, 18},
                          {19, 20, 21, 22, 23, 24}};

         //System.out.println(field.length);
         //System.out.println(field[3].length);

         for(int i = 0; i < field.length; i++) {
             for(int j = 0; j < field[i].length; j++) {
                 System.out.print(field[i][j] + ", ");
             }
             System.out.println();
         }

    }
}
