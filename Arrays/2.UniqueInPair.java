import java.util.Scanner;

 class UniqueInPair {
   
   public static int uniqueInPair(int[] arr , int n){
         int unique  = 0;
         for(int i = 0 ; i<n ; i++){
          for(int j = i ; j<n ; j++) {
            if (arr[i]==arr[j]){
             arr[i]= -1 ;
             arr[j] = -1 ;
            } 
          }
         }
         for(int i = 0 ; i < n ; i++){
          if (arr[i]>0) {
            unique = arr[i];
          }
         }
         return unique;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");  
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter elements of array");
        for(int i = 0 ; i < n ; i++){
           arr[i]= sc.nextInt();
        }
         System.out.println("Unique element is :"+uniqueInPair(arr, n)); 
    }
}
