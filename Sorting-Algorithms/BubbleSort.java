package SortingAlgorithms;

//import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        //write your code here
        System.out.println("Array Length is : " +arr.length);
        int arrLen =arr.length;
        for(int i=1; i<arrLen;i++){
            for(int j=0;j<arrLen-i;j++){
                if(isSmaller(arr,j,j+1)){
                    swap(arr,j,j+1)  ;
                }
            }

        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("hello in bubblesort");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
       // System.out.println("here is my arr" +arr);
        bubbleSort(arr);
        print(arr);
    }

}
