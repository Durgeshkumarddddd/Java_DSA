 import java.util.Scanner; 
 class OccuranceFind {
    static int occuranceNumber(int arr[] , int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==x){
                count ++ ;
            }}
        return count ;
    }  
    static int LastOccurance(int arr[], int x){
      int lastOccurance = 0 ;
      for(int i = 1 ; i< arr.length ; i++){
        if(arr[i]==x) {
          lastOccurance = i ;
        }
      }
      return lastOccurance+1 ;
    }

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of the array");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter numbers :");
     for(int i = 0; i< n ; i++){
        arr[i] = sc.nextInt();
     }
     System.out.println("Enter occurance no.");
     int x = sc.nextInt();
     System.out.println("Occurance count : "+occuranceNumber(arr , x));
     System.out.println("Last Occurance at position : "+LastOccurance(arr, x));
    }
}
