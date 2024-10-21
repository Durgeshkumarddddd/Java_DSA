 import java.util.Scanner ;
   class SortedOrGreater {

    // static void sortedArray(int[] arr){
    //     for(int i = 0 ; i < arr.length ; i ++){
    //         for(int j = i ; j< arr.length ; j++)
    //         if (arr[i] < arr[j]) {
    //         System.out.println("Not Sorted");
    //         }
    //         else {
    //             System.out.println("Sorted array");
    //         }
    //     } }
        
    
    static int[] strictlyGreater(int[] arr , int x){
       int count[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] > x){
                  count[i] = arr[i];
                }
        }
        return count ;
    }
    
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size of the array:");
   int n = sc.nextInt();
    int arr[] = new int[23];
    System.out.println("Enter array elemets:");
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    // int sorted = sortedArray(arr);
//    System.out.println(" Array is sorted :"+);   
   System.out.println("Enter No want to check Strictly greater:");
    int x = sc.nextInt();
    int newArr[] = new int[arr.length];
    newArr =strictlyGreater(arr , x); 
   System.out.println("Strictly greate No."+newArr);
}
}

