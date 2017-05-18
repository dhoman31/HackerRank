/*
author @ Daniel Homan
18-05-2017
Simple inefficient solution to the Stock Merchant HackerRank problem
*/

import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        boolean array[] = new boolean[101];

        for(int i=0; i<array.length; i++){
            array[i] = false;
        }

        for(int i =0; i<n; i++) {
            int c = in.nextInt();
            if(array[c]){
                counter++;
                array[c] = false;
            }else{
                array[c] = true;
            }
        }

        System.out.println(counter);

    }
}
