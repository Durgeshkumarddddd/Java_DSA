import java.util.Scanner; 
class squareofNonDecrementno {
    static int[] squareNo(int[] arr) {
        int n = arr.length ;
        int j = arr.length-1 ;
       int i = 0 ;
       int k = n-1 ;
       int[] ans = new int[n];
       while(i<=j){
        if(Math.abs(arr[i]) > Math.abs(arr[j])){
           ans[k--] = arr[i] * arr[i] ;
           i++ ;
        }
        else{
            ans[k--] = arr[j] * arr[j] ;
            j-- ;
        }
       }
         return ans ;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array :");
       int n = sc.nextInt();
       System.out.println("Enter non decrement no:");
       int[] arr = new int[n];
       for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
       }
       System.out.println("Square of non decrement No is :");
       int[] squareofNonDe = squareNo(arr);
       for(int i = 0 ; i<n ; i++){
        System.out.print(squareofNonDe[i]+ "  ");
       } 
    
    }
}
