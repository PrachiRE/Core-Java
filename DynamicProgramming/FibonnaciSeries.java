package DynamicProgramming;

import java.util.Scanner;

public class FibonnaciSeries {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(calFib(n, new int [n+1]));

    }
    static int calFib(int n ,int valReady[] ){
        if(n==0 || n==1){
            return n;
        }
        if(valReady[n]!=0){
            return valReady[n];
        }
        int fibn = calFib(n-1,valReady);
        int fibm = calFib(n-2, valReady);
        valReady[n]= fibn+fibm; //Save the calculated value to avoid duplicate calculations
        return valReady[n];
    }
}
