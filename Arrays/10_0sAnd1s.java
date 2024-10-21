 import java.util.Scanner;
 class findarray  {
    // Using two pointer approach sort
    static int[] sortWithPointer(int[] arr){
        int left = 0 ; 
        int right = arr.length - 1 ;
        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left, right);
                left++ ;
                right-- ;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1 ){
                right-- ;
            }
        }
        return arr;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    static int[] sort(int[] arr){
        int x = count(arr);
        int n = arr.length ;
        for(int i = 0 ; i<n ; i++){
            if(i < x ){
                arr[i] = 0 ;
            }
            else{
                arr[i] = 1 ;
            }
        }
        return arr ;
    }
    static int count(int[] arr){
        int count = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] <= 0){
                count++ ;
            }
        }
        return count ;
    }
    static void printArr(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter arrays element as 0s and 1s ");
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int[] sort = sort(arr);
    System.out.print("sort array using count zeros : ");
        printArr(sort);
        System.out.println();
   // print sorted array with two pointer approach 
    System.out.print("Sorted array with two pointer approach :");
    int[] sortWpointer = sortWithPointer(arr);
    printArr(sortWpointer);

}
}