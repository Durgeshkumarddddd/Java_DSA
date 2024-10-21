import java.util.Scanner;

class partionOfSubarray {

     static boolean equalpartion(int[] arr){
        int prefSum = 0 ; 
        int suffixSum = 0 ;
        int n = arr.length ;
        int totalSum = findtotalSum(arr);
        for(int i = 0 ; i<n ; i++){
            prefSum += arr[i] ;
            suffixSum = totalSum - prefSum ;
            if(suffixSum == prefSum){
                return true ;
            }

        }
        return false ;
     }

     
   static int findtotalSum(int[] arr){
    int n = arr.length ;
    int total = 0 ;
    for(int i = 0 ; i<n ; i++){
        total += arr[i] ;
    }
    return total ;
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element :");
        int []arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Partition of sub array :");
       System.out.println( equalpartion(arr));
    }
}
