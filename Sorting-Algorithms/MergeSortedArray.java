package SortingAlgorithms;
import java.util.*;

public class MergeSortedArray {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int arrayLength =a.length + b.length;
        int [] resultArray = new int[arrayLength];
        int indexA=0 , indexB =0, indexR =0;
        while(indexA != a.length && indexB!=b.length){
            if(a[indexA]<b[indexB]){
                resultArray[indexR] = a[indexA];
                indexA++;
            }
            else if(a[indexA]>b[indexB]){
                resultArray[indexR] = b[indexB];
                indexB++;
            }
            else {
                resultArray[indexR] = a[indexA];
                indexR++;
                resultArray[indexR] = b[indexB];
                indexA++;
                indexB++;
            }
            indexR++;

        }
        while(indexA!=a.length){
            resultArray[indexR] = a[indexA];
            indexA++;
            indexR++;
        }
        while(indexB!=b.length){
            resultArray[indexR] = a[indexB];
            indexB++;
            indexR++;
        }

        return resultArray;
    }

    public static void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }

}

