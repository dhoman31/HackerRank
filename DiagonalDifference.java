/*
author @ Daniel Homan
17-05-2017

finds the difference between the two diagonals in a 2D array
*/

import java.util.Scanner;

public class DiagonalDifference{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[][] = new int[n][n];
    int x = 0;  //sum of main diagonal

    //fill the array
    for (int i=0; i<array.length; i++) {
      for (int j=0; j<array[0].length; j++) {
        array[i][j] = sc.nextInt();
        if(i==j){
          x+=array[i][j]; //gives value of main diagonal
        }
      }
    }

    System.out.println(find(array, x));

  }

//find the difference in the diagonal
  public static int find(int[][] array, int b){
    int a=0;
    int x=0, y=array.length-1;

    for(int i=0; i<array.length; i++){
      a+=array[x][y];
      x++;
      y--;
    }

    return Math.abs(a-b);
  }
}
