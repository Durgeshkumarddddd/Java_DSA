import java.util.Scanner;
class RotateArray {
    static int[] rotateArray(int[] arr , int k){
        int n = arr.length ;
        k = k % n ;
        int j = 0 ;
        int[] ans = new int[n] ;
      for(int i = n-k ; i< n ; i++){
        ans[j++] = arr[i] ;
      }
      for(int i = 0 ; i < n-k ; i++){
        ans[j++] = arr[i];
      }
      return ans ;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        System.out.println("Enter Numbers :");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Rotate number :");
        int k = sc.nextInt();
        System.out.println("Before Rotate Array");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int[] ans =  rotateArray(arr,k);
        System.out.print("After Rotate Array :");
        for(int i = 0 ; i < n ; i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
