package com.interview.task114;

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(matrix.length);
        System.out.println("4x4=" + countDiagonalSum(matrix));

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr.length);
        System.out.println("3x3=" + countDiagonalSum(arr));


    }

  public static int countDiagonalSum(int[][] matrix) {
      int sum = 0;
      for (int i = 0, j = matrix.length-1; i < matrix.length; i++, j--) {
          sum += matrix[i][i];
          if (j != i) sum += matrix[i][j];
      }
      return sum;

  }

}
