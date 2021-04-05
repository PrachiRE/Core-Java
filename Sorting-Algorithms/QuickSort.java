package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int arr[], int lo, int hi){
        if(lo>=hi){
            return;
        }

        int pivot = arr[hi];
        int pivotIndex  = partition(arr, pivot,lo, hi); //sort the hi element
        quickSort(arr,lo,pivotIndex-1);
        quickSort(arr,pivotIndex+1,hi);
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int partition(int [] arr, int pivot, int lo, int hi){
        int i =lo, indexBelowPivot=lo;
        while(i<= hi)
        {

            if(arr[i]<=pivot){
                swap(arr,i,indexBelowPivot);
                i++;
                indexBelowPivot++;
            }
            else{
                i++;
            }
        }

        print(arr);
        return indexBelowPivot-1;

    }
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
