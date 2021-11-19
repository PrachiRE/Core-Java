import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: PRACHI
 * Date: 11/19/21
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */

// in input find the largese consecutive squence
    /// input 7 3 5 1 4 34 9 10

public class LargestConsecutiveSequence {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean > ();
        for(int val:arr){
             map.put(val,true);//true indicates begining of sequence ... initially we put true for all
         }
           //now we update the hashmap with values false if it is not begining of squence
          for(int val:arr){
              if(map.containsKey(val-1)){
                  map.put(val,false);
              }
          }
        //now lets search length of sequence
        int maxSequenceLength =0;
        int maxSeqStartPt =0;
        for(int val:arr){
            if(map.get(val)==true){
                int tempLength =1;
                int tempStartingPoint =val;

            while(map.containsKey(val+tempLength)) {
                tempLength++;
            }
            if(tempLength>maxSequenceLength){
                maxSequenceLength = tempLength;
                maxSeqStartPt =  tempStartingPoint;
            }
           }

        }
        System.out.println("Largest Squence starts at"+maxSeqStartPt);

        for(int i=0;i<maxSequenceLength;i++){
            System.out.println(maxSeqStartPt+i);
        }
    }
}
