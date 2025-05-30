import java.util.*;
class maxSubArr {
    public static void main(String args[]){
        int[] arr = {1,2,3,-5,-3,5,6};
        int maxSum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            int currSum = 0 ; 
            for (int j = i ; j < arr.length ; j++) {
                currSum = currSum + arr[j];
                if (currSum > maxSum){
                    maxSum = currSum ;
                }
            }
        }
        System.out.println(maxSum);
    }
}
