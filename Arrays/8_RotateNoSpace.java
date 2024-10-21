 import java.util.*; 
 class RotatewithoExtarr {
    static int[] swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp ;
        return arr ;
    }
    static int[] reverse(int[] arr,int i ,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j-- ;
        }
        return arr ;
    }

    static int[] rotateArray(int[] arr , int k){
        int n = arr.length-1 ;
        k = k%n ;
        reverse(arr,0 ,n-k);
        reverse(arr,n-k+1,n);
        reverse(arr,0 , n);
        return arr ;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
     int n = sc.nextInt();
     System.out.println("Enter array elements");
     int arr[] = new int[n];
     for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt() ;
     }
     System.out.println("Enter rotate no :");
     int k = sc.nextInt();
     System.out.println("After Rotate No :");
     int[] ans =  rotateArray(arr , k);
     for(int i = 0 ; i<n ; i++){
        System.out.print(ans[i]);
     }

    }
}
