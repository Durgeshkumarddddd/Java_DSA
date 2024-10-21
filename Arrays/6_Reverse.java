import java.util.Scanner;
class Reverse {
    public static int[] reverse(int[] arr){
        int j = 0 ;
        int n = arr.length ;
        int[] ans = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
               ans[j++] = arr[i];
        }
        return ans ;
    }
    static void swap(int[] arr , int i ,int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static int[] withoSpaceReverse(int[] arr){
        int j = arr.length-1;
        int i = 0 ;
        while (i < j) {
            swap(arr,i,j);
            i++ ;
            j-- ;
        }
        return arr ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter Arrays elements");
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] reverse = reverse(arr);
        System.out.println("reverse with in anotherArr last to first traversal :");
        for(int i = 0 ; i< n ; i++){
           System.out.print(reverse[i]+" ");
        }
        System.out.println();
        
        System.out.println("reverse without using secondArray :");
       int [] reverseWithoSpace = withoSpaceReverse(arr) ;
        for(int i = 0 ; i < n ; i++){
            System.out.print(reverseWithoSpace[i]+" ");
        }
    }
}
