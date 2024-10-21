 import java.util.*;
 class suffixSum {
   static int[] findsuffixSum(int[] arr){
        int[] suffixsum = new int[arr.length];
        int n = arr.length - 1 ;
        suffixsum[n] = arr[n] ;
        for(int i = n-1 ; i >= 0 ; i--){
            suffixsum[i] = suffixsum[i+1] + arr[i];
        }
        return suffixsum ;
    }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    System.out.println("Enter array");
    int []arr = new int[n];
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Suffix Sum is : ");
    int[] suffixSum = findsuffixSum(arr);
    for(int i = 0 ; i<n ; i++){
        System.out.print(suffixSum[i]+"  ");
    }
 }   
}
