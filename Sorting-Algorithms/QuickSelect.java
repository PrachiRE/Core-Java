package SortingAlgorithms;

import java.util.Scanner;

public class QuickSelect {

    public static int quickSelect(int [] arr, int lo,int hi, int k){
        int pivot = arr[hi];
        int pivotIndex =partition(arr,pivot,lo,hi);
        if(pivotIndex <k){
            return quickSelect(arr,pivotIndex+1,hi,k);
        }
        else if(pivotIndex>k){
            return quickSelect(arr,lo,pivotIndex-1,k);

        }
        else {
            return arr[k];
        }

    }
    public static int partition(int [] arr,int pivot, int lo,int hi){
        int i =lo, indexBelowPivot=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,indexBelowPivot);
                i++;
                indexBelowPivot++;
            }
            else{
                i++;
            }
        }
        return indexBelowPivot-1    ;
    }
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
    }

}
